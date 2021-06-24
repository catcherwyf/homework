# 在mac上使用docker部署mysql主从复制
[TOC]

## 安装docker
mac上docker的安装比较简单，网上资料很多，这里就不赘述了。

## docker搭建mysql主从复制
首先通过docker拉取mysql镜像，这里制定了5.7版本，不指定会拉取最新版本。

`docker pull mysql:5.7`

通过此镜像启动容器，这里只配置一主一从的模式
### master 主
```
docker run --name mastermysql -d mysql:5.7 -p 3316:3306 -e MYSQL_ROOT_PASSWORD=123456

# --name 指定容器名称
# -d     指定镜像名称
# -p     指定端口映射关系，本机3316端口对应容器内3306
# -e MYSQL_ROOT_PASSWORD= 指定容器内root用户密码
```
### slave 从
`docker run --name slavemysql -d mysql:5.7 -p 3326:3306 -e MYSQL_ROOT_PASSWORD=123456`

## 配置主数据库
进入容器
`docker exec -it mastermysql /bin/bash`
更新apt-get软件库
`apt-get update`
安装vim，用于下面配置文件的编辑
`apt-get install vim`
编辑配置文件`vi /etc/mysql`，新增如下配置，server_id不一致即可，主数据库log_bin要开启才能同步数据。
```
##master
[mysqld]
server_id = 1

sql_mode=NO_ENGINE_SUBSTITUTION,STRICT_TRANS_TABLES 
log_bin=mysql-bin
binlog-format=Row
```
配置完成之后，需要重启mysql服务使配置生效。使用`service mysql restart`完成重启。重启mysql服务时会使得docker容器停止，我们还需要`docker start mastermysql`启动容器。

在主数据库创建用户用于同步数据
`CREATE USER 'repl'@'%' IDENTIFIED BY '123456';`
注意如果使用的数据库版本是8.0以上版本，需要将密码加密方式修改为为`mysql_native_password`，完整命令如下：
`CREATE USER 'repl'@'%' IDENTIFIED WITH mysql_native_password BY '123456';`
可能会因为密码太简单设置不成功，修改复杂密码即可。
授予用户EPLICATION SLAVE权限，并刷新权限。
`GRANT REPLICATION SLAVE ON *.* TO 'repl'@'%';`
`flush privileges;`

## 配置从数据库
操作与上面类似，只是不需要建用户。
```
##slave
[mysqld]
server_id = 2

sql_mode=NO_ENGINE_SUBSTITUTION,STRICT_TRANS_TABLES 
log_bin=mysql-bin
binlog-format=Row
relay_log=edu-mysql-relay-bin
```
配置完成后同样需要重启使配置生效。

## 链接主从数据库
进入主数据库后可以使用`show master status;`查看状态。
File和Position字段的值后面将会用到，在后面的操作完成之前，需要保证主库不能做任何操作，否则将会引起状态变化，File和Position字段的值变化。
使用如下命令查看主库所在容器当前ip地址。
`docker inspect --format='{{.NetworkSettings.IPAddress}}' mastermysql`
在从库进入mysql命令行`mysql -uroot -p`
执行以下命令用于配置同步点。
```
CHANGE MASTER TO
    MASTER_HOST='172.17.0.2',  
    MASTER_PORT = 3306,
    MASTER_USER='repl',      
    MASTER_PASSWORD='123456',   
    MASTER_LOG_FILE='mysql-bin.000001',
    MASTER_LOG_POS=747;

#master_port：Master的端口号，指的是容器的端口号
#master_user：用于数据同步的用户
#master_password：用于同步的用户的密码
#master_log_file：指定 Slave 从哪个日志文件开始复制数据，即上文中提到的 File 字段的值
#master_log_pos：从哪个 Position 开始读，即上文中提到的 Position 字段的值
#master_connect_retry：如果连接失败，重试的时间间隔，单位是秒，默认是60秒
```
使用`start slave`启动主从复制，使用`show slave status\G`查看主从同步状态。
当SlaveIORunning 和 SlaveSQLRunning 都是Yes，说明主从复制已经开启。此时可以测试数据同步是否成功。
参考 [基于Docker的Mysql主从复制搭建](https://www.cnblogs.com/songwenjie/p/9371422.html)