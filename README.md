# 简介

本项目作为一个sofa在多web模块的场景的一个demo。（这简介够简的）

# 项目结构
```
-sofa-ark-demo
--myjar 
--springboot-apps
---springboot-app1
---springboot-app2
--arks
---app1-ark
---app2-ark
```
以上项目分为3部分

myjar用来模拟项目中的jar包冲突。

我们先后install它的两个版本。

springboot-apps就是webapp的集合。

springboot-app1是一个springboot webmvc应用。

springboot-app1是另一个springboot webmvc应用。

这两个webmvc应用分别依赖了org.sirenia:myjar:1.0.1-SNAPSHOT
和org.sirenia:myjar:1.0.2-SNAPSHOT。

arks是webapp的ark包集合，以及一个ark容器启动项目。

每个webapp都被打成3个jar包。

没错，是3个。

比如

app1-ark-1.0-SNAPSHOT.jar

app1-ark-1.0-SNAPSHOT-ark-biz.jar

app1-ark-1.0-SNAPSHOT-executable-ark.jar

它们分别是

普通的jar包，

具有完整资源的fatjar，

具有完整资源并且包含ark容器的fatjar。

其中ark-biz是我们想要的。

ark-run就是ark容器启动项目。

# 运行
项目导入到ide中之后，我们需要先将有pom文件的目录转为maven工程。

然后install myjar的两个版本
（install一个版本后手动改一下pom和代码，再install另一个版本）。

再然后install两个springboot webmvc项目。

再然后install两个webmvc项目对应的ark。

再然后package ark-run

再然后在命令行用
```java -jar ./ark-run/target/ark-run-1.0-SNAPSHOT-executable-ark.jar```
启动项目。

什么？不能在ide里面启动吗？目前还没找到正确的姿势。

如果你掌握了这个姿势，请私下联系我。嘿嘿嘿。

言归正传，这流程太繁琐了吧。

项目下面有个ark-run，可以一键四连，执行install myjar之后的动作。

# 验证
如果在控制台能看到输出
...
wtf1?
app1 controller
app1 controller classloader=>com.alipay.sofa.ark.container.service.classloader.BizClassLoader@3cd3e762
...
wtf2?
app2 controller
app2 controller classloader=>com.alipay.sofa.ark.container.service.classloader.BizClassLoader@1b75c2e3
...
(BizClassLoader@1b75c2e3这部分输出会不同)

那么，恭喜你，启动成功。

然后在浏览器访问

http://localhost:8088/echo

http://localhost:8088/app1/echo

http://localhost:8088/app2/echo

将会分别输出
echo

v1
（org.sirenia:myjar:1.0.1-SNAPSHOT包中的HiUtil#v1方法的输出）

v2
（org.sirenia:myjar:1.0.2-SNAPSHOT包中的HiUtil#v2方法的输出）

没有sofa-ark做类隔离的时候，maven会仲裁出myjar的某一个版本。

v1和v2必然有一个会抛异常（MethodNotFoundException）








