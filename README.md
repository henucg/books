### books(阅读书籍源码)

##### 《Java实战》(第二版)

##### 《Java并发编程之美》

##### 《分布式中间件实战》

##### 《Java并发实现原理》

##### 《策略模式之禅（第二版）》
+ 6大设计原则
    + 单一职责原则
    + 里氏替换原则：任何场景下子类可以替换基类
        + 子类完全实现父类的方法
        + 子类可以有自己的扩展
        + 子类覆盖或实现父类的方法的时候输入参数的范围可以被放大
        + 子类覆盖或实现父类的方法的时候输出结果的范围可以被缩小
    + 依赖倒置原则：被依赖方的修改不能导致依赖方也被修改，可以使用接口抽象化
    + 接口隔离原则：不同特性放在不同的接口
    + 迪米特原则：最少知道
    + 开闭原则：对扩展开放，对修改关闭
+ 单例模式
    + 简单懒汉模式，线程不安全
    + 简单饿汉模式，线程安全  
    + synchronized实现的懒汉模式，线程安全，效率低下
    + 双重锁检查模式，懒加载，效率高
    + 静态内部类，懒加载，效率高
    + 枚举模式，枚举的底层实现也是静态内部类  
+ 工厂模式
    + 简单工厂模式，同一工厂方法不同入参，返回不同对象
    + 工厂方法模式，不同工厂方法不同入参，返回不同对象
    + 抽象工厂模式，不同工厂方法不同入参，返回不同类对象（产品簇）    
+ 模板方法模式
    + 定义功能顺序，由父类的模板方法统一调度，子类可以在父类设置钩子方法决定父类的中的方法是否需要被调度    
+ 建造者模式与工厂模式的区别
    + 建造者模式最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，
    顺序不同产生的对象也不同；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关心的   
+ 代理模式优点
    + 职责清晰
    + 高扩展
    + 智能化，体现在动态代理里面，Spring的AOP是动态代理的经典实现
+ 代理模式分类
    + 普通代理模式：客户端直接调用代理类，通过代理类请求真实类
    + 强制代理模式：客户端直接调用真实类，真实类返回代理类，然后客户端通过代理类请求真实类
+ Spring的AOP的动态代理实现
    + JDK动态代理：代理类继承被代理类
    + CGLIB动态代理：代理类实现被代理类实现的接口
+ 原型模式
    + 深拷贝
    + 浅拷贝 
+ 中介者模式
    + 中介者承担与各个模块对接的责任：
    class Sale{}
    class Stock{}
    class Purchase{}
    class Mediator{
        Sale sale;
        Stock stock;
        Purchase purchase;
    }
+ 命令模式
                    
+ 策略模式
    + 不同的策略实现者的调用，由策略执行者执行，策略执行者的调度参数为策略的抽象接口，策略模式是里氏替换原
    则和依赖倒置原则的经典实践，为了防止调用者需要知道所有的策略实现者，可以结合工厂模式，由工厂构建策略实
    现者的对象，符合迪米特原则    
