反射【Reflection】

ReflectionTest：反射是个啥，反射如何创建对象，如何调用结构
ClassTest：理解Class类并获取Class实例
ClassLoaderTest：了解类的加载器

RuningClassInstanceTest：通过反射创建对应的运行时类的对象
runingStructure：获取运行时类的完整结构
    ｜-structure：
    ｜   ｜-Creature：
    ｜   ｜-MyAnnotation：
    ｜   ｜-MyInterface：
    ｜   ｜-Person：
    ｜-GetFieldTest：获取运行时类的属性结构
    ｜-GetMethodTest：获取运行时类的方法结构
    ｜-GetOtherTest：获取运行时其他结构
    ｜-CallRuningStructureTest：调用运行时类中指定的结构：属性、方法、构造器

Proxy：代理
StaticProxyTest.java：静态代理
DynamicProxyTest.java：动态代理

在Spring框架AOP就是以动态代理实现的【其底层就是反射】
在框架中可用：通过 Spring API 实现；自定义类实现Aop【主要是切面定义】；使用注解实现；三种方法实现；
