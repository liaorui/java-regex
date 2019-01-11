# JDK正则表达式
从jdk10u里抽取出来的Pattern和Matcher类，解决了JDK 9 b119之前的正则匹配可能无限循环的bug。  
[bug JDK-6988218](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=6988218)  
[bug JDK-7006761](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=7006761)  
[bug JDK-7111813](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=7111813)  

# 适用的JDK版本
适用于JDK 9 b119版本之前的java运行环境。
JDK 9 b119之后的版本已经修复了这些bug。