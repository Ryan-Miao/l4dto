# 背景

企业软件的开发通常需要为每个应用程序组件创建API。 在实现阶段，这涉及不同层次组件上的API模型之间的映射（例如将持久性模型映射到域模型到DTO）。 这种映射往往容易出现锅炉代码(mapping)，消耗开发力度和时间。

# 选择

当前有几款object-map-object工具，可以在编译级别映射,让我们在编译的时候就能提前知道是否类型转变失败。

1. Selma - http://www.selma-java.org/
2. MapStruct - http://mapstruct.org/

有人做了性能测试。来自[github](https://github.com/arey/java-object-mapper-benchmark)

![](http://javaetmoi.com/wp-content/uploads/2015/09/2015-09-mapping-objet-objet2.png)


对比发现，Selma以接近Manual的得分胜出。      

再来看Selma和MapStruct作者的说法，[Java mapping: Selma vs MapStruct](http://stackoverflow.com/questions/34786737/java-mapping-selma-vs-mapstruct).  

二者都是基于在编译级别生成code的思想。MapStruct拥有更丰富的内置转换器，但Selma作者认为复杂的转换应该由开发者自己来完成。

>The main idea behind Selma is to prohibit magic conversion and just automate all mappings without any side effects. When mapping appears to be too complex, the developer should handle it by himself using custom mappings or interceptor.

最终，我却决定使用MapStruct，因为二者都需要一个compile的plugin来生成代理的对象，而MapStruct有示例，Selma没有。 


# 使用MapStruct  

## 1. build.gradle
顶头加一个plugin：  
```java

plugins {
    id 'java'
    id 'net.ltgt.apt' version '0.9'
}
ext {
    mapstructVersion = "1.1.0.Final"
}
dependencies {
    compile "org.mapstruct:mapstruct:${mapstructVersion}"
    apt "org.mapstruct:mapstruct-processor:${mapstructVersion}"

    compile group: 'junit', name: 'junit', version: '4.11'
}

```

## 2. Example
```java
@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "qax", target = "baz")
    @Mapping(source = "baz", target = "qax")
    Target sourceToTarget(Source source);

    @InheritInverseConfiguration
    Source targetToSource(Target target);
}

```




































#### 参考
[Dozer vs Orika vs Manual](http://blog.sokolenko.me/2013/05/dozer-vs-orika-vs-manual.html), 2013