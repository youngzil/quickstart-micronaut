[Micronaut官网](https://micronaut.io)  
[Micronaut Github](https://github.com/micronaut-projects)  


A modern, JVM-based, full-stack framework for building modular, easily testable microservice and serverless applications.

基于JVM的现代全栈框架，用于构建模块化，易于测试的微服务和无服务器应用程序。





---------------------------------------------------------------------------------------------------------------------

最近项目正在使用Micronaut。简单谈谈它和SpringBoot相比的区别和优势。

Micronaut的主要卖点是编译时依赖注入，Spring作为现在的主流依赖注入框架，依靠的是运行时依赖注入，运行时依赖注入是通过反射调用和proxy实现的。相比之下编译时依赖注入会带来两个好处：
1. 应用启动时间变短；
2. 应用内存占用变少；


这就产生了一些有趣的应用场景，比如用Micronaut编写可以运行在AWS Lambda的serverless function，或者Command line application。

Micronaut完全支持JSR330 annotation（比如@Inject）。在编译时Micronaut会进行annotation processing 生成一封针对你的应用的JavaEE CDI specs实现。JavaEE CDI specs可以在这里找到： [Contexts and Dependency Injection for Java Specification](http://www.cdi-spec.org/)

国外大神对比了Micronaut和springboot的应用启动时间及内存占用：[Performance Comparison Between Spring Boot and Micronaut](https://piotrminkowski.com/2019/04/09/performance-comparison-between-spring-boot-and-micronaut/) 这里对比的是Micronaut 1.0RC版本的性能，现在Micronaut发布的最新版本是2.0.3

此外Micronaut还无缝支持reactive 编程，对gPRC也用很好的支持。目前主要的缺点是社区支持不足，很多问题只有官方文档的例子，很难找到答案。



[Java云原生框架quarks, micronaut对比SpringBoot有哪些优势?](https://www.zhihu.com/question/378077185/answer/1496499067)  


---------------------------------------------------------------------------------------------------------------------






