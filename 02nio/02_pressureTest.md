# wrk 压力测试 gateway-server-0.0.1SNAPSHOT.jar

`$ java -jar gateway-server-0.0.1SNAPSHOT.jar`
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.4.RELEASE)
 ```
` $  curl http://localhost:8088/api/hello`
 ```
hello world%
```
` $ wrk -c 40 -d30s http://localhost:8088/api/hello`
```
Running 30s test @ http://localhost:8088/api/hello
  2 threads and 40 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.99ms   77.61ms 839.42ms   97.64%
    Req/Sec    37.76k    12.08k   51.94k    80.99%
  1603600 requests in 30.09s, 191.45MB read
Requests/sec:  53294.41
Transfer/sec:      6.36MB
```