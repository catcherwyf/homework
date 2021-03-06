[TOC]
# JAVA进阶
## JVM
JVM即java虚拟机，可以保证JAVA语言不需要重新编译，就可以运行在不同的机器环境。
Java虚拟机包括程序计数器(Program Counter)，Java堆(Heap)，Java虚拟机栈(Stack)，本地方法栈(Native Stack)，方法区(Method Area)。
JAVA有自己的垃圾回收机制，常见的有串行GC、并行GC、CMS、G1、ZGC、Epsilon、Shenandoah。GC期间的STW对系统性能会产生影响。

## NIO
IO 操作主要分为两个步骤，即发起 IO 请求和实际 IO 操作，阻塞与非阻塞的区别就在于第一个步骤是否阻塞。同步与异步的区别就在于第二个步骤是否阻塞。
NIO是同步非阻塞的I/O模型，也是I/O多路复用的基础。与之相对应的，BIO是同步阻塞I/O模型，在单CPU环境下，线程都是串行执行的。
## 并发编程
核心理论：共享性、互斥性、原子性、可见性、有序性
## Spring 和 ORM 等框架
Spring 是目前主流的 Java Web 开发框架，以 IoC（Inverse of Control，控制反转）和 AOP（Aspect Oriented Programming，面向切面编程）为内核。
Spring 通过 IoC 容器来管理对象的实例化和初始化，以及对象从创建到销毁的整个生命周期。
AOP 采取横向抽取机制（动态代理），取代了传统纵向继承机制的重复性代码，其应用主要体现在事务处理、日志管理、权限控制、异常处理等方面。主要作用是分离功能性需求和非功能性需求，使开发人员可以集中处理某一个关注点或者横切逻辑，减少对业务代码的侵入，增强代码的可读性和可维护性。
## MySQL 数据库和 SQL
MySQL是一个关系型数据库管理系统，其存储引擎是插件式的，可以根据不同需要进行选择。其中InnoDB是事务型数据库的首选引擎，支持ACID事务，支持行级锁定, MySQL 5.5 起成为默认数据库引擎。
## 分库分表
分库分表是为了应对随着数据规模的急速膨胀导致单表容量过大带来的性能瓶颈问题。
水平分库：以字段为依据，按照一定策略，将一个库中的数据拆分到多个库中。
水平分表：以字段为依据，按照一定策略，将一个表中的数据拆分到多个表中。
垂直分库：以表为依据，按照业务归属不同，将不同的表拆分到不同的库中。
垂直分表：以字段为依据，按照字段的活跃性，将表中字段拆到不同的表（主表和扩展表）中。
## RPC 和微服务
RPC即远程过程调用（Remote Procedure Call），核心是代理机制，通过RPC能解耦服务。
Apache Dubbo是面向接口代理的高性能RPC调用，智能负载均衡，服务自动注册和发现，高度可扩展能力，运行期流量调度，可视化的服务治理与运维。
## 分布式缓存
缓存的本质是由于系统各级处理速度不匹配，导致利用空间换时间，是提升系统性能的一个简单有效的办法。
目前主要的缓存中间件有Redis、Memcached，过期策略常见的有FIFO/LRU。
缓存穿透：大量并发查询不存在的 KEY，导致都直接将压力透传到数据库。
解决办法：缓存空值；Bloom 过滤；延迟异步加载
缓存击穿：某个 KEY 失效的时候，正好有大量并发请求访问这个 KEY。
解决办法：更新操作添加全局互斥锁；延迟异步加载
缓存雪崩：：当某一时刻发生大规模的缓存失效的情况，会有大量的请求进来直接打到数据库，导致数据 库压力过大甚至宕机。
解决办法：将缓存失效时间分散开，将热量数据分散开；实现高可用；实现熔断限流机制
## 分布式消息队列
消息队列中间件是分布式系统中重要的组件，主要解决应用耦合，异步消息，流量削锋等问题。目前在生产环境，使用较多的消息队列有ActiveMQ，RabbitMQ，ZeroMQ，Kafka，MetaMQ，RocketMQ等。
Kafka是一种分布式的，基于发布/订阅的消息系统，具有高性能、持久化、多副本备份、横向扩展能力。生产者往队列里写消息，消费者从队列里取消息进行业务逻辑。