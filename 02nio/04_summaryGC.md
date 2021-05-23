# 不同GC和堆内存的总结
|GC算法  |配置|模式|Xms|Xmx|创建对象|young gc|full gc|
|-------|----------------------|---|---|---|---|---|---|
|串行 GC |+XX:UseSerialGC|串行|512m|512m|9817|19~30ms|42ms
||||1g|1g|9397|45~85ms|-|
||||2g|2g|12360|74~102ms|-|
||||4g|4g|10549|121~161ms|-|
|并行 GC |+XX:UseParallelGG|并行|512m|512m|7882|3~21ms|31ms|
||||1g|1g|12158|8~38ms|43ms|
||||2g|2g|13372|16~69ms|-|
||||4g|4g|14834|72~99ms|-|
|CMS GC |+XX:UseComcMarkSweepGC|并发|512m|512m|10361|2~26ms|25ms|
||||1g|1g|12445|28~45ms|318ms|
||||2g|2g|13403|58~72ms|-|
||||4g|4g|15530|59~72ms|-|
|G1 GC  |+XX:UseG1GC|并发|512m|512m|10994|3~9ms|6ms|
||||1g|1g|10777|2~16ms|5ms|
||||2g|2g|12216|10~38ms|-|
||||4g|4g|11775|18~63ms|-|

## 总结
- 随着堆内存越来愈大，young gc花费时间越来越长，创建对象在2g时达到最大
- 内存过小会导致gc频繁，甚至出现oom
- 同样内存大小下，串行gc时间是并行gc的两倍
- 同样内存大小下，G1 GC在gc时间和吞吐量上优于其他三种gc(串行、并行、CMS)
- 越大内存，G1 GC表现越好
