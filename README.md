# 重构基础：Java版

## 练习描述

### 练习1
```
使用防卫语句取代条件表达式（Replaced the Nexted Conditional with Guard Clauses）重构遗留代码
```

### 练习2
```
使用提炼函数(Extract Method)手法重构遗留代码
```

### 练习3
```
使用抽象方法对象(Extract Method Object)重构遗留代码
```

要求：
- 不得修改测试(除非必要情况)
- 重构后的代码必须通过测试 

## 环境要求
+ java 8

## 如何开始

- 克隆模版库
- 根目录下执行`./gradlew clean test`，出现`BUILD SUCCESS`字样，说明项目启动成功
- 在`/src/main/java/practice*`下的源码上进行重构

## 如何测试
- 根目录下执行`./gradlew clean test`，查看测试结果

## 输出规范
- `/src/main/java/practice*`下的代码被重构，且测试通过