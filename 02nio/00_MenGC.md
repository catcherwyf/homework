`$ javac GCLogAnalysis.java`
`$ java -XX:+PrintGCDetails GCLogAnalysis`
```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 65536K->10743K(76288K)] 65536K->22664K(251392K), 0.0083178 secs] [Times: user=0.02 sys=0.05, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 76251K->10745K(141824K)] 88172K->45964K(316928K), 0.0122423 secs] [Times: user=0.02 sys=0.07, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 141817K->10751K(141824K)] 177036K->84500K(316928K), 0.0158179 secs] [Times: user=0.03 sys=0.11, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 141823K->10747K(272896K)] 215572K->127115K(448000K), 0.0197536 secs] [Times: user=0.02 sys=0.12, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 272702K->10744K(272896K)] 389070K->207599K(470528K), 0.0232241 secs] [Times: user=0.04 sys=0.15, real=0.03 secs]
[Full GC (Ergonomics) [PSYoungGen: 10744K->0K(272896K)] [ParOldGen: 196855K->172343K(332800K)] 207599K->172343K(605696K), [Metaspace: 2863K->2863K(1056768K)], 0.0210703 secs] [Times: user=0.18 sys=0.01, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 262144K->77241K(558592K)] 434487K->249584K(891392K), 0.0282480 secs] [Times: user=0.04 sys=0.19, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 558521K->110574K(592384K)] 730864K->369154K(925184K), 0.0599569 secs] [Times: user=0.10 sys=0.40, real=0.06 secs]
[Full GC (Ergonomics) [PSYoungGen: 110574K->0K(592384K)] [ParOldGen: 258580K->276982K(468480K)] 369154K->276982K(1060864K), [Metaspace: 2863K->2863K(1056768K)], 0.0324254 secs] [Times: user=0.23 sys=0.04, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 481792K->143682K(1034752K)] 758774K->420664K(1503232K), 0.0480516 secs] [Times: user=0.06 sys=0.33, real=0.05 secs]
[GC (Allocation Failure) [PSYoungGen: 1002818K->194546K(1053696K)] 1279800K->553243K(1522176K), 0.0876378 secs] [Times: user=0.12 sys=0.61, real=0.09 secs]
[GC (Allocation Failure) [PSYoungGen: 1053682K->261613K(1050112K)] 1412379K->642900K(1518592K), 0.0764837 secs] [Times: user=0.15 sys=0.48, real=0.07 secs]
[Full GC (Ergonomics) [PSYoungGen: 261613K->0K(1050112K)] [ParOldGen: 381286K->359990K(566784K)] 642900K->359990K(1616896K), [Metaspace: 2863K->2863K(1056768K)], 0.0440031 secs] [Times: user=0.37 sys=0.01, real=0.05 secs]
执行结束!共生成对象次数:13657
Heap
 PSYoungGen      total 1050112K, used 32154K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 788480K, 4% used [0x000000076ab00000,0x000000076ca66ab0,0x000000079ad00000)
  from space 261632K, 0% used [0x00000007b0080000,0x00000007b0080000,0x00000007c0000000)
  to   space 304640K, 0% used [0x000000079ad00000,0x000000079ad00000,0x00000007ad680000)
 ParOldGen       total 566784K, used 359990K [0x00000006c0000000, 0x00000006e2980000, 0x000000076ab00000)
  object space 566784K, 63% used [0x00000006c0000000,0x00000006d5f8d9e0,0x00000006e2980000)
 Metaspace       used 2870K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
```



`$ java -Xmx128m -XX:+PrintGCDetails GCLogAnalysis`
```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 33267K->5094K(38400K)] 33267K->11650K(125952K), 0.0043131 secs] [Times: user=0.01 sys=0.02, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 38158K->5116K(38400K)] 44713K->24721K(125952K), 0.0068929 secs] [Times: user=0.01 sys=0.04, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 38396K->5108K(38400K)] 58001K->36637K(125952K), 0.0059472 secs] [Times: user=0.02 sys=0.03, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 38224K->5117K(38400K)] 69754K->50684K(125952K), 0.0065328 secs] [Times: user=0.02 sys=0.03, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 38304K->5117K(38400K)] 83871K->63576K(125952K), 0.0058423 secs] [Times: user=0.01 sys=0.03, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 38286K->5109K(19968K)] 96745K->73197K(107520K), 0.0053025 secs] [Times: user=0.02 sys=0.02, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 19939K->6812K(29184K)] 88026K->76427K(116736K), 0.0019042 secs] [Times: user=0.01 sys=0.01, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 6812K->0K(29184K)] [ParOldGen: 69615K->70017K(87552K)] 76427K->70017K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0090617 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 14645K->4618K(29184K)] 84662K->74636K(116736K), 0.0010349 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 19461K->9304K(29184K)] 89479K->79322K(116736K), 0.0013453 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 23713K->9438K(29184K)] 93730K->83955K(116736K), 0.0029153 secs] [Times: user=0.02 sys=0.01, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 9438K->0K(29184K)] [ParOldGen: 74516K->80920K(87552K)] 83955K->80920K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0106386 secs] [Times: user=0.06 sys=0.02, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14361K->965K(29184K)] [ParOldGen: 80920K->87260K(87552K)] 95282K->88226K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0109257 secs] [Times: user=0.07 sys=0.01, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14803K->5299K(29184K)] [ParOldGen: 87260K->87072K(87552K)] 102064K->92372K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0099918 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14840K->7908K(29184K)] [ParOldGen: 87072K->86939K(87552K)] 101913K->94847K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0131819 secs] [Times: user=0.11 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14491K->10101K(29184K)] [ParOldGen: 86939K->87064K(87552K)] 101430K->97165K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0133274 secs] [Times: user=0.11 sys=0.01, real=0.02 secs]
[Full GC (Ergonomics) [PSYoungGen: 14637K->11062K(29184K)] [ParOldGen: 87064K->87536K(87552K)] 101701K->98598K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0037600 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14718K->12375K(29184K)] [ParOldGen: 87536K->87478K(87552K)] 102255K->99853K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0078119 secs] [Times: user=0.06 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14653K->12881K(29184K)] [ParOldGen: 87478K->87433K(87552K)] 102131K->100314K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0063646 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14834K->13510K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102268K->100944K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0021740 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14809K->13563K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102243K->100997K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0018185 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14551K->13716K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 101984K->101149K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0016413 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14786K->13248K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102220K->100682K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0028107 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 14831K->13411K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102265K->100844K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0018781 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14706K->13875K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102140K->101309K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0016480 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14581K->13938K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102015K->101371K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0014121 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 14622K->14622K(29184K)] [ParOldGen: 87433K->87433K(87552K)] 102056K->102056K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0013382 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Allocation Failure) [PSYoungGen: 14622K->14622K(29184K)] [ParOldGen: 87433K->87414K(87552K)] 102056K->102037K(116736K), [Metaspace: 2863K->2863K(1056768K)], 0.0081856 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
	at GCLogAnalysis.main(GCLogAnalysis.java:25)
Heap
 PSYoungGen      total 29184K, used 14848K [0x00000007bd580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 14848K, 100% used [0x00000007bd580000,0x00000007be400000,0x00000007be400000)
  from space 14336K, 0% used [0x00000007bf200000,0x00000007bf200000,0x00000007c0000000)
  to   space 14336K, 0% used [0x00000007be400000,0x00000007be400000,0x00000007bf200000)
 ParOldGen       total 87552K, used 87414K [0x00000007b8000000, 0x00000007bd580000, 0x00000007bd580000)
  object space 87552K, 99% used [0x00000007b8000000,0x00000007bd55da30,0x00000007bd580000)
 Metaspace       used 2894K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 304K, capacity 386K, committed 512K, reserved 1048576K
  ```
`$ java -Xmx512m -Xms512m -XX:+PrintGCDetails GCLogAnalysis`
  ```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 131584K->21489K(153088K)] 131584K->42655K(502784K), 0.0163195 secs] [Times: user=0.03 sys=0.10, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 153073K->21502K(153088K)] 174239K->85619K(502784K), 0.0241616 secs] [Times: user=0.03 sys=0.15, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 153086K->21498K(153088K)] 217203K->120432K(502784K), 0.0175514 secs] [Times: user=0.05 sys=0.09, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 153082K->21492K(153088K)] 252016K->162908K(502784K), 0.0201672 secs] [Times: user=0.04 sys=0.11, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 153076K->21498K(153088K)] 294492K->207359K(502784K), 0.0211143 secs] [Times: user=0.04 sys=0.12, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 152606K->21502K(80384K)] 338466K->246759K(430080K), 0.0186025 secs] [Times: user=0.04 sys=0.11, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 80089K->35810K(116736K)] 305346K->266441K(466432K), 0.0047037 secs] [Times: user=0.03 sys=0.01, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 94650K->44740K(116736K)] 325280K->282684K(466432K), 0.0073441 secs] [Times: user=0.04 sys=0.02, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 103563K->54475K(116736K)] 341507K->300060K(466432K), 0.0082776 secs] [Times: user=0.06 sys=0.01, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 112655K->34992K(116736K)] 358241K->315245K(466432K), 0.0165098 secs] [Times: user=0.03 sys=0.10, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 93649K->22280K(116736K)] 373903K->335792K(466432K), 0.0159036 secs] [Times: user=0.03 sys=0.09, real=0.02 secs]
[Full GC (Ergonomics) [PSYoungGen: 22280K->0K(116736K)] [ParOldGen: 313512K->240819K(349696K)] 335792K->240819K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0324356 secs] [Times: user=0.27 sys=0.01, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->19291K(116736K)] 299699K->260110K(466432K), 0.0031054 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 77988K->17718K(116736K)] 318807K->276752K(466432K), 0.0039048 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 76235K->19696K(116736K)] 335269K->295113K(466432K), 0.0040645 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 78448K->22788K(116736K)] 353865K->316600K(466432K), 0.0044945 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 81668K->19185K(116736K)] 375480K->333885K(466432K), 0.0052251 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 19185K->0K(116736K)] [ParOldGen: 314699K->273276K(349696K)] 333885K->273276K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0315550 secs] [Times: user=0.28 sys=0.01, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 58825K->20152K(116736K)] 332101K->293428K(466432K), 0.0029853 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 79032K->19200K(116736K)] 352308K->311426K(466432K), 0.0045860 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 77867K->18343K(116736K)] 370093K->329405K(466432K), 0.0044219 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 18343K->0K(116736K)] [ParOldGen: 311061K->281004K(349696K)] 329405K->281004K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0312928 secs] [Times: user=0.27 sys=0.00, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->22966K(116736K)] 339884K->303970K(466432K), 0.0031234 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 81680K->17567K(116736K)] 362684K->320797K(466432K), 0.0061792 secs] [Times: user=0.06 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 76161K->18580K(116736K)] 379391K->338459K(466432K), 0.0064506 secs] [Times: user=0.04 sys=0.02, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 18580K->0K(116736K)] [ParOldGen: 319878K->297155K(349696K)] 338459K->297155K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0344390 secs] [Times: user=0.30 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->17851K(116736K)] 356035K->315007K(466432K), 0.0025015 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 76651K->23716K(116736K)] 373806K->338166K(466432K), 0.0045627 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 82408K->19694K(116736K)] 396857K->356124K(466432K), 0.0104204 secs] [Times: user=0.03 sys=0.05, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 19694K->0K(116736K)] [ParOldGen: 336430K->310581K(349696K)] 356124K->310581K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0382088 secs] [Times: user=0.34 sys=0.01, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->18853K(116736K)] 369461K->329434K(466432K), 0.0023988 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 77662K->18625K(116736K)] 388243K->347414K(466432K), 0.0045716 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 18625K->0K(116736K)] [ParOldGen: 328788K->310796K(349696K)] 347414K->310796K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0397178 secs] [Times: user=0.35 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->20502K(119808K)] 369676K->331298K(469504K), 0.0027722 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 82916K->40221K(102912K)] 393713K->351017K(452608K), 0.0043040 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 102215K->57796K(116736K)] 413011K->370052K(466432K), 0.0062505 secs] [Times: user=0.06 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 116369K->56589K(116736K)] 428625K->386716K(466432K), 0.0089650 secs] [Times: user=0.08 sys=0.01, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 56589K->0K(116736K)] [ParOldGen: 330127K->325455K(349696K)] 386716K->325455K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0465739 secs] [Times: user=0.38 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58739K->0K(116736K)] [ParOldGen: 325455K->325136K(349696K)] 384194K->325136K(466432K), [Metaspace: 2863K->2863K(1056768K)], 0.0389623 secs] [Times: user=0.31 sys=0.01, real=0.03 secs]
执行结束!共生成对象次数:8861
Heap
 PSYoungGen      total 116736K, used 2491K [0x00000007b5580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 58880K, 4% used [0x00000007b5580000,0x00000007b57eef78,0x00000007b8f00000)
  from space 57856K, 0% used [0x00000007b8f00000,0x00000007b8f00000,0x00000007bc780000)
  to   space 57856K, 0% used [0x00000007bc780000,0x00000007bc780000,0x00000007c0000000)
 ParOldGen       total 349696K, used 325136K [0x00000007a0000000, 0x00000007b5580000, 0x00000007b5580000)
  object space 349696K, 92% used [0x00000007a0000000,0x00000007b3d84350,0x00000007b5580000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
` $ java -Xmx1g -Xms1024m -XX:+PrintGCDetails GCLogAnalysis`
  ```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 262144K->43517K(305664K)] 262144K->72835K(1005056K), 0.0273848 secs] [Times: user=0.04 sys=0.17, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 305661K->43513K(305664K)] 334979K->143602K(1005056K), 0.0436643 secs] [Times: user=0.05 sys=0.29, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 305657K->43514K(305664K)] 405746K->214284K(1005056K), 0.0326100 secs] [Times: user=0.08 sys=0.18, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 305658K->43515K(305664K)] 476428K->291150K(1005056K), 0.0356895 secs] [Times: user=0.08 sys=0.21, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 305659K->43513K(305664K)] 553294K->366605K(1005056K), 0.0360343 secs] [Times: user=0.08 sys=0.21, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 305657K->43514K(160256K)] 628749K->443095K(859648K), 0.0359856 secs] [Times: user=0.08 sys=0.21, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 160234K->69108K(232960K)] 559814K->473992K(932352K), 0.0085084 secs] [Times: user=0.07 sys=0.01, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 185844K->89935K(232960K)] 590728K->504088K(932352K), 0.0122550 secs] [Times: user=0.08 sys=0.02, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 206620K->98171K(232960K)] 620773K->531056K(932352K), 0.0182311 secs] [Times: user=0.10 sys=0.06, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 214613K->65001K(232960K)] 647498K->551868K(932352K), 0.0250135 secs] [Times: user=0.05 sys=0.15, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 181737K->35073K(232960K)] 668604K->582499K(932352K), 0.0247488 secs] [Times: user=0.04 sys=0.15, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 151809K->43528K(232960K)] 699235K->619739K(932352K), 0.0132256 secs] [Times: user=0.03 sys=0.07, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 160086K->34789K(232960K)] 736297K->649735K(932352K), 0.0165371 secs] [Times: user=0.04 sys=0.09, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 34789K->0K(232960K)] [ParOldGen: 614946K->331208K(699392K)] 649735K->331208K(932352K), [Metaspace: 2863K->2863K(1056768K)], 0.0468595 secs] [Times: user=0.37 sys=0.02, real=0.05 secs]
[GC (Allocation Failure) [PSYoungGen: 116653K->39452K(232960K)] 447862K->370661K(932352K), 0.0050530 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 156188K->40293K(232960K)] 487397K->407022K(932352K), 0.0087706 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 157029K->35351K(232960K)] 523758K->438522K(932352K), 0.0091150 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 152087K->37408K(232960K)] 555258K->472786K(932352K), 0.0091986 secs] [Times: user=0.09 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 154144K->38234K(232960K)] 589522K->507131K(932352K), 0.0095081 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 154970K->39327K(232960K)] 623867K->541762K(932352K), 0.0080703 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 156031K->37160K(232960K)] 658466K->575321K(932352K), 0.0079191 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 153896K->36803K(232960K)] 692057K->607858K(932352K), 0.0076809 secs] [Times: user=0.07 sys=0.01, real=0.01 secs]
执行结束!共生成对象次数:12973
Heap
 PSYoungGen      total 232960K, used 136837K [0x00000007aab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 116736K, 85% used [0x00000007aab00000,0x00000007b0cb0520,0x00000007b1d00000)
  from space 116224K, 31% used [0x00000007b1d00000,0x00000007b40f0f78,0x00000007b8e80000)
  to   space 116224K, 0% used [0x00000007b8e80000,0x00000007b8e80000,0x00000007c0000000)
 ParOldGen       total 699392K, used 571054K [0x0000000780000000, 0x00000007aab00000, 0x00000007aab00000)
  object space 699392K, 81% used [0x0000000780000000,0x00000007a2dab9e8,0x00000007aab00000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
  ` $ java -Xmx2g -Xms2048m -XX:+PrintGCDetails GCLogAnalysis`
  ```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 524800K->87030K(611840K)] 524800K->139468K(2010112K), 0.0526976 secs] [Times: user=0.06 sys=0.35, real=0.06 secs]
[GC (Allocation Failure) [PSYoungGen: 611830K->87030K(611840K)] 664268K->240143K(2010112K), 0.0601111 secs] [Times: user=0.07 sys=0.41, real=0.06 secs]
[GC (Allocation Failure) [PSYoungGen: 611830K->87035K(611840K)] 764943K->346942K(2010112K), 0.0534737 secs] [Times: user=0.13 sys=0.29, real=0.05 secs]
[GC (Allocation Failure) [PSYoungGen: 611835K->87039K(611840K)] 871742K->455394K(2010112K), 0.0522564 secs] [Times: user=0.13 sys=0.30, real=0.05 secs]
[GC (Allocation Failure) [PSYoungGen: 611839K->87033K(611840K)] 980194K->582171K(2010112K), 0.0560601 secs] [Times: user=0.14 sys=0.33, real=0.06 secs]
[GC (Allocation Failure) [PSYoungGen: 611833K->87029K(320000K)] 1106971K->685285K(1718272K), 0.0490633 secs] [Times: user=0.13 sys=0.28, real=0.05 secs]
[GC (Allocation Failure) [PSYoungGen: 319989K->138715K(465920K)] 918245K->741357K(1864192K), 0.0149063 secs] [Times: user=0.13 sys=0.01, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 371675K->171573K(466944K)] 974317K->785148K(1865216K), 0.0192689 secs] [Times: user=0.15 sys=0.03, real=0.02 secs]
[GC (Allocation Failure) [PSYoungGen: 405557K->171027K(465920K)] 1019132K->820620K(1864192K), 0.0319969 secs] [Times: user=0.16 sys=0.12, real=0.04 secs]
执行结束!共生成对象次数:14519
Heap
 PSYoungGen      total 465920K, used 180434K [0x0000000795580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 233984K, 4% used [0x0000000795580000,0x0000000795eafcc8,0x00000007a3a00000)
  from space 231936K, 73% used [0x00000007a3a00000,0x00000007ae104e38,0x00000007b1c80000)
  to   space 227840K, 0% used [0x00000007b2180000,0x00000007b2180000,0x00000007c0000000)
 ParOldGen       total 1398272K, used 649592K [0x0000000740000000, 0x0000000795580000, 0x0000000795580000)
  object space 1398272K, 46% used [0x0000000740000000,0x0000000767a5e3d8,0x0000000795580000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```
` $ java -Xmx4g -Xms4096m -XX:+PrintGCDetails GCLogAnalysis`
  ```
正在执行...
[GC (Allocation Failure) [PSYoungGen: 1048576K->174581K(1223168K)] 1048576K->230352K(4019712K), 0.0722924 secs] [Times: user=0.10 sys=0.51, real=0.08 secs]
[GC (Allocation Failure) [PSYoungGen: 1223157K->174590K(1223168K)] 1278928K->353346K(4019712K), 0.0876079 secs] [Times: user=0.10 sys=0.63, real=0.09 secs]
[GC (Allocation Failure) [PSYoungGen: 1223166K->174589K(1223168K)] 1401922K->474826K(4019712K), 0.0645816 secs] [Times: user=0.21 sys=0.33, real=0.06 secs]
执行结束!共生成对象次数:14650
Heap
 PSYoungGen      total 1223168K, used 955576K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 1048576K, 74% used [0x000000076ab00000,0x000000079a5aeb28,0x00000007aab00000)
  from space 174592K, 99% used [0x00000007aab00000,0x00000007b557f690,0x00000007b5580000)
  to   space 174592K, 0% used [0x00000007b5580000,0x00000007b5580000,0x00000007c0000000)
 ParOldGen       total 2796544K, used 300236K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
  object space 2796544K, 10% used [0x00000006c0000000,0x00000006d25333b8,0x000000076ab00000)
 Metaspace       used 2869K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 302K, capacity 386K, committed 512K, reserved 1048576K
  ```