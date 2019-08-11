此为参加极客学院《TDD 训练营》的练习日志。

## 配置
### idea 快捷键
1、inline variable `option + command + N`

2、跳过一个单词  `option + 方向键`

### 快速方法片段
使用 idea 的 Live Template 实现, 进入 idea preference -> Editor -> Live Template，这里看到许多设置。我们新建一个名为 junit 的 Live Template Group。

#### 单元测试
1、test 生成代码片段

abbreviation `test`
```
@Test
public void should_$METHOD_NAME$() {
  $BODY$
}
```
application in Java:Declaration 

2、assis 生成断言语句

abbreviation `assis`
```
assertThat($actual$, is($mather$));
```
application in Java:Statement

## 工作流
循环如下流程：

最小化测试 -> 失败测试 -> 代码 -> 通过测试 