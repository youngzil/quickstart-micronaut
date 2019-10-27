
一个 books 微服务，使用 Groovy 编写；
一个 inventory 微服务，使用 Kotlin 编写；
一个 gateway 微服务，使用 Java 编写。


![访问结构图如下](microServer.png "ReferencePicture")


Consul 启动
./consul agent -dev           # -dev表示开发模式运行，另外还有-server表示服务模式运行

查看consul cluster中的每一个consul节点的信息
./consul members

Consul控制台
http://127.0.0.1:8500/ui/


分别执行quickstart-books、quickstart-gateway、quickstart-inventory中的Application启动类
再次去Consul控制台查看注册信息情况

quickstart-inventory项目访问不了，不知道为什么,是因为IDE工具和Kotlin的问题，好像只能直接使用maven命令
这个项目可以在跟目录下执行 ./gradlew run来启动



分别访问
http://localhost:8080/hello/John
http://localhost:8081/hello/John
http://localhost:8082/hello/John


curl http://localhost:8080/api/books



代码示例参考
https://www.infoq.cn/article/micronaut-tutorial-microservices-jvm
https://github.com/micronaut-projects/micronaut-examples
https://www.baeldung.com/micronaut
https://medium.com/@jonashavers/getting-started-with-micronaut-595515985a98
https://docs.micronaut.io/latest/guide/index.html

https://blog.codecentric.de/en/2019/01/micronaut-microservices/
https://dzone.com/articles/a-quick-guide-to-microservices-with-the-micronaut
https://blog.codecentric.de/en/2019/01/micronaut-microservices/
https://objectcomputing.com/resources/publications/sett/july-2018-micronaut-framework-for-the-future

goolee云开发
https://cloud.google.com/blog/products/application-development/accelerate-java-application-development-on-gcp-with-micronaut

AWS云开发
https://micronaut-projects.github.io/micronaut-aws/latest/guide/

