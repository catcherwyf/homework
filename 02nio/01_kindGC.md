# 不同GC方法日志输入
## 串行GC（512m）
`$ java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-15T16:15:52.359-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.359-0800: [DefNew: 139776K->17472K(157248K), 0.0197528 secs] 139776K->42587K(506816K), 0.0197847 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
2021-05-15T16:15:52.399-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.399-0800: [DefNew: 157133K->17469K(157248K), 0.0287621 secs] 182249K->85535K(506816K), 0.0287926 secs] [Times: user=0.02 sys=0.01, real=0.03 secs]
2021-05-15T16:15:52.445-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.445-0800: [DefNew: 157245K->17472K(157248K), 0.0284986 secs] 225311K->136048K(506816K), 0.0285260 secs] [Times: user=0.02 sys=0.01, real=0.03 secs]
2021-05-15T16:15:52.493-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.493-0800: [DefNew: 157248K->17470K(157248K), 0.0219361 secs] 275824K->175028K(506816K), 0.0219686 secs] [Times: user=0.02 sys=0.01, real=0.02 secs]
2021-05-15T16:15:52.534-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.534-0800: [DefNew: 157246K->17471K(157248K), 0.0259413 secs] 314804K->221744K(506816K), 0.0259725 secs] [Times: user=0.01 sys=0.01, real=0.03 secs]
2021-05-15T16:15:52.579-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.579-0800: [DefNew: 157247K->17470K(157248K), 0.0243262 secs] 361520K->265556K(506816K), 0.0243555 secs] [Times: user=0.01 sys=0.00, real=0.03 secs]
2021-05-15T16:15:52.621-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.621-0800: [DefNew: 157246K->17471K(157248K), 0.0230427 secs] 405332K->305045K(506816K), 0.0230766 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
2021-05-15T16:15:52.662-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.662-0800: [DefNew: 157247K->17469K(157248K), 0.0248176 secs] 444821K->346677K(506816K), 0.0248477 secs] [Times: user=0.02 sys=0.01, real=0.02 secs]
2021-05-15T16:15:52.707-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.707-0800: [DefNew: 157245K->157245K(157248K), 0.0000150 secs]2021-05-15T16:15:52.707-0800: [Tenured: 329208K->264900K(349568K), 0.0424741 secs] 486453K->264900K(506816K), [Metaspace: 2862K->2862K(1056768K)], 0.0425324 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:15:52.768-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.768-0800: [DefNew: 139776K->17471K(157248K), 0.0072931 secs] 404676K->314954K(506816K), 0.0073288 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2021-05-15T16:15:52.795-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.795-0800: [DefNew: 157247K->17472K(157248K), 0.0141174 secs] 454730K->359253K(506816K), 0.0141496 secs] [Times: user=0.01 sys=0.01, real=0.01 secs]
2021-05-15T16:15:52.828-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.828-0800: [DefNew: 157248K->157248K(157248K), 0.0000188 secs]2021-05-15T16:15:52.828-0800: [Tenured: 341781K->312546K(349568K), 0.0410006 secs] 499029K->312546K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0410639 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:15:52.889-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.889-0800: [DefNew: 139776K->139776K(157248K), 0.0000171 secs]2021-05-15T16:15:52.889-0800: [Tenured: 312546K->320764K(349568K), 0.0418179 secs] 452322K->320764K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0418843 secs] [Times: user=0.04 sys=0.00, real=0.05 secs]
2021-05-15T16:15:52.953-0800: [GC (Allocation Failure) 2021-05-15T16:15:52.954-0800: [DefNew: 139776K->139776K(157248K), 0.0000171 secs]2021-05-15T16:15:52.954-0800: [Tenured: 320764K->317486K(349568K), 0.0463279 secs] 460540K->317486K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0463933 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2021-05-15T16:15:53.021-0800: [GC (Allocation Failure) 2021-05-15T16:15:53.021-0800: [DefNew: 139776K->139776K(157248K), 0.0000175 secs]2021-05-15T16:15:53.021-0800: [Tenured: 317486K->343753K(349568K), 0.0331157 secs] 457262K->343753K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0331854 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
2021-05-15T16:15:53.075-0800: [GC (Allocation Failure) 2021-05-15T16:15:53.075-0800: [DefNew: 139724K->139724K(157248K), 0.0000185 secs]2021-05-15T16:15:53.076-0800: [Tenured: 343753K->345593K(349568K), 0.0387343 secs] 483477K->345593K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0388015 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:15:53.136-0800: [GC (Allocation Failure) 2021-05-15T16:15:53.136-0800: [DefNew: 139586K->139586K(157248K), 0.0000179 secs]2021-05-15T16:15:53.136-0800: [Tenured: 345593K->348381K(349568K), 0.0425843 secs] 485180K->348381K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0426502 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:15:53.200-0800: [GC (Allocation Failure) 2021-05-15T16:15:53.200-0800: [DefNew: 139776K->139776K(157248K), 0.0000289 secs]2021-05-15T16:15:53.200-0800: [Tenured: 348381K->335128K(349568K), 0.0479337 secs] 488157K->335128K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0480129 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
2021-05-15T16:15:53.268-0800: [GC (Allocation Failure) 2021-05-15T16:15:53.268-0800: [DefNew: 139712K->139712K(157248K), 0.0000173 secs]2021-05-15T16:15:53.268-0800: [Tenured: 335128K->349487K(349568K), 0.0321602 secs] 474840K->356696K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0322251 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
执行结束!共生成对象次数:9817
Heap
 def new generation   total 157248K, used 12994K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,   9% used [0x00000007a0000000, 0x00000007a0cb09c8, 0x00000007a8880000)
  from space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
  to   space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
 tenured generation   total 349568K, used 349487K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 349568K,  99% used [0x00000007aaaa0000, 0x00000007bffebf70, 0x00000007bffec000, 0x00000007c0000000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
```
## 串行GC（1g)
`$ java -XX:+UseSerialGC -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-16T14:19:36.983-0800: [GC (Allocation Failure) 2021-05-16T14:19:36.983-0800: [DefNew: 279616K->34944K(314560K), 0.0632373 secs] 279616K->78337K(1013632K), 0.0632743 secs] [Times: user=0.03 sys=0.02, real=0.06 secs]
2021-05-16T14:19:37.092-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.092-0800: [DefNew: 314560K->34941K(314560K), 0.0772770 secs] 357953K->158729K(1013632K), 0.0773290 secs] [Times: user=0.04 sys=0.03, real=0.07 secs]
2021-05-16T14:19:37.211-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.211-0800: [DefNew: 314557K->34944K(314560K), 0.0514311 secs] 438345K->235505K(1013632K), 0.0514663 secs] [Times: user=0.04 sys=0.02, real=0.05 secs]
2021-05-16T14:19:37.302-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.302-0800: [DefNew: 314560K->34943K(314560K), 0.0496259 secs] 515121K->313194K(1013632K), 0.0496614 secs] [Times: user=0.03 sys=0.01, real=0.05 secs]
2021-05-16T14:19:37.385-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.385-0800: [DefNew^[[C: 314547K->34943K(314560K), 0.0855944 secs] 592798K->389636K(1013632K), 0.0856305 secs] [Times: user=0.03 sys=0.02, real=0.09 secs]
2021-05-16T14:19:37.514-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.514-0800: [DefNew: 314559K->34943K(314560K), 0.0808520 secs] 669252K->473544K(1013632K), 0.0808889 secs] [Times: user=0.03 sys=0.02, real=0.08 secs]
2021-05-16T14:19:37.629-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.629-0800: [DefNew: 314559K->34939K(314560K), 0.0454961 secs] 753160K->551057K(1013632K), 0.0455328 secs] [Times: user=0.03 sys=0.02, real=0.05 secs]
2021-05-16T14:19:37.713-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.713-0800: [DefNew: 314555K->34944K(314560K), 0.0445226 secs] 830673K->625265K(1013632K), 0.0445584 secs] [Times: user=0.03 sys=0.02, real=0.04 secs]
2021-05-16T14:19:37.792-0800: [GC (Allocation Failure) 2021-05-16T14:19:37.792-0800: [DefNew: 314530K->34944K(314560K), 0.0448762 secs] 904852K->699863K(1013632K), 0.0449092 secs] [Times: user=0.02 sys=0.02, real=0.04 secs]
执行结束!共生成对象次数:9397
Heap
 def new generation   total 314560K, used 52919K [0x0000000780000000, 0x0000000795550000, 0x0000000795550000)
  eden space 279616K,   6% used [0x0000000780000000, 0x000000078118dc68, 0x0000000791110000)
  from space 34944K, 100% used [0x0000000793330000, 0x0000000795550000, 0x0000000795550000)
  to   space 34944K,   0% used [0x0000000791110000, 0x0000000791110000, 0x0000000793330000)
 tenured generation   total 699072K, used 664919K [0x0000000795550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 699072K,  95% used [0x0000000795550000, 0x00000007bdea5fb8, 0x00000007bdea6000, 0x00000007c0000000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ## 串行GC（2g）
`$ java -XX:+UseSerialGC -Xms2g -Xmx2g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-16T14:21:15.573-0800: [GC (Allocation Failure) 2021-05-16T14:21:15.573-0800: [DefNew: 559232K->69888K(629120K), 0.0773612 secs] 559232K->146087K(2027264K), 0.0773971 secs] [Times: user=0.04 sys=0.03, real=0.08 secs]
2021-05-16T14:21:15.731-0800: [GC (Allocation Failure) 2021-05-16T14:21:15.731-0800: [DefNew: 629120K->69887K(629120K), 0.1022710 secs] 705319K->276504K(2027264K), 0.1023024 secs] [Times: user=0.07 sys=0.04, real=0.10 secs]
2021-05-16T14:21:15.897-0800: [GC (Allocation Failure) 2021-05-16T14:21:15.897-0800: [DefNew: 629119K->69887K(629120K), 0.0849309 secs] 835736K->405701K(2027264K), 0.0849659 secs] [Times: user=0.06 sys=0.03, real=0.09 secs]
2021-05-16T14:21:16.048-0800: [GC (Allocation Failure) 2021-05-16T14:21:16.048-0800: [DefNew: 629119K->69887K(629120K), 0.0743500 secs] 964933K->512467K(2027264K), 0.0743828 secs] [Times: user=0.05 sys=0.03, real=0.08 secs]
2021-05-16T14:21:16.192-0800: [GC (Allocation Failure) 2021-05-16T14:21:16.192-0800: [DefNew: 629119K->69887K(629120K), 0.0768102 secs] 1071699K->633113K(2027264K), 0.0768449 secs] [Times: user=0.05 sys=0.03, real=0.07 secs]
执行结束!共生成对象次数:12360
Heap
 def new generation   total 629120K, used 554920K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,  86% used [0x0000000740000000, 0x000000075d9aa2e8, 0x0000000762220000)
  from space 69888K,  99% used [0x0000000766660000, 0x000000076aa9fff8, 0x000000076aaa0000)
  to   space 69888K,   0% used [0x0000000762220000, 0x0000000762220000, 0x0000000766660000)
 tenured generation   total 1398144K, used 563225K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 1398144K,  40% used [0x000000076aaa0000, 0x000000078d0a6440, 0x000000078d0a6600, 0x00000007c0000000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ## 串行GC（4g）
`$ java -XX:+UseSerialGC -Xms4g -Xmx4g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
java -XX:+UseSerialGC -Xms4g -Xmx4g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2021-05-16T14:22:33.664-0800: [GC (Allocation Failure) 2021-05-16T14:22:33.664-0800: [DefNew: 1118528K->139776K(1258304K), 0.1212084 secs] 1118528K->232845K(4054528K), 0.1212458 secs] [Times: user=0.07 sys=0.05, real=0.12 secs]
2021-05-16T14:22:33.950-0800: [GC (Allocation Failure) 2021-05-16T14:22:33.950-0800: [DefNew: 1258304K->139775K(1258304K), 0.1612315 secs] 1351373K->391215K(4054528K), 0.1612598 secs] [Times: user=0.09 sys=0.06, real=0.16 secs]
执行结束!共生成对象次数:10549
Heap
 def new generation   total 1258304K, used 747513K [0x00000006c0000000, 0x0000000715550000, 0x0000000715550000)
  eden space 1118528K,  54% used [0x00000006c0000000, 0x00000006e517e460, 0x0000000704450000)
  from space 139776K,  99% used [0x0000000704450000, 0x000000070cccfff8, 0x000000070ccd0000)
  to   space 139776K,   0% used [0x000000070ccd0000, 0x000000070ccd0000, 0x0000000715550000)
 tenured generation   total 2796224K, used 251439K [0x0000000715550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 2796224K,   8% used [0x0000000715550000, 0x0000000724adbd30, 0x0000000724adbe00, 0x00000007c0000000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
```
## 并行GC（512m）
`$ java -XX:+UseParallelGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-15T16:19:03.800-0800: [GC (Allocation Failure) [PSYoungGen: 131584K->21489K(153088K)] 131584K->40578K(502784K), 0.0135492 secs] [Times: user=0.02 sys=0.09, real=0.01 secs]
2021-05-15T16:19:03.830-0800: [GC (Allocation Failure) [PSYoungGen: 153073K->21501K(153088K)] 172162K->77985K(502784K), 0.0198458 secs] [Times: user=0.02 sys=0.13, real=0.02 secs]
2021-05-15T16:19:03.866-0800: [GC (Allocation Failure) [PSYoungGen: 152604K->21487K(153088K)] 209088K->120497K(502784K), 0.0189633 secs] [Times: user=0.04 sys=0.10, real=0.02 secs]
2021-05-15T16:19:03.902-0800: [GC (Allocation Failure) [PSYoungGen: 153071K->21486K(153088K)] 252081K->160435K(502784K), 0.0187763 secs] [Times: user=0.05 sys=0.11, real=0.02 secs]
2021-05-15T16:19:03.939-0800: [GC (Allocation Failure) [PSYoungGen: 153070K->21499K(153088K)] 292019K->204589K(502784K), 0.0212828 secs] [Times: user=0.05 sys=0.11, real=0.03 secs]
2021-05-15T16:19:03.977-0800: [GC (Allocation Failure) [PSYoungGen: 153083K->21496K(80384K)] 336173K->247345K(430080K), 0.0213330 secs] [Times: user=0.05 sys=0.12, real=0.02 secs]
2021-05-15T16:19:04.008-0800: [GC (Allocation Failure) [PSYoungGen: 80376K->34583K(116736K)] 306225K->265131K(466432K), 0.0054350 secs] [Times: user=0.04 sys=0.01, real=0.01 secs]
2021-05-15T16:19:04.021-0800: [GC (Allocation Failure) [PSYoungGen: 93401K->52216K(116736K)] 323950K->286884K(466432K), 0.0069069 secs] [Times: user=0.06 sys=0.01, real=0.00 secs]
2021-05-15T16:19:04.036-0800: [GC (Allocation Failure) [PSYoungGen: 110899K->57842K(116736K)] 345566K->306773K(466432K), 0.0133409 secs] [Times: user=0.07 sys=0.04, real=0.02 secs]
2021-05-15T16:19:04.060-0800: [GC (Allocation Failure) [PSYoungGen: 116722K->41692K(116736K)] 365653K->324714K(466432K), 0.0165554 secs] [Times: user=0.03 sys=0.10, real=0.01 secs]
2021-05-15T16:19:04.085-0800: [GC (Allocation Failure) [PSYoungGen: 100572K->19154K(116736K)] 383594K->341836K(466432K), 0.0184063 secs] [Times: user=0.03 sys=0.11, real=0.02 secs]
2021-05-15T16:19:04.103-0800: [Full GC (Ergonomics) [PSYoungGen: 19154K->0K(116736K)] [ParOldGen: 322682K->246988K(349696K)] 341836K->246988K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0311632 secs] [Times: user=0.26 sys=0.01, real=0.03 secs]
2021-05-15T16:19:04.146-0800: [GC (Allocation Failure) [PSYoungGen: 58679K->17690K(116736K)] 305668K->264679K(466432K), 0.0029894 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.160-0800: [GC (Allocation Failure) [PSYoungGen: 76393K->19389K(116736K)] 323382K->282848K(466432K), 0.0042295 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.174-0800: [GC (Allocation Failure) [PSYoungGen: 77696K->20640K(116736K)] 341156K->302644K(466432K), 0.0045307 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.189-0800: [GC (Allocation Failure) [PSYoungGen: 79520K->21572K(116736K)] 361524K->323441K(466432K), 0.0046743 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
2021-05-15T16:19:04.194-0800: [Full GC (Ergonomics) [PSYoungGen: 21572K->0K(116736K)] [ParOldGen: 301869K->272328K(349696K)] 323441K->272328K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0312849 secs] [Times: user=0.28 sys=0.01, real=0.03 secs]
2021-05-15T16:19:04.239-0800: [GC (Allocation Failure) [PSYoungGen: 58835K->22088K(116736K)] 331163K->294416K(466432K), 0.0031764 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2021-05-15T16:19:04.253-0800: [GC (Allocation Failure) [PSYoungGen: 80968K->21940K(116736K)] 353296K->313527K(466432K), 0.0047661 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.269-0800: [GC (Allocation Failure) [PSYoungGen: 80820K->19904K(116736K)] 372407K->330819K(466432K), 0.0057910 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2021-05-15T16:19:04.275-0800: [Full GC (Ergonomics) [PSYoungGen: 19904K->0K(116736K)] [ParOldGen: 310915K->287065K(349696K)] 330819K->287065K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0314972 secs] [Times: user=0.28 sys=0.00, real=0.03 secs]
2021-05-15T16:19:04.318-0800: [GC (Allocation Failure) [PSYoungGen: 58880K->26041K(116736K)] 345945K->313106K(466432K), 0.0039706 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2021-05-15T16:19:04.334-0800: [GC (Allocation Failure) [PSYoungGen: 84722K->19050K(116736K)] 371788K->331653K(466432K), 0.0049387 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.339-0800: [Full GC (Ergonomics) [PSYoungGen: 19050K->0K(116736K)] [ParOldGen: 312603K->303580K(349696K)] 331653K->303580K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0340834 secs] [Times: user=0.30 sys=0.01, real=0.04 secs]
2021-05-15T16:19:04.387-0800: [GC (Allocation Failure) [PSYoungGen: 58880K->20828K(116736K)] 362460K->324408K(466432K), 0.0037074 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2021-05-15T16:19:04.401-0800: [GC (Allocation Failure) [PSYoungGen: 79708K->20549K(116736K)] 383288K->342746K(466432K), 0.0046569 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
2021-05-15T16:19:04.406-0800: [Full GC (Ergonomics) [PSYoungGen: 20549K->0K(116736K)] [ParOldGen: 322197K->311810K(349696K)] 342746K->311810K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0377908 secs] [Times: user=0.33 sys=0.00, real=0.04 secs]
2021-05-15T16:19:04.457-0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 311810K->313382K(349696K)] 370690K->313382K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0391171 secs] [Times: user=0.33 sys=0.01, real=0.04 secs]
2021-05-15T16:19:04.509-0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 313382K->315589K(349696K)] 372262K->315589K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0385273 secs] [Times: user=0.34 sys=0.00, real=0.04 secs]
2021-05-15T16:19:04.561-0800: [Full GC (Ergonomics) [PSYoungGen: 58751K->0K(116736K)] [ParOldGen: 315589K->320991K(349696K)] 374341K->320991K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0387605 secs] [Times: user=0.34 sys=0.00, real=0.03 secs]
2021-05-15T16:19:04.612-0800: [Full GC (Ergonomics) [PSYoungGen: 58842K->0K(116736K)] [ParOldGen: 320991K->328113K(349696K)] 379834K->328113K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0380600 secs] [Times: user=0.32 sys=0.02, real=0.04 secs]
2021-05-15T16:19:04.663-0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 328113K->333647K(349696K)] 386993K->333647K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0397912 secs] [Times: user=0.32 sys=0.02, real=0.04 secs]
2021-05-15T16:19:04.717-0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 333647K->333873K(349696K)] 392527K->333873K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0418452 secs] [Times: user=0.36 sys=0.00, real=0.04 secs]
执行结束!共生成对象次数:7882
Heap
 PSYoungGen      total 116736K, used 2895K [0x00000007b5580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 58880K, 4% used [0x00000007b5580000,0x00000007b5853d10,0x00000007b8f00000)
  from space 57856K, 0% used [0x00000007bc780000,0x00000007bc780000,0x00000007c0000000)
  to   space 57856K, 0% used [0x00000007b8f00000,0x00000007b8f00000,0x00000007bc780000)
 ParOldGen       total 349696K, used 333873K [0x00000007a0000000, 0x00000007b5580000, 0x00000007b5580000)
  object space 349696K, 95% used [0x00000007a0000000,0x00000007b460c710,0x00000007b5580000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ## 并行GC（1g)
  `$ java -XX:+UseParallelGC -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
正在执行...
2021-05-16T14:27:07.631-0800: [GC (Allocation Failure) [PSYoungGen: 262144K->43519K(305664K)] 262144K->88418K(1005056K), 0.0311184 secs] [Times: user=0.04 sys=0.20, real=0.03 secs]
2021-05-16T14:27:07.701-0800: [GC (Allocation Failure) [PSYoungGen: 305663K->43513K(305664K)] 350562K->154348K(1005056K), 0.0385633 secs] [Times: user=0.04 sys=0.25, real=0.03 secs]
2021-05-16T14:27:07.769-0800: [GC (Allocation Failure) [PSYoungGen: 305657K->43515K(305664K)] 416492K->227099K(1005056K), 0.0342651 secs] [Times: user=0.07 sys=0.19, real=0.04 secs]
2021-05-16T14:27:07.836-0800: [GC (Allocation Failure) [PSYoungGen: 305659K->43505K(305664K)] 489243K->301669K(1005056K), 0.0364110 secs] [Times: user=0.08 sys=0.21, real=0.04 secs]
2021-05-16T14:27:07.908-0800: [GC (Allocation Failure) [PSYoungGen: 305649K->43513K(305664K)] 563813K->381135K(1005056K), 0.0386791 secs] [Times: user=0.08 sys=0.22, real=0.04 secs]
2021-05-16T14:27:07.981-0800: [GC (Allocation Failure) [PSYoungGen: 305657K->43508K(160256K)] 643279K->449311K(859648K), 0.0341816 secs] [Times: user=0.08 sys=0.19, real=0.03 secs]
2021-05-16T14:27:08.034-0800: [GC (Allocation Failure) [PSYoungGen: 160101K->69923K(232960K)] 565903K->483260K(932352K), 0.0088619 secs] [Times: user=0.06 sys=0.02, real=0.01 secs]
2021-05-16T14:27:08.060-0800: [GC (Allocation Failure) [PSYoungGen: 186659K->92622K(232960K)] 599996K->517403K(932352K), 0.0151801 secs] [Times: user=0.09 sys=0.03, real=0.01 secs]
2021-05-16T14:27:08.097-0800: [GC (Allocation Failure) [PSYoungGen: 209358K->99830K(232960K)] 634139K->542917K(932352K), 0.0179407 secs] [Times: user=0.10 sys=0.06, real=0.02 secs]
2021-05-16T14:27:08.134-0800: [GC (Allocation Failure) [PSYoungGen: 216566K->68165K(232960K)] 659653K->570639K(932352K), 0.0315128 secs] [Times: user=0.06 sys=0.18, real=0.03 secs]
2021-05-16T14:27:08.182-0800: [GC (Allocation Failure) [PSYoungGen: 184146K->44004K(232960K)] 686619K->606754K(932352K), 0.0275540 secs] [Times: user=0.05 sys=0.16, real=0.03 secs]
2021-05-16T14:27:08.224-0800: [GC (Allocation Failure) [PSYoungGen: 160600K->33357K(232960K)] 723350K->634908K(932352K), 0.0189566 secs] [Times: user=0.04 sys=0.10, real=0.02 secs]
2021-05-16T14:27:08.243-0800: [Full GC (Ergonomics) [PSYoungGen: 33357K->0K(232960K)] [ParOldGen: 601551K->312439K(699392K)] 634908K->312439K(932352K), [Metaspace: 2863K->2863K(1056768K)], 0.0433260 secs] [Times: user=0.34 sys=0.02, real=0.04 secs]
2021-05-16T14:27:08.305-0800: [GC (Allocation Failure) [PSYoungGen: 116612K->36261K(232960K)] 429052K->348701K(932352K), 0.0079109 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.331-0800: [GC (Allocation Failure) [PSYoungGen: 152997K->40271K(232960K)] 465437K->385530K(932352K), 0.0086760 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.362-0800: [GC (Allocation Failure) [PSYoungGen: 157007K->41967K(232960K)] 502266K->423013K(932352K), 0.0081162 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.389-0800: [GC (Allocation Failure) [PSYoungGen: 158703K->35965K(232960K)] 539749K->452834K(932352K), 0.0078473 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.416-0800: [GC (Allocation Failure) [PSYoungGen: 152701K->39304K(232960K)] 569570K->489788K(932352K), 0.0125698 secs] [Times: user=0.11 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.450-0800: [GC (Allocation Failure) [PSYoungGen: 156040K->34668K(232960K)] 606524K->518912K(932352K), 0.0076070 secs] [Times: user=0.07 sys=0.01, real=0.00 secs]
2021-05-16T14:27:08.475-0800: [GC (Allocation Failure) [PSYoungGen: 151226K->37153K(232960K)] 635469K->553484K(932352K), 0.0079384 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2021-05-16T14:27:08.504-0800: [GC (Allocation Failure) [PSYoungGen: 153889K->38969K(232960K)] 670220K->587600K(932352K), 0.0089792 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
执行结束!共生成对象次数:12158
Heap
 PSYoungGen      total 232960K, used 43871K [0x00000007aab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 116736K, 4% used [0x00000007aab00000,0x00000007aafc9798,0x00000007b1d00000)
  from space 116224K, 33% used [0x00000007b8e80000,0x00000007bb48e688,0x00000007c0000000)
  to   space 116224K, 0% used [0x00000007b1d00000,0x00000007b1d00000,0x00000007b8e80000)
 ParOldGen       total 699392K, used 548630K [0x0000000780000000, 0x00000007aab00000, 0x00000007aab00000)
  object space 699392K, 78% used [0x0000000780000000,0x00000007a17c5b60,0x00000007aab00000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
## 并行GC（2g)
 `$ java -XX:+UseParallelGC -Xms2g -Xmx2g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
java -XX:+UseParallelGC -Xms2g -Xmx2g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2021-05-16T14:29:44.239-0800: [GC (Allocation Failure) [PSYoungGen: 524800K->87037K(611840K)] 524800K->143174K(2010112K), 0.0561763 secs] [Times: user=0.06 sys=0.36, real=0.06 secs]
2021-05-16T14:29:44.367-0800: [GC (Allocation Failure) [PSYoungGen: 611837K->87031K(611840K)] 667974K->275580K(2010112K), 0.0695391 secs] [Times: user=0.09 sys=0.47, real=0.07 secs]
2021-05-16T14:29:44.499-0800: [GC (Allocation Failure) [PSYoungGen: 611831K->87035K(611840K)] 800380K->393946K(2010112K), 0.0568634 secs] [Times: user=0.13 sys=0.32, real=0.06 secs]
2021-05-16T14:29:44.620-0800: [GC (Allocation Failure) [PSYoungGen: 611835K->87026K(611840K)] 918746K->511851K(2010112K), 0.0614493 secs] [Times: user=0.14 sys=0.35, real=0.06 secs]
2021-05-16T14:29:44.751-0800: [GC (Allocation Failure) [PSYoungGen: 611826K->87039K(611840K)] 1036651K->618866K(2010112K), 0.0543769 secs] [Times: user=0.13 sys=0.29, real=0.05 secs]
2021-05-16T14:29:44.869-0800: [GC (Allocation Failure) [PSYoungGen: 611839K->87023K(321024K)] 1143666K->734788K(1719296K), 0.0582679 secs] [Times: user=0.13 sys=0.33, real=0.06 secs]
2021-05-16T14:29:44.960-0800: [GC (Allocation Failure) [PSYoungGen: 321007K->138129K(372224K)] 968772K->795431K(1770496K), 0.0162580 secs] [Times: user=0.12 sys=0.02, real=0.01 secs]
执行结束!共生成对象次数:13372
Heap
 PSYoungGen      total 372224K, used 338373K [0x0000000795580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 233984K, 85% used [0x0000000795580000,0x00000007a190d008,0x00000007a3a00000)
  from space 138240K, 99% used [0x00000007a3a00000,0x00000007ac0e4528,0x00000007ac100000)
  to   space 232960K, 0% used [0x00000007b1c80000,0x00000007b1c80000,0x00000007c0000000)
 ParOldGen       total 1398272K, used 657302K [0x0000000740000000, 0x0000000795580000, 0x0000000795580000)
  object space 1398272K, 47% used [0x0000000740000000,0x00000007681e5928,0x0000000795580000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
## 并行GC（4g）
 ` $ java -XX:+UseParallelGC -Xms4g -Xmx4g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
正在执行...
2021-05-15T16:27:32.190-0800: [GC (Allocation Failure) [PSYoungGen: 1048576K->174589K(1223168K)] 1048576K->242001K(4019712K), 0.0874690 secs] [Times: user=0.10 sys=0.59, real=0.08 secs]
2021-05-15T16:27:32.404-0800: [GC (Allocation Failure) [PSYoungGen: 1223165K->174591K(1223168K)] 1290577K->371094K(4019712K), 0.0993733 secs] [Times: user=0.12 sys=0.69, real=0.10 secs]
2021-05-15T16:27:32.610-0800: [GC (Allocation Failure) [PSYoungGen: 1223167K->174577K(1223168K)] 1419670K->501521K(4019712K), 0.0721928 secs] [Times: user=0.23 sys=0.37, real=0.07 secs]
执行结束!共生成对象次数:14834
Heap
 PSYoungGen      total 1223168K, used 951989K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 1048576K, 74% used [0x000000076ab00000,0x000000079a230ff0,0x00000007aab00000)
  from space 174592K, 99% used [0x00000007aab00000,0x00000007b557c528,0x00000007b5580000)
  to   space 174592K, 0% used [0x00000007b5580000,0x00000007b5580000,0x00000007c0000000)
 ParOldGen       total 2796544K, used 326943K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
  object space 2796544K, 11% used [0x00000006c0000000,0x00000006d3f47fd8,0x000000076ab00000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ## CMS GC（512m）
  `$   java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
正在执行...
2021-05-15T16:22:30.357-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.357-0800: [ParNew: 139776K->17466K(157248K), 0.0169767 secs] 139776K->46662K(506816K), 0.0170391 secs] [Times: user=0.04 sys=0.10, real=0.02 secs]
2021-05-15T16:22:30.393-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.393-0800: [ParNew: 157242K->17470K(157248K), 0.0185563 secs] 186438K->85660K(506816K), 0.0185871 secs] [Times: user=0.04 sys=0.10, real=0.02 secs]
2021-05-15T16:22:30.429-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.429-0800: [ParNew: 157246K->17472K(157248K), 0.0261521 secs] 225436K->133292K(506816K), 0.0261902 secs] [Times: user=0.24 sys=0.02, real=0.03 secs]
2021-05-15T16:22:30.474-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.474-0800: [ParNew: 157248K->17472K(157248K), 0.0208549 secs] 273068K->175424K(506816K), 0.0208861 secs] [Times: user=0.19 sys=0.01, real=0.02 secs]
2021-05-15T16:22:30.512-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.512-0800: [ParNew: 157248K->17471K(157248K), 0.0199805 secs] 315200K->214069K(506816K), 0.0200132 secs] [Times: user=0.18 sys=0.01, real=0.02 secs]
2021-05-15T16:22:30.532-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 196597K(349568K)] 217096K(506816K), 0.0002318 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.532-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:30.533-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.533-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:30.534-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.534-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:30.548-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.548-0800: [ParNew: 157217K->17469K(157248K), 0.0233411 secs] 353815K->259604K(506816K), 0.0233721 secs] [Times: user=0.21 sys=0.01, real=0.03 secs]
2021-05-15T16:22:30.587-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.587-0800: [ParNew: 157245K->17471K(157248K), 0.0261639 secs] 399380K->308636K(506816K), 0.0261973 secs] [Times: user=0.24 sys=0.02, real=0.03 secs]
2021-05-15T16:22:30.631-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.631-0800: [ParNew: 156663K->17471K(157248K), 0.0230628 secs] 447829K->354453K(506816K), 0.0231100 secs] [Times: user=0.22 sys=0.01, real=0.02 secs]
2021-05-15T16:22:30.654-0800: [CMS-concurrent-abortable-preclean: 0.003/0.120 secs] [Times: user=0.73 sys=0.04, real=0.12 secs]
2021-05-15T16:22:30.654-0800: [GC (CMS Final Remark) [YG occupancy: 18114 K (157248 K)]2021-05-15T16:22:30.654-0800: [Rescan (parallel) , 0.0003160 secs]2021-05-15T16:22:30.654-0800: [weak refs processing, 0.0000932 secs]2021-05-15T16:22:30.654-0800: [class unloading, 0.0003045 secs]2021-05-15T16:22:30.655-0800: [scrub symbol table, 0.0002551 secs]2021-05-15T16:22:30.655-0800: [scrub string table, 0.0001388 secs][1 CMS-remark: 336981K(349568K)] 355095K(506816K), 0.0011442 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.655-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:30.656-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.656-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:30.656-0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.671-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.671-0800: [ParNew: 157247K->17468K(157248K), 0.0115235 secs] 450691K->358688K(506816K), 0.0115582 secs] [Times: user=0.11 sys=0.00, real=0.01 secs]
2021-05-15T16:22:30.683-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 341219K(349568K)] 359331K(506816K), 0.0001902 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.683-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:30.684-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.684-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:30.684-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.684-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:30.684-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.684-0800: [GC (CMS Final Remark) [YG occupancy: 31927 K (157248 K)]2021-05-15T16:22:30.684-0800: [Rescan (parallel) , 0.0002421 secs]2021-05-15T16:22:30.684-0800: [weak refs processing, 0.0000137 secs]2021-05-15T16:22:30.684-0800: [class unloading, 0.0001770 secs]2021-05-15T16:22:30.685-0800: [scrub symbol table, 0.0002511 secs]2021-05-15T16:22:30.685-0800: [scrub string table, 0.0001557 secs][1 CMS-remark: 341219K(349568K)] 373146K(506816K), 0.0008828 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.685-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:30.686-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.686-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:30.686-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.701-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.701-0800: [ParNew: 157244K->17471K(157248K), 0.0102297 secs] 404912K->309821K(506816K), 0.0102633 secs] [Times: user=0.10 sys=0.01, real=0.01 secs]
2021-05-15T16:22:30.711-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 292349K(349568K)] 312874K(506816K), 0.0001461 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.711-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:30.712-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.712-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:30.713-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.713-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:30.726-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.726-0800: [ParNew: 157173K->17471K(157248K), 0.0103856 secs] 449523K->354534K(506816K), 0.0104208 secs] [Times: user=0.10 sys=0.00, real=0.01 secs]
2021-05-15T16:22:30.737-0800: [CMS-concurrent-abortable-preclean: 0.000/0.024 secs] [Times: user=0.12 sys=0.00, real=0.02 secs]
2021-05-15T16:22:30.737-0800: [GC (CMS Final Remark) [YG occupancy: 18156 K (157248 K)]2021-05-15T16:22:30.737-0800: [Rescan (parallel) , 0.0002363 secs]2021-05-15T16:22:30.737-0800: [weak refs processing, 0.0000138 secs]2021-05-15T16:22:30.737-0800: [class unloading, 0.0002030 secs]2021-05-15T16:22:30.738-0800: [scrub symbol table, 0.0002679 secs]2021-05-15T16:22:30.738-0800: [scrub string table, 0.0001558 secs][1 CMS-remark: 337063K(349568K)] 355219K(506816K), 0.0009278 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.738-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:30.739-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.739-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:30.739-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.754-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.754-0800: [ParNew: 157247K->157247K(157248K), 0.0000180 secs]2021-05-15T16:22:30.754-0800: [CMS: 304427K->308502K(349568K), 0.0514200 secs] 461674K->308502K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0514869 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2021-05-15T16:22:30.805-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 308502K(349568K)] 309218K(506816K), 0.0002253 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.806-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:30.807-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.807-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:30.807-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.807-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:30.825-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.825-0800: [ParNew: 139551K->17470K(157248K), 0.0074303 secs] 448053K->359706K(506816K), 0.0074658 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2021-05-15T16:22:30.833-0800: [CMS-concurrent-abortable-preclean: 0.001/0.025 secs] [Times: user=0.09 sys=0.00, real=0.03 secs]
2021-05-15T16:22:30.833-0800: [GC (CMS Final Remark) [YG occupancy: 20523 K (157248 K)]2021-05-15T16:22:30.833-0800: [Rescan (parallel) , 0.0002813 secs]2021-05-15T16:22:30.833-0800: [weak refs processing, 0.0000266 secs]2021-05-15T16:22:30.833-0800: [class unloading, 0.0002434 secs]2021-05-15T16:22:30.833-0800: [scrub symbol table, 0.0003290 secs]2021-05-15T16:22:30.834-0800: [scrub string table, 0.0001863 secs][1 CMS-remark: 342235K(349568K)] 362759K(506816K), 0.0011216 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.834-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:30.835-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.835-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:30.835-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.852-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.852-0800: [ParNew: 157246K->157246K(157248K), 0.0000185 secs]2021-05-15T16:22:30.852-0800: [CMS: 341877K->324380K(349568K), 0.0458612 secs] 499124K->324380K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0459316 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:22:30.898-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 324380K(349568K)] 324645K(506816K), 0.0002740 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.899-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:30.900-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2021-05-15T16:22:30.900-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:30.900-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:30.900-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:30.917-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.917-0800: [ParNew (promotion failed): 139776K->157247K(157248K), 0.0092289 secs]2021-05-15T16:22:30.927-0800: [CMS2021-05-15T16:22:30.927-0800: [CMS-concurrent-abortable-preclean: 0.001/0.026 secs] [Times: user=0.10 sys=0.00, real=0.02 secs]
 (concurrent mode failure): 349395K->326320K(349568K), 0.0458412 secs] 464156K->326320K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0551210 secs] [Times: user=0.13 sys=0.00, real=0.06 secs]
2021-05-15T16:22:30.993-0800: [GC (Allocation Failure) 2021-05-15T16:22:30.993-0800: [ParNew: 139776K->139776K(157248K), 0.0000248 secs]2021-05-15T16:22:30.993-0800: [CMS: 326320K->333479K(349568K), 0.0451032 secs] 466096K->333479K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0451862 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
2021-05-15T16:22:31.039-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 333479K(349568K)] 334276K(506816K), 0.0002360 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.039-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:31.040-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2021-05-15T16:22:31.040-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:31.041-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.041-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:31.060-0800: [GC (Allocation Failure) 2021-05-15T16:22:31.060-0800: [ParNew: 139675K->139675K(157248K), 0.0000215 secs]2021-05-15T16:22:31.060-0800: [CMS2021-05-15T16:22:31.060-0800: [CMS-concurrent-abortable-preclean: 0.001/0.019 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
 (concurrent mode failure): 333479K->343270K(349568K), 0.0482872 secs] 473155K->343270K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0483649 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
2021-05-15T16:22:31.129-0800: [GC (Allocation Failure) 2021-05-15T16:22:31.129-0800: [ParNew: 139776K->139776K(157248K), 0.0000226 secs]2021-05-15T16:22:31.129-0800: [CMS: 343270K->343287K(349568K), 0.0478627 secs] 483046K->343287K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0479374 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2021-05-15T16:22:31.177-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 343287K(349568K)] 343344K(506816K), 0.0002141 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.177-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:31.178-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.179-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:31.179-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.179-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:31.179-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.179-0800: [GC (CMS Final Remark) [YG occupancy: 14181 K (157248 K)]2021-05-15T16:22:31.179-0800: [Rescan (parallel) , 0.0003145 secs]2021-05-15T16:22:31.180-0800: [weak refs processing, 0.0000144 secs]2021-05-15T16:22:31.180-0800: [class unloading, 0.0002111 secs]2021-05-15T16:22:31.180-0800: [scrub symbol table, 0.0003128 secs]2021-05-15T16:22:31.180-0800: [scrub string table, 0.0002102 secs][1 CMS-remark: 343287K(349568K)] 357468K(506816K), 0.0011197 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2021-05-15T16:22:31.181-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:31.181-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.181-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:31.181-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.199-0800: [GC (Allocation Failure) 2021-05-15T16:22:31.199-0800: [ParNew: 139776K->139776K(157248K), 0.0000216 secs]2021-05-15T16:22:31.199-0800: [CMS: 342581K->344489K(349568K), 0.0477877 secs] 482357K->344489K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0478641 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2021-05-15T16:22:31.247-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 344489K(349568K)] 344777K(506816K), 0.0002557 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.248-0800: [CMS-concurrent-mark-start]
2021-05-15T16:22:31.249-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.249-0800: [CMS-concurrent-preclean-start]
2021-05-15T16:22:31.250-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2021-05-15T16:22:31.250-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-15T16:22:31.250-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.250-0800: [GC (CMS Final Remark) [YG occupancy: 10491 K (157248 K)]2021-05-15T16:22:31.250-0800: [Rescan (parallel) , 0.0003128 secs]2021-05-15T16:22:31.250-0800: [weak refs processing, 0.0000124 secs]2021-05-15T16:22:31.250-0800: [class unloading, 0.0002185 secs]2021-05-15T16:22:31.250-0800: [scrub symbol table, 0.0003426 secs]2021-05-15T16:22:31.251-0800: [scrub string table, 0.0002204 secs][1 CMS-remark: 344489K(349568K)] 354981K(506816K), 0.0011570 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.251-0800: [CMS-concurrent-sweep-start]
2021-05-15T16:22:31.251-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.251-0800: [CMS-concurrent-reset-start]
2021-05-15T16:22:31.252-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-15T16:22:31.270-0800: [GC (Allocation Failure) 2021-05-15T16:22:31.270-0800: [ParNew: 139776K->139776K(157248K), 0.0000208 secs]2021-05-15T16:22:31.270-0800: [CMS: 343492K->349424K(349568K), 0.0486997 secs] 483268K->349648K(506816K), [Metaspace: 2863K->2863K(1056768K)], 0.0487747 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2021-05-15T16:22:31.319-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349424K(349568K)] 350282K(506816K), 0.0002460 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2021-05-15T16:22:31.320-0800: [CMS-concurrent-mark-start]
执行结束!共生成对象次数:10361
Heap
 par new generation   total 157248K, used 6428K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,   4% used [0x00000007a0000000, 0x00000007a06470d0, 0x00000007a8880000)
  from space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
  to   space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
 concurrent mark-sweep generation total 349568K, used 349424K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
## CMS GC (1g)
` $ java -XX:+UseConcMarkSweepGC -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-16T14:31:35.499-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.499-0800: [ParNew: 279616K->34941K(314560K), 0.0284897 secs] 279616K->76720K(1013632K), 0.0285554 secs] [Times: user=0.05 sys=0.17, real=0.03 secs]
2021-05-16T14:31:35.567-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.567-0800: [ParNew: 314557K->34941K(314560K), 0.0372911 secs] 356336K->150788K(1013632K), 0.0373262 secs] [Times: user=0.07 sys=0.22, real=0.04 secs]
2021-05-16T14:31:35.656-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.656-0800: [ParNew: 314557K->34942K(314560K), 0.0424031 secs] 430404K->224437K(1013632K), 0.0424370 secs] [Times: user=0.40 sys=0.03, real=0.04 secs]
2021-05-16T14:31:35.733-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.733-0800: [ParNew: 314558K->34938K(314560K), 0.0406180 secs] 504053K->302028K(1013632K), 0.0406525 secs] [Times: user=0.38 sys=0.02, real=0.04 secs]
2021-05-16T14:31:35.812-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.812-0800: [ParNew: 314554K->34943K(314560K), 0.0452114 secs] 581644K->391195K(1013632K), 0.0452466 secs] [Times: user=0.41 sys=0.03, real=0.04 secs]
2021-05-16T14:31:35.857-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 356252K(699072K)] 397109K(1013632K), 0.0004454 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-16T14:31:35.858-0800: [CMS-concurrent-mark-start]
2021-05-16T14:31:35.861-0800: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2021-05-16T14:31:35.861-0800: [CMS-concurrent-preclean-start]
2021-05-16T14:31:35.862-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:31:35.862-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-16T14:31:35.897-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.897-0800: [ParNew: 314559K->34943K(314560K), 0.0399670 secs] 670811K->465642K(1013632K), 0.0400020 secs] [Times: user=0.37 sys=0.02, real=0.04 secs]
2021-05-16T14:31:35.975-0800: [GC (Allocation Failure) 2021-05-16T14:31:35.975-0800: [ParNew: 314559K->34943K(314560K), 0.0460358 secs] 745258K->540504K(1013632K), 0.0460705 secs] [Times: user=0.43 sys=0.03, real=0.05 secs]
2021-05-16T14:31:36.054-0800: [GC (Allocation Failure) 2021-05-16T14:31:36.054-0800: [ParNew: 314559K->34943K(314560K), 0.0490585 secs] 820120K->626216K(1013632K), 0.0490908 secs] [Times: user=0.46 sys=0.03, real=0.05 secs]
2021-05-16T14:31:36.132-0800: [GC (Allocation Failure) 2021-05-16T14:31:36.132-0800: [ParNew: 314559K->34943K(314560K), 0.0476112 secs] 905832K->710411K(1013632K), 0.0476438 secs] [Times: user=0.44 sys=0.03, real=0.05 secs]
2021-05-16T14:31:36.180-0800: [CMS-concurrent-abortable-preclean: 0.008/0.318 secs] [Times: user=1.84 sys=0.11, real=0.32 secs]
2021-05-16T14:31:36.180-0800: [GC (CMS Final Remark) [YG occupancy: 35496 K (314560 K)]2021-05-16T14:31:36.180-0800: [Rescan (parallel) , 0.0002843 secs]2021-05-16T14:31:36.180-0800: [weak refs processing, 0.0000719 secs]2021-05-16T14:31:36.180-0800: [class unloading, 0.0002178 secs]2021-05-16T14:31:36.181-0800: [scrub symbol table, 0.0002676 secs]2021-05-16T14:31:36.181-0800: [scrub string table, 0.0001592 secs][1 CMS-remark: 675467K(699072K)] 710964K(1013632K), 0.0010547 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:31:36.181-0800: [CMS-concurrent-sweep-start]
2021-05-16T14:31:36.182-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:31:36.182-0800: [CMS-concurrent-reset-start]
2021-05-16T14:31:36.184-0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-16T14:31:36.212-0800: [GC (Allocation Failure) 2021-05-16T14:31:36.212-0800: [ParNew: 314559K->34942K(314560K), 0.0162089 secs] 870453K->667168K(1013632K), 0.0162462 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
2021-05-16T14:31:36.228-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 632225K(699072K)] 667287K(1013632K), 0.0001606 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:31:36.229-0800: [CMS-concurrent-mark-start]
2021-05-16T14:31:36.230-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2021-05-16T14:31:36.230-0800: [CMS-concurrent-preclean-start]
2021-05-16T14:31:36.231-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:31:36.231-0800: [CMS-concurrent-abortable-preclean-start]
2021-05-16T14:31:36.269-0800: [GC (Allocation Failure) 2021-05-16T14:31:36.269-0800: [ParNew: 314558K->314558K(314560K), 0.0000182 secs]2021-05-16T14:31:36.269-0800: [CMS2021-05-16T14:31:36.269-0800: [CMS-concurrent-abortable-preclean: 0.002/0.038 secs] [Times: user=0.04 sys=0.00, real=0.03 secs]
 (concurrent mode failure): 632225K->350123K(699072K), 0.0653725 secs] 946784K->350123K(1013632K), [Metaspace: 2863K->2863K(1056768K)], 0.0654520 secs] [Times: user=0.07 sys=0.00, real=0.07 secs]
执行结束!共生成对象次数:12445
Heap
 par new generation   total 314560K, used 243975K [0x0000000780000000, 0x0000000795550000, 0x0000000795550000)
  eden space 279616K,  87% used [0x0000000780000000, 0x000000078ee41db8, 0x0000000791110000)
  from space 34944K,   0% used [0x0000000791110000, 0x0000000791110000, 0x0000000793330000)
  to   space 34944K,   0% used [0x0000000793330000, 0x0000000793330000, 0x0000000795550000)
 concurrent mark-sweep generation total 699072K, used 350123K [0x0000000795550000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
```
## CMS GC (2g)
` $ java -XX:+UseConcMarkSweepGC -Xms2g -Xmx2g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
```
正在执行...
2021-05-16T14:32:07.484-0800: [GC (Allocation Failure) 2021-05-16T14:32:07.484-0800: [ParNew: 559232K->69887K(629120K), 0.0591214 secs] 559232K->149396K(2027264K), 0.0591612 secs] [Times: user=0.10 sys=0.37, real=0.06 secs]
2021-05-16T14:32:07.617-0800: [GC (Allocation Failure) 2021-05-16T14:32:07.617-0800: [ParNew: 629119K->69887K(629120K), 0.0583101 secs] 708628K->278428K(2027264K), 0.0583416 secs] [Times: user=0.13 sys=0.36, real=0.06 secs]
2021-05-16T14:32:07.741-0800: [GC (Allocation Failure) 2021-05-16T14:32:07.741-0800: [ParNew: 629119K->69888K(629120K), 0.0681643 secs] 837660K->406219K(2027264K), 0.0681982 secs] [Times: user=0.64 sys=0.03, real=0.06 secs]
2021-05-16T14:32:07.878-0800: [GC (Allocation Failure) 2021-05-16T14:32:07.878-0800: [ParNew: 629120K->69887K(629120K), 0.0720941 secs] 965451K->533983K(2027264K), 0.0721257 secs] [Times: user=0.68 sys=0.04, real=0.08 secs]
2021-05-16T14:32:08.020-0800: [GC (Allocation Failure) 2021-05-16T14:32:08.020-0800: [ParNew: 629119K->69887K(629120K), 0.0624349 secs] 1093215K->655850K(2027264K), 0.0624673 secs] [Times: user=0.58 sys=0.03, real=0.06 secs]
2021-05-16T14:32:08.150-0800: [GC (Allocation Failure) 2021-05-16T14:32:08.150-0800: [ParNew: 629119K->69887K(629120K), 0.0620700 secs] 1215082K->772688K(2027264K), 0.0621010 secs] [Times: user=0.58 sys=0.04, real=0.06 secs]
2021-05-16T14:32:08.212-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 702801K(1398144K)] 784257K(2027264K), 0.0003973 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:32:08.212-0800: [CMS-concurrent-mark-start]
2021-05-16T14:32:08.217-0800: [CMS-concurrent-mark: 0.004/0.004 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2021-05-16T14:32:08.217-0800: [CMS-concurrent-preclean-start]
2021-05-16T14:32:08.219-0800: [CMS-concurrent-preclean: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2021-05-16T14:32:08.219-0800: [CMS-concurrent-abortable-preclean-start]
执行结束!共生成对象次数:13403
Heap
 par new generation   total 629120K, used 289315K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,  39% used [0x0000000740000000, 0x000000074d649140, 0x0000000762220000)
  from space 69888K,  99% used [0x0000000762220000, 0x000000076665fda8, 0x0000000766660000)
  to   space 69888K,   0% used [0x0000000766660000, 0x0000000766660000, 0x000000076aaa0000)
 concurrent mark-sweep generation total 1398144K, used 702801K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
```
## CMS GC (4g)
` $ java -XX:+UseConcMarkSweepGC -Xms4g -Xmx4g -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
正在执行...
2021-05-15T16:28:57.365-0800: [GC (Allocation Failure) 2021-05-15T16:28:57.365-0800: [ParNew: 681600K->85183K(766784K), 0.0618463 secs] 681600K->166481K(4109120K), 0.0619004 secs] [Times: user=0.13 sys=0.37, real=0.06 secs]
2021-05-15T16:28:57.509-0800: [GC (Allocation Failure) 2021-05-15T16:28:57.510-0800: [ParNew: 766783K->85184K(766784K), 0.0592130 secs] 848081K->303485K(4109120K), 0.0592440 secs] [Times: user=0.14 sys=0.36, real=0.06 secs]
2021-05-15T16:28:57.640-0800: [GC (Allocation Failure) 2021-05-15T16:28:57.640-0800: [ParNew: 766784K->85183K(766784K), 0.0670418 secs] 985085K->431785K(4109120K), 0.0670732 secs] [Times: user=0.63 sys=0.03, real=0.06 secs]
2021-05-15T16:28:57.778-0800: [GC (Allocation Failure) 2021-05-15T16:28:57.778-0800: [ParNew: 766783K->85182K(766784K), 0.0680752 secs] 1113385K->566636K(4109120K), 0.0681080 secs] [Times: user=0.64 sys=0.04, real=0.07 secs]
2021-05-15T16:28:57.917-0800: [GC (Allocation Failure) 2021-05-15T16:28:57.917-0800: [ParNew: 766782K->85182K(766784K), 0.0673717 secs] 1248236K->701016K(4109120K), 0.0674013 secs] [Times: user=0.63 sys=0.03, real=0.07 secs]
2021-05-15T16:28:58.051-0800: [GC (Allocation Failure) 2021-05-15T16:28:58.051-0800: [ParNew: 766782K->85183K(766784K), 0.0724904 secs] 1382616K->846690K(4109120K), 0.0725203 secs] [Times: user=0.68 sys=0.04, real=0.07 secs]
执行结束!共生成对象次数:15530
Heap
 par new generation   total 766784K, used 112554K [0x00000006c0000000, 0x00000006f4000000, 0x00000006f4000000)
  eden space 681600K,   4% used [0x00000006c0000000, 0x00000006c1abae10, 0x00000006e99a0000)
  from space 85184K,  99% used [0x00000006e99a0000, 0x00000006eeccfd40, 0x00000006eecd0000)
  to   space 85184K,   0% used [0x00000006eecd0000, 0x00000006eecd0000, 0x00000006f4000000)
 concurrent mark-sweep generation total 3342336K, used 761507K [0x00000006f4000000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ## G1 GC（512m）
  ` $ java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
  输出结果太多。。。
  ```
  ` $ java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
  正在执行...
2021-05-15T16:40:51.289-0800: [GC pause (G1 Evacuation Pause) (young) 29450K->9623K(512M), 0.0038132 secs]
2021-05-15T16:40:51.301-0800: [GC pause (G1 Evacuation Pause) (young) 42711K->19359K(512M), 0.0033195 secs]
2021-05-15T16:40:51.330-0800: [GC pause (G1 Evacuation Pause) (young) 93333K->43867K(512M), 0.0073990 secs]
2021-05-15T16:40:51.358-0800: [GC pause (G1 Evacuation Pause) (young) 125M->69973K(512M), 0.0078577 secs]
2021-05-15T16:40:51.511-0800: [GC pause (G1 Evacuation Pause) (young)-- 442M->344M(512M), 0.0097397 secs]
2021-05-15T16:40:51.522-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 351M->345M(512M), 0.0044988 secs]
2021-05-15T16:40:51.527-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.527-0800: [GC concurrent-root-region-scan-end, 0.0001363 secs]
2021-05-15T16:40:51.527-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.529-0800: [GC concurrent-mark-end, 0.0017610 secs]
2021-05-15T16:40:51.529-0800: [GC remark, 0.0008429 secs]
2021-05-15T16:40:51.530-0800: [GC cleanup 359M->359M(512M), 0.0004809 secs]
2021-05-15T16:40:51.541-0800: [GC pause (G1 Evacuation Pause) (young) 431M->379M(512M), 0.0036637 secs]
2021-05-15T16:40:51.548-0800: [GC pause (G1 Evacuation Pause) (mixed) 397M->334M(512M), 0.0027785 secs]
2021-05-15T16:40:51.555-0800: [GC pause (G1 Evacuation Pause) (mixed) 362M->299M(512M), 0.0027836 secs]
2021-05-15T16:40:51.562-0800: [GC pause (G1 Evacuation Pause) (mixed) 324M->267M(512M), 0.0029159 secs]
2021-05-15T16:40:51.570-0800: [GC pause (G1 Evacuation Pause) (mixed) 295M->240M(512M), 0.0033044 secs]
2021-05-15T16:40:51.577-0800: [GC pause (G1 Evacuation Pause) (mixed) 264M->243M(512M), 0.0028575 secs]
2021-05-15T16:40:51.580-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 246M->242M(512M), 0.0012293 secs]
2021-05-15T16:40:51.581-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.581-0800: [GC concurrent-root-region-scan-end, 0.0001166 secs]
2021-05-15T16:40:51.581-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.582-0800: [GC concurrent-mark-end, 0.0008050 secs]
2021-05-15T16:40:51.582-0800: [GC remark, 0.0011110 secs]
2021-05-15T16:40:51.583-0800: [GC cleanup 248M->247M(512M), 0.0004973 secs]
2021-05-15T16:40:51.584-0800: [GC concurrent-cleanup-start]
2021-05-15T16:40:51.584-0800: [GC concurrent-cleanup-end, 0.0000122 secs]
2021-05-15T16:40:51.614-0800: [GC pause (G1 Evacuation Pause) (young)-- 428M->363M(512M), 0.0037903 secs]
2021-05-15T16:40:51.619-0800: [GC pause (G1 Evacuation Pause) (mixed) 371M->346M(512M), 0.0040525 secs]
2021-05-15T16:40:51.624-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 351M->348M(512M), 0.0013112 secs]
2021-05-15T16:40:51.625-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.625-0800: [GC concurrent-root-region-scan-end, 0.0001051 secs]
2021-05-15T16:40:51.625-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.626-0800: [GC concurrent-mark-end, 0.0008651 secs]
2021-05-15T16:40:51.626-0800: [GC remark, 0.0010703 secs]
2021-05-15T16:40:51.627-0800: [GC cleanup 356M->352M(512M), 0.0005581 secs]
2021-05-15T16:40:51.628-0800: [GC concurrent-cleanup-start]
2021-05-15T16:40:51.628-0800: [GC concurrent-cleanup-end, 0.0000186 secs]
2021-05-15T16:40:51.639-0800: [GC pause (G1 Evacuation Pause) (young) 419M->365M(512M), 0.0040779 secs]
2021-05-15T16:40:51.646-0800: [GC pause (G1 Evacuation Pause) (mixed) 384M->325M(512M), 0.0029125 secs]
2021-05-15T16:40:51.653-0800: [GC pause (G1 Evacuation Pause) (mixed) 349M->302M(512M), 0.0036657 secs]
2021-05-15T16:40:51.660-0800: [GC pause (G1 Evacuation Pause) (mixed) 325M->294M(512M), 0.0030436 secs]
2021-05-15T16:40:51.664-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 295M->294M(512M), 0.0013515 secs]
2021-05-15T16:40:51.665-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.665-0800: [GC concurrent-root-region-scan-end, 0.0000888 secs]
2021-05-15T16:40:51.665-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.666-0800: [GC concurrent-mark-end, 0.0008770 secs]
2021-05-15T16:40:51.666-0800: [GC remark, 0.0010529 secs]
2021-05-15T16:40:51.667-0800: [GC cleanup 302M->302M(512M), 0.0004794 secs]
2021-05-15T16:40:51.686-0800: [GC pause (G1 Evacuation Pause) (young) 420M->324M(512M), 0.0052116 secs]
2021-05-15T16:40:51.693-0800: [GC pause (G1 Evacuation Pause) (mixed) 337M->302M(512M), 0.0050626 secs]
2021-05-15T16:40:51.699-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 305M->303M(512M), 0.0015497 secs]
2021-05-15T16:40:51.701-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.701-0800: [GC concurrent-root-region-scan-end, 0.0000851 secs]
2021-05-15T16:40:51.701-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.702-0800: [GC concurrent-mark-end, 0.0008665 secs]
2021-05-15T16:40:51.702-0800: [GC remark, 0.0012838 secs]
2021-05-15T16:40:51.703-0800: [GC cleanup 309M->309M(512M), 0.0006563 secs]
2021-05-15T16:40:51.722-0800: [GC pause (G1 Evacuation Pause) (young) 427M->329M(512M), 0.0038094 secs]
2021-05-15T16:40:51.729-0800: [GC pause (G1 Evacuation Pause) (mixed) 344M->310M(512M), 0.0047038 secs]
2021-05-15T16:40:51.734-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 312M->311M(512M), 0.0014621 secs]
2021-05-15T16:40:51.735-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.736-0800: [GC concurrent-root-region-scan-end, 0.0000953 secs]
2021-05-15T16:40:51.736-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.737-0800: [GC concurrent-mark-end, 0.0009600 secs]
2021-05-15T16:40:51.737-0800: [GC remark, 0.0012036 secs]
2021-05-15T16:40:51.738-0800: [GC cleanup 320M->320M(512M), 0.0006328 secs]
2021-05-15T16:40:51.754-0800: [GC pause (G1 Evacuation Pause) (young) 415M->337M(512M), 0.0035700 secs]
2021-05-15T16:40:51.760-0800: [GC pause (G1 Evacuation Pause) (mixed) 354M->323M(512M), 0.0042805 secs]
2021-05-15T16:40:51.765-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 326M->324M(512M), 0.0014140 secs]
2021-05-15T16:40:51.766-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.766-0800: [GC concurrent-root-region-scan-end, 0.0001137 secs]
2021-05-15T16:40:51.766-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.767-0800: [GC concurrent-mark-end, 0.0008429 secs]
2021-05-15T16:40:51.767-0800: [GC remark, 0.0010886 secs]
2021-05-15T16:40:51.769-0800: [GC cleanup 330M->330M(512M), 0.0005712 secs]
2021-05-15T16:40:51.783-0800: [GC pause (G1 Evacuation Pause) (young) 411M->351M(512M), 0.0035360 secs]
2021-05-15T16:40:51.790-0800: [GC pause (G1 Evacuation Pause) (mixed) 372M->336M(512M), 0.0048809 secs]
2021-05-15T16:40:51.796-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 341M->337M(512M), 0.0016368 secs]
2021-05-15T16:40:51.797-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.797-0800: [GC concurrent-root-region-scan-end, 0.0001002 secs]
2021-05-15T16:40:51.797-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.798-0800: [GC concurrent-mark-end, 0.0008576 secs]
2021-05-15T16:40:51.798-0800: [GC remark, 0.0011976 secs]
2021-05-15T16:40:51.800-0800: [GC cleanup 342M->342M(512M), 0.0005358 secs]
2021-05-15T16:40:51.810-0800: [GC pause (G1 Evacuation Pause) (young) 404M->351M(512M), 0.0034057 secs]
2021-05-15T16:40:51.816-0800: [GC pause (G1 Evacuation Pause) (mixed) 373M->339M(512M), 0.0049581 secs]
2021-05-15T16:40:51.826-0800: [GC pause (G1 Evacuation Pause) (mixed) 364M->344M(512M), 0.0023542 secs]
2021-05-15T16:40:51.829-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 347M->345M(512M), 0.0014227 secs]
2021-05-15T16:40:51.830-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.830-0800: [GC concurrent-root-region-scan-end, 0.0001219 secs]
2021-05-15T16:40:51.830-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.831-0800: [GC concurrent-mark-end, 0.0008923 secs]
2021-05-15T16:40:51.831-0800: [GC remark, 0.0012060 secs]
2021-05-15T16:40:51.833-0800: [GC cleanup 354M->354M(512M), 0.0004527 secs]
2021-05-15T16:40:51.842-0800: [GC pause (G1 Evacuation Pause) (young) 409M->366M(512M), 0.0039197 secs]
2021-05-15T16:40:51.849-0800: [GC pause (G1 Evacuation Pause) (mixed) 386M->345M(512M), 0.0045522 secs]
2021-05-15T16:40:51.858-0800: [GC pause (G1 Evacuation Pause) (mixed) 368M->347M(512M), 0.0028921 secs]
2021-05-15T16:40:51.861-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 347M->347M(512M), 0.0015286 secs]
2021-05-15T16:40:51.863-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.863-0800: [GC concurrent-root-region-scan-end, 0.0001028 secs]
2021-05-15T16:40:51.863-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.864-0800: [GC concurrent-mark-end, 0.0009317 secs]
2021-05-15T16:40:51.864-0800: [GC remark, 0.0012210 secs]
2021-05-15T16:40:51.865-0800: [GC cleanup 354M->354M(512M), 0.0004194 secs]
2021-05-15T16:40:51.875-0800: [GC pause (G1 Evacuation Pause) (young) 410M->363M(512M), 0.0032194 secs]
2021-05-15T16:40:51.882-0800: [GC pause (G1 Evacuation Pause) (mixed) 385M->349M(512M), 0.0048684 secs]
2021-05-15T16:40:51.891-0800: [GC pause (G1 Evacuation Pause) (mixed) 373M->352M(512M), 0.0027076 secs]
2021-05-15T16:40:51.894-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 354M->353M(512M), 0.0015638 secs]
2021-05-15T16:40:51.896-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.896-0800: [GC concurrent-root-region-scan-end, 0.0000953 secs]
2021-05-15T16:40:51.896-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.897-0800: [GC concurrent-mark-end, 0.0008124 secs]
2021-05-15T16:40:51.897-0800: [GC remark, 0.0012396 secs]
2021-05-15T16:40:51.898-0800: [GC cleanup 359M->358M(512M), 0.0004425 secs]
2021-05-15T16:40:51.899-0800: [GC concurrent-cleanup-start]
2021-05-15T16:40:51.899-0800: [GC concurrent-cleanup-end, 0.0000152 secs]
2021-05-15T16:40:51.907-0800: [GC pause (G1 Evacuation Pause) (young) 411M->368M(512M), 0.0037804 secs]
2021-05-15T16:40:51.915-0800: [GC pause (G1 Evacuation Pause) (mixed) 392M->358M(512M), 0.0049576 secs]
2021-05-15T16:40:51.921-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 362M->358M(512M), 0.0015939 secs]
2021-05-15T16:40:51.922-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.922-0800: [GC concurrent-root-region-scan-end, 0.0001164 secs]
2021-05-15T16:40:51.922-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.923-0800: [GC concurrent-mark-end, 0.0010295 secs]
2021-05-15T16:40:51.924-0800: [GC remark, 0.0014230 secs]
2021-05-15T16:40:51.925-0800: [GC cleanup 364M->364M(512M), 0.0006091 secs]
2021-05-15T16:40:51.933-0800: [GC pause (G1 Evacuation Pause) (young) 409M->367M(512M), 0.0024337 secs]
2021-05-15T16:40:51.940-0800: [GC pause (G1 Evacuation Pause) (mixed) 391M->356M(512M), 0.0059063 secs]
2021-05-15T16:40:51.946-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 357M->356M(512M), 0.0017093 secs]
2021-05-15T16:40:51.948-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.948-0800: [GC concurrent-root-region-scan-end, 0.0000854 secs]
2021-05-15T16:40:51.948-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.949-0800: [GC concurrent-mark-end, 0.0011134 secs]
2021-05-15T16:40:51.949-0800: [GC remark, 0.0012629 secs]
2021-05-15T16:40:51.950-0800: [GC cleanup 363M->363M(512M), 0.0004684 secs]
2021-05-15T16:40:51.958-0800: [GC pause (G1 Evacuation Pause) (young) 408M->368M(512M), 0.0028755 secs]
2021-05-15T16:40:51.964-0800: [GC pause (G1 Evacuation Pause) (mixed) 391M->360M(512M), 0.0040674 secs]
2021-05-15T16:40:51.969-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 364M->361M(512M), 0.0014967 secs]
2021-05-15T16:40:51.970-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.971-0800: [GC concurrent-root-region-scan-end, 0.0000984 secs]
2021-05-15T16:40:51.971-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.971-0800: [GC concurrent-mark-end, 0.0008873 secs]
2021-05-15T16:40:51.972-0800: [GC remark, 0.0013188 secs]
2021-05-15T16:40:51.973-0800: [GC cleanup 368M->368M(512M), 0.0006414 secs]
2021-05-15T16:40:51.980-0800: [GC pause (G1 Evacuation Pause) (young) 404M->372M(512M), 0.0024901 secs]
2021-05-15T16:40:51.987-0800: [GC pause (G1 Evacuation Pause) (mixed) 399M->364M(512M), 0.0047693 secs]
2021-05-15T16:40:51.992-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 367M->365M(512M), 0.0013540 secs]
2021-05-15T16:40:51.994-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:51.994-0800: [GC concurrent-root-region-scan-end, 0.0000719 secs]
2021-05-15T16:40:51.994-0800: [GC concurrent-mark-start]
2021-05-15T16:40:51.995-0800: [GC concurrent-mark-end, 0.0009795 secs]
2021-05-15T16:40:51.995-0800: [GC remark, 0.0013124 secs]
2021-05-15T16:40:51.996-0800: [GC cleanup 371M->371M(512M), 0.0006071 secs]
2021-05-15T16:40:52.003-0800: [GC pause (G1 Evacuation Pause) (young) 407M->374M(512M), 0.0026020 secs]
2021-05-15T16:40:52.009-0800: [GC pause (G1 Evacuation Pause) (mixed) 402M->365M(512M), 0.0058344 secs]
2021-05-15T16:40:52.016-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 370M->366M(512M), 0.0014136 secs]
2021-05-15T16:40:52.017-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.018-0800: [GC concurrent-root-region-scan-end, 0.0001311 secs]
2021-05-15T16:40:52.018-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.019-0800: [GC concurrent-mark-end, 0.0010408 secs]
2021-05-15T16:40:52.019-0800: [GC remark, 0.0013333 secs]
2021-05-15T16:40:52.020-0800: [GC cleanup 374M->374M(512M), 0.0005966 secs]
2021-05-15T16:40:52.026-0800: [GC pause (G1 Evacuation Pause) (young) 402M->374M(512M), 0.0021729 secs]
2021-05-15T16:40:52.032-0800: [GC pause (G1 Evacuation Pause) (mixed) 402M->363M(512M), 0.0043706 secs]
2021-05-15T16:40:52.037-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 365M->364M(512M), 0.0013383 secs]
2021-05-15T16:40:52.038-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.038-0800: [GC concurrent-root-region-scan-end, 0.0001216 secs]
2021-05-15T16:40:52.038-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.039-0800: [GC concurrent-mark-end, 0.0009030 secs]
2021-05-15T16:40:52.039-0800: [GC remark, 0.0012875 secs]
2021-05-15T16:40:52.040-0800: [GC cleanup 371M->371M(512M), 0.0005825 secs]
2021-05-15T16:40:52.046-0800: [GC pause (G1 Evacuation Pause) (young) 402M->375M(512M), 0.0023989 secs]
2021-05-15T16:40:52.053-0800: [GC pause (G1 Evacuation Pause) (mixed) 400M->369M(512M), 0.0048255 secs]
2021-05-15T16:40:52.059-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 377M->371M(512M), 0.0015999 secs]
2021-05-15T16:40:52.061-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.061-0800: [GC concurrent-root-region-scan-end, 0.0001404 secs]
2021-05-15T16:40:52.061-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.062-0800: [GC concurrent-mark-end, 0.0009357 secs]
2021-05-15T16:40:52.062-0800: [GC remark, 0.0013380 secs]
2021-05-15T16:40:52.063-0800: [GC cleanup 378M->378M(512M), 0.0005464 secs]
2021-05-15T16:40:52.068-0800: [GC pause (G1 Evacuation Pause) (young) 401M->381M(512M), 0.0022775 secs]
2021-05-15T16:40:52.075-0800: [GC pause (G1 Evacuation Pause) (mixed) 406M->375M(512M), 0.0053068 secs]
2021-05-15T16:40:52.080-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 375M->375M(512M), 0.0014400 secs]
2021-05-15T16:40:52.081-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.082-0800: [GC concurrent-root-region-scan-end, 0.0000655 secs]
2021-05-15T16:40:52.082-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.083-0800: [GC concurrent-mark-end, 0.0011190 secs]
2021-05-15T16:40:52.083-0800: [GC remark, 0.0012913 secs]
2021-05-15T16:40:52.084-0800: [GC cleanup 384M->384M(512M), 0.0006297 secs]
2021-05-15T16:40:52.089-0800: [GC pause (G1 Evacuation Pause) (young) 409M->386M(512M), 0.0023789 secs]
2021-05-15T16:40:52.096-0800: [GC pause (G1 Evacuation Pause) (mixed) 411M->378M(512M), 0.0047483 secs]
2021-05-15T16:40:52.102-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 385M->378M(512M), 0.0019743 secs]
2021-05-15T16:40:52.104-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.104-0800: [GC concurrent-root-region-scan-end, 0.0001032 secs]
2021-05-15T16:40:52.104-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.105-0800: [GC concurrent-mark-end, 0.0010792 secs]
2021-05-15T16:40:52.105-0800: [GC remark, 0.0014105 secs]
2021-05-15T16:40:52.107-0800: [GC cleanup 385M->385M(512M), 0.0007534 secs]
2021-05-15T16:40:52.111-0800: [GC pause (G1 Evacuation Pause) (young) 407M->387M(512M), 0.0023203 secs]
2021-05-15T16:40:52.118-0800: [GC pause (G1 Evacuation Pause) (mixed) 414M->381M(512M), 0.0045601 secs]
2021-05-15T16:40:52.123-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 383M->381M(512M), 0.0014738 secs]
2021-05-15T16:40:52.124-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.124-0800: [GC concurrent-root-region-scan-end, 0.0000861 secs]
2021-05-15T16:40:52.124-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.125-0800: [GC concurrent-mark-end, 0.0009246 secs]
2021-05-15T16:40:52.125-0800: [GC remark, 0.0013562 secs]
2021-05-15T16:40:52.127-0800: [GC cleanup 387M->387M(512M), 0.0005426 secs]
2021-05-15T16:40:52.131-0800: [GC pause (G1 Evacuation Pause) (young) 413M->387M(512M), 0.0019606 secs]
2021-05-15T16:40:52.138-0800: [GC pause (G1 Evacuation Pause) (mixed) 415M->383M(512M), 0.0050627 secs]
2021-05-15T16:40:52.144-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 385M->382M(512M), 0.0014649 secs]
2021-05-15T16:40:52.145-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.145-0800: [GC concurrent-root-region-scan-end, 0.0001041 secs]
2021-05-15T16:40:52.145-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.146-0800: [GC concurrent-mark-end, 0.0009024 secs]
2021-05-15T16:40:52.146-0800: [GC remark, 0.0012437 secs]
2021-05-15T16:40:52.148-0800: [GC cleanup 388M->388M(512M), 0.0005611 secs]
2021-05-15T16:40:52.152-0800: [GC pause (G1 Evacuation Pause) (young) 413M->393M(512M), 0.0020990 secs]
2021-05-15T16:40:52.158-0800: [GC pause (G1 Evacuation Pause) (mixed) 417M->384M(512M), 0.0040183 secs]
2021-05-15T16:40:52.162-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 385M->384M(512M), 0.0013616 secs]
2021-05-15T16:40:52.163-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.164-0800: [GC concurrent-root-region-scan-end, 0.0001293 secs]
2021-05-15T16:40:52.164-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.165-0800: [GC concurrent-mark-end, 0.0010153 secs]
2021-05-15T16:40:52.165-0800: [GC remark, 0.0013566 secs]
2021-05-15T16:40:52.166-0800: [GC cleanup 392M->392M(512M), 0.0005910 secs]
2021-05-15T16:40:52.170-0800: [GC pause (G1 Evacuation Pause) (young) 414M->390M(512M), 0.0019276 secs]
2021-05-15T16:40:52.177-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 419M->393M(512M), 0.0046112 secs]
2021-05-15T16:40:52.182-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 395M->393M(512M), 0.0013650 secs]
2021-05-15T16:40:52.183-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.183-0800: [GC concurrent-root-region-scan-end, 0.0000584 secs]
2021-05-15T16:40:52.183-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.184-0800: [GC concurrent-mark-end, 0.0010775 secs]
2021-05-15T16:40:52.185-0800: [GC remark, 0.0013234 secs]
2021-05-15T16:40:52.186-0800: [GC cleanup 399M->399M(512M), 0.0005468 secs]
2021-05-15T16:40:52.191-0800: [GC pause (G1 Evacuation Pause) (young) 424M->400M(512M), 0.0019776 secs]
2021-05-15T16:40:52.197-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 429M->420M(512M), 0.0035856 secs]
2021-05-15T16:40:52.201-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 424M->422M(512M), 0.0018062 secs]
2021-05-15T16:40:52.203-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.203-0800: [GC concurrent-root-region-scan-end, 0.0001080 secs]
2021-05-15T16:40:52.203-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.204-0800: [GC concurrent-mark-end, 0.0009594 secs]
2021-05-15T16:40:52.204-0800: [GC remark, 0.0014080 secs]
2021-05-15T16:40:52.206-0800: [GC cleanup 428M->428M(512M), 0.0008618 secs]
2021-05-15T16:40:52.210-0800: [GC pause (G1 Evacuation Pause) (young)-- 450M->442M(512M), 0.0016111 secs]
2021-05-15T16:40:52.214-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 453M->450M(512M), 0.0013107 secs]
2021-05-15T16:40:52.216-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 454M->452M(512M), 0.0012295 secs]
2021-05-15T16:40:52.217-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 453M->453M(512M), 0.0006802 secs]
2021-05-15T16:40:52.218-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.218-0800: [GC concurrent-root-region-scan-end, 0.0000517 secs]
2021-05-15T16:40:52.218-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.218-0800: [GC pause (G1 Evacuation Pause) (young)-- 453M->453M(512M), 0.0009411 secs]
2021-05-15T16:40:52.219-0800: [GC pause (G1 Evacuation Pause) (young) 453M->453M(512M), 0.0008369 secs]
2021-05-15T16:40:52.220-0800: [Full GC (Allocation Failure)  453M->337M(512M), 0.0345806 secs]
2021-05-15T16:40:52.254-0800: [GC concurrent-mark-abort]
2021-05-15T16:40:52.256-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 345M->339M(512M), 0.0013789 secs]
2021-05-15T16:40:52.257-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.257-0800: [GC concurrent-root-region-scan-end, 0.0000906 secs]
2021-05-15T16:40:52.257-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.258-0800: [GC concurrent-mark-end, 0.0009037 secs]
2021-05-15T16:40:52.258-0800: [GC remark, 0.0014505 secs]
2021-05-15T16:40:52.260-0800: [GC cleanup 347M->347M(512M), 0.0005538 secs]
2021-05-15T16:40:52.265-0800: [GC pause (G1 Evacuation Pause) (young) 375M->350M(512M), 0.0023734 secs]
2021-05-15T16:40:52.267-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 351M->350M(512M), 0.0011319 secs]
2021-05-15T16:40:52.268-0800: [GC concurrent-root-region-scan-start]
2021-05-15T16:40:52.269-0800: [GC concurrent-root-region-scan-end, 0.0000472 secs]
2021-05-15T16:40:52.269-0800: [GC concurrent-mark-start]
2021-05-15T16:40:52.270-0800: [GC concurrent-mark-end, 0.0010541 secs]
2021-05-15T16:40:52.270-0800: [GC remark, 0.0013024 secs]
2021-05-15T16:40:52.271-0800: [GC cleanup 357M->357M(512M), 0.0004762 secs]
执行结束!共生成对象次数:10994
  ```
`$ java -XX:+UseG1GC -Xms4g -Xmx4g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
`
  ```
  正在执行...
2021-05-15T16:42:29.479-0800: [GC pause (G1 Evacuation Pause) (young) 204M->66628K(4096M), 0.0236274 secs]
2021-05-15T16:42:29.528-0800: [GC pause (G1 Evacuation Pause) (young) 243M->122M(4096M), 0.0223389 secs]
2021-05-15T16:42:29.573-0800: [GC pause (G1 Evacuation Pause) (young) 300M->175M(4096M), 0.0201233 secs]
2021-05-15T16:42:29.618-0800: [GC pause (G1 Evacuation Pause) (young) 353M->227M(4096M), 0.0210939 secs]
2021-05-15T16:42:29.662-0800: [GC pause (G1 Evacuation Pause) (young) 405M->284M(4096M), 0.0241895 secs]
2021-05-15T16:42:29.709-0800: [GC pause (G1 Evacuation Pause) (young) 462M->340M(4096M), 0.0216929 secs]
2021-05-15T16:42:29.752-0800: [GC pause (G1 Evacuation Pause) (young) 518M->404M(4096M), 0.0239587 secs]
2021-05-15T16:42:29.800-0800: [GC pause (G1 Evacuation Pause) (young) 594M->457M(4096M), 0.0195094 secs]
2021-05-15T16:42:29.868-0800: [GC pause (G1 Evacuation Pause) (young) 717M->535M(4096M), 0.0307518 secs]
2021-05-15T16:42:29.933-0800: [GC pause (G1 Evacuation Pause) (young) 815M->620M(4096M), 0.0322469 secs]
2021-05-15T16:42:30.005-0800: [GC pause (G1 Evacuation Pause) (young) 934M->710M(4096M), 0.0323756 secs]
2021-05-15T16:42:30.132-0800: [GC pause (G1 Evacuation Pause) (young) 1188M->832M(4096M), 0.0485627 secs]
2021-05-15T16:42:30.234-0800: [GC pause (G1 Evacuation Pause) (young) 1278M->937M(4096M), 0.0350943 secs]
2021-05-15T16:42:30.353-0800: [GC pause (G1 Evacuation Pause) (young) 1509M->1061M(4096M), 0.0466633 secs]
执行结束!共生成对象次数:14037
```
## G1 GC（1g）
  ` $ java -XX:+UseG1GC -Xms1g -Xmx1g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
  正在执行...
2021-05-16T14:36:12.113-0800: [GC pause (G1 Evacuation Pause) (young) 65253K->29018K(1024M), 0.0072294 secs]
2021-05-16T14:36:12.136-0800: [GC pause (G1 Evacuation Pause) (young) 86282K->52367K(1024M), 0.0068846 secs]
2021-05-16T14:36:12.153-0800: [GC pause (G1 Evacuation Pause) (young) 102M->70188K(1024M), 0.0066436 secs]
2021-05-16T14:36:12.183-0800: [GC pause (G1 Evacuation Pause) (young) 138M->94592K(1024M), 0.0098441 secs]
2021-05-16T14:36:12.253-0800: [GC pause (G1 Evacuation Pause) (young) 243M->142M(1024M), 0.0168182 secs]
2021-05-16T14:36:12.297-0800: [GC pause (G1 Evacuation Pause) (young) 247M->172M(1024M), 0.0109197 secs]
2021-05-16T14:36:12.602-0800: [GC pause (G1 Evacuation Pause) (young)-- 910M->662M(1024M), 0.0099751 secs]
2021-05-16T14:36:12.613-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 665M->664M(1024M), 0.0020900 secs]
2021-05-16T14:36:12.615-0800: [GC concurrent-root-region-scan-start]
2021-05-16T14:36:12.615-0800: [GC concurrent-root-region-scan-end, 0.0004159 secs]
2021-05-16T14:36:12.615-0800: [GC concurrent-mark-start]
2021-05-16T14:36:12.619-0800: [GC concurrent-mark-end, 0.0031613 secs]
2021-05-16T14:36:12.619-0800: [GC remark, 0.0010733 secs]
2021-05-16T14:36:12.620-0800: [GC cleanup 687M->684M(1024M), 0.0008910 secs]
2021-05-16T14:36:12.621-0800: [GC concurrent-cleanup-start]
2021-05-16T14:36:12.621-0800: [GC concurrent-cleanup-end, 0.0000259 secs]
2021-05-16T14:36:12.659-0800: [GC pause (G1 Evacuation Pause) (young) 869M->725M(1024M), 0.0101875 secs]
2021-05-16T14:36:12.676-0800: [GC pause (G1 Evacuation Pause) (mixed) 763M->635M(1024M), 0.0062794 secs]
2021-05-16T14:36:12.692-0800: [GC pause (G1 Evacuation Pause) (mixed) 688M->560M(1024M), 0.0053499 secs]
2021-05-16T14:36:12.706-0800: [GC pause (G1 Evacuation Pause) (mixed) 617M->486M(1024M), 0.0061570 secs]
2021-05-16T14:36:12.724-0800: [GC pause (G1 Evacuation Pause) (mixed) 545M->424M(1024M), 0.0067117 secs]
2021-05-16T14:36:12.740-0800: [GC pause (G1 Evacuation Pause) (mixed) 475M->412M(1024M), 0.0041542 secs]
2021-05-16T14:36:12.744-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 414M->414M(1024M), 0.0019892 secs]
2021-05-16T14:36:12.746-0800: [GC concurrent-root-region-scan-start]
2021-05-16T14:36:12.746-0800: [GC concurrent-root-region-scan-end, 0.0000927 secs]
2021-05-16T14:36:12.746-0800: [GC concurrent-mark-start]
2021-05-16T14:36:12.748-0800: [GC concurrent-mark-end, 0.0014442 secs]
2021-05-16T14:36:12.748-0800: [GC remark, 0.0023413 secs]
2021-05-16T14:36:12.750-0800: [GC cleanup 419M->407M(1024M), 0.0009722 secs]
2021-05-16T14:36:12.751-0800: [GC concurrent-cleanup-start]
2021-05-16T14:36:12.751-0800: [GC concurrent-cleanup-end, 0.0000359 secs]
2021-05-16T14:36:12.835-0800: [GC pause (G1 Evacuation Pause) (young) 768M->485M(1024M), 0.0100894 secs]
2021-05-16T14:36:12.847-0800: [GC pause (G1 Evacuation Pause) (mixed) 497M->438M(1024M), 0.0101547 secs]
2021-05-16T14:36:12.857-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 440M->439M(1024M), 0.0022540 secs]
2021-05-16T14:36:12.860-0800: [GC concurrent-root-region-scan-start]
2021-05-16T14:36:12.860-0800: [GC concurrent-root-region-scan-end, 0.0002500 secs]
2021-05-16T14:36:12.860-0800: [GC concurrent-mark-start]
2021-05-16T14:36:12.862-0800: [GC concurrent-mark-end, 0.0020386 secs]
2021-05-16T14:36:12.862-0800: [GC remark, 0.0020270 secs]
2021-05-16T14:36:12.865-0800: [GC cleanup 445M->441M(1024M), 0.0011740 secs]
2021-05-16T14:36:12.866-0800: [GC concurrent-cleanup-start]
2021-05-16T14:36:12.866-0800: [GC concurrent-cleanup-end, 0.0000306 secs]
2021-05-16T14:36:12.941-0800: [GC pause (G1 Evacuation Pause) (young) 807M->512M(1024M), 0.0094810 secs]
2021-05-16T14:36:12.953-0800: [GC pause (G1 Evacuation Pause) (mixed) 526M->445M(1024M), 0.0080278 secs]
2021-05-16T14:36:12.962-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 448M->446M(1024M), 0.0016226 secs]
2021-05-16T14:36:12.963-0800: [GC concurrent-root-region-scan-start]
2021-05-16T14:36:12.963-0800: [GC concurrent-root-region-scan-end, 0.0001404 secs]
2021-05-16T14:36:12.963-0800: [GC concurrent-mark-start]
2021-05-16T14:36:12.964-0800: [GC concurrent-mark-end, 0.0011320 secs]
2021-05-16T14:36:12.965-0800: [GC remark, 0.0015614 secs]
2021-05-16T14:36:12.966-0800: [GC cleanup 452M->450M(1024M), 0.0009978 secs]
2021-05-16T14:36:12.967-0800: [GC concurrent-cleanup-start]
2021-05-16T14:36:12.967-0800: [GC concurrent-cleanup-end, 0.0000143 secs]
2021-05-16T14:36:13.035-0800: [GC pause (G1 Evacuation Pause) (young) 842M->526M(1024M), 0.0112237 secs]
2021-05-16T14:36:13.049-0800: [GC pause (G1 Evacuation Pause) (mixed) 537M->457M(1024M), 0.0138797 secs]
2021-05-16T14:36:13.075-0800: [GC pause (G1 Evacuation Pause) (mixed) 517M->468M(1024M), 0.0027596 secs]
执行结束!共生成对象次数:10777
  ```
## G1 GC（2g）
  ` $ java -XX:+UseG1GC -Xms2g -Xmx2g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis`
```
java -XX:+UseG1GC -Xms2g -Xmx2g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2021-05-16T14:36:35.313-0800: [GC pause (G1 Evacuation Pause) (young) 132M->48580K(2048M), 0.0109187 secs]
2021-05-16T14:36:35.348-0800: [GC pause (G1 Evacuation Pause) (young) 156M->80660K(2048M), 0.0106386 secs]
2021-05-16T14:36:35.384-0800: [GC pause (G1 Evacuation Pause) (young) 191M->111M(2048M), 0.0115196 secs]
2021-05-16T14:36:35.413-0800: [GC pause (G1 Evacuation Pause) (young) 213M->141M(2048M), 0.0131798 secs]
2021-05-16T14:36:35.454-0800: [GC pause (G1 Evacuation Pause) (young) 255M->173M(2048M), 0.0104835 secs]
2021-05-16T14:36:35.505-0800: [GC pause (G1 Evacuation Pause) (young) 330M->218M(2048M), 0.0138450 secs]
2021-05-16T14:36:35.565-0800: [GC pause (G1 Evacuation Pause) (young) 412M->271M(2048M), 0.0184860 secs]
2021-05-16T14:36:35.620-0800: [GC pause (G1 Evacuation Pause) (young) 483M->326M(2048M), 0.0202323 secs]
2021-05-16T14:36:35.692-0800: [GC pause (G1 Evacuation Pause) (young) 578M->395M(2048M), 0.0256754 secs]
2021-05-16T14:36:35.772-0800: [GC pause (G1 Evacuation Pause) (young) 676M->456M(2048M), 0.0265443 secs]
2021-05-16T14:36:35.845-0800: [GC pause (G1 Evacuation Pause) (young) 759M->524M(2048M), 0.0339409 secs]
2021-05-16T14:36:36.006-0800: [GC pause (G1 Evacuation Pause) (young) 1010M->624M(2048M), 0.0388770 secs]
2021-05-16T14:36:36.092-0800: [GC pause (G1 Evacuation Pause) (young) 978M->678M(2048M), 0.0255596 secs]
2021-05-16T14:36:36.205-0800: [GC pause (G1 Evacuation Pause) (young) 1163M->774M(2048M), 0.0363559 secs]
执行结束!共生成对象次数:12216
```
## G1 GC（4g）
  ` $ java -XX:+UseG1GC -Xms4g -Xmx4g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis`
  ```
  正在执行...
2021-05-16T14:37:12.778-0800: [GC pause (G1 Evacuation Pause) (young) 204M->67370K(4096M), 0.0213780 secs]
2021-05-16T14:37:12.828-0800: [GC pause (G1 Evacuation Pause) (young) 243M->116M(4096M), 0.0187519 secs]
2021-05-16T14:37:12.875-0800: [GC pause (G1 Evacuation Pause) (young) 294M->178M(4096M), 0.0220224 secs]
2021-05-16T14:37:12.923-0800: [GC pause (G1 Evacuation Pause) (young) 356M->237M(4096M), 0.0226903 secs]
2021-05-16T14:37:12.971-0800: [GC pause (G1 Evacuation Pause) (young) 415M->295M(4096M), 0.0277317 secs]
2021-05-16T14:37:13.025-0800: [GC pause (G1 Evacuation Pause) (young) 473M->354M(4096M), 0.0237669 secs]
2021-05-16T14:37:13.075-0800: [GC pause (G1 Evacuation Pause) (young) 532M->405M(4096M), 0.0208798 secs]
2021-05-16T14:37:13.123-0800: [GC pause (G1 Evacuation Pause) (young) 593M->477M(4096M), 0.0284065 secs]
2021-05-16T14:37:13.186-0800: [GC pause (G1 Evacuation Pause) (young) 703M->543M(4096M), 0.0264268 secs]
2021-05-16T14:37:13.254-0800: [GC pause (G1 Evacuation Pause) (young) 815M->631M(4096M), 0.0402925 secs]
2021-05-16T14:37:13.338-0800: [GC pause (G1 Evacuation Pause) (young) 941M->729M(4096M), 0.0419777 secs]
2021-05-16T14:37:13.527-0800: [GC pause (G1 Evacuation Pause) (young) 1283M->879M(4096M), 0.0633438 secs]
2021-05-16T14:37:13.642-0800: [GC pause (G1 Evacuation Pause) (young) 1263M->968M(4096M), 0.0386745 secs]
执行结束!共生成对象次数:11775
  ```