# designPattern 设计模式项目
> 主要为大话设计模式的笔记

## 大事记
## 2018年12月 启
### 12月28日 创建项目
0. 关键词:设计模式,创建型模式，简单工厂模式,工厂角色,抽象产品角色,具体产品角色
1. 创建项目,并进行了工厂模式的学习
2. 参考笔记 [01 简单工厂模式(SimpleFactoryPattern)](http://note.youdao.com/noteshare?id=00d171867a62166408514d066a11bb38&sub=43EF7D04C0CC43AD971F31C77529AE02)

## 2019年1月 继
### 1月2日 策略模式的学习
0. 关键词:行为型模式，策略模式,环境类(Context),抽象策略类(strategy),抽象策略具体实现类(concreteStrategy)
1. 创建行为型模式项目(behavioralPatterns),结构型模式项目(structuralPatterns)
2. 创建行为型策略模式,并进行代码实践
3. 参考笔记 [02 策略模式(StrategyPattern)](http://note.youdao.com/noteshare?id=a03a9105cea6899290f27ab0a0762ae4&sub=6026A8F4C6E34CAE8C9CA4A21BCE683F)

### 1月3日 设计模式原则,装饰模式,代理模式
0. 关键词:单一职责原则,开发封闭原则,依赖倒转原则,里氏替换原则,装饰模式
1. 单一职责原则:就一个类而言,应该仅有一个引起它变化的原因,即功能单一
2. 开发封闭原则:软件对于拓展是开发的支持的,对于更改是封闭的;对于与更改无法避免的，应该尽早的抽象隔离出来
3. 里氏替换原则:子类型必须能够替换掉它们的父类型。
4. 依赖倒转原则:抽象不应该依赖细节,细节应该依赖于抽象,即就是要针对接口编程,不要对实现编程
5. 参考笔记 [03 装饰模式(DecoratorPattern)](http://note.youdao.com/noteshare?id=22a452fd4850e1b507a91aba020e8634&sub=F682496602B34981A5B785CCB662B84A)
6. 参考笔记 [04 代理模式(ProxyPattern)](http://note.youdao.com/noteshare?id=a9c0a248935bc7f80dcbc295f7baa82d&sub=1B20233132844E83A2DF00C2F57521A4)

### 1月5日 工厂方法模式,原型模式
0. 关键词:工厂方法模式,原型模式
1. 工厂方法模式参考笔记 [05 工厂方法模式(PolymorphicFactory)](http://note.youdao.com/noteshare?id=104bb5fe4c28ea22cda91782c2486e16&sub=5651F2B22CAB4724A8158FD297DD207C)
2. 原型模式参考笔记 [06 原型模式(PrototypePattern)](http://note.youdao.com/noteshare?id=bcb5488d8d0ca5dd363d51ff2fa57f07&sub=3546092D6B104BC58D76C24EB4E2AEB5)

### 1月7日 模板方法模式,外观模式,迪米特法则,建造者模式
0. 关键词:模板方法模式,外观模式,迪米特法则,建造者模式,代码缺失
1. 模板方法模式参考笔记(注:代码暂未完善) [07 模板方法模式(TemplatePattern)](http://note.youdao.com/noteshare?id=9b752d07c9009995e81d13ae70f3505f&sub=0433649A9DC7440580628EAA6976A0DF)
2. 外观模式参考笔记(注:代码暂未完善) [08 外观模式(FacadePattern)](http://note.youdao.com/noteshare?id=b41485a1553b73c6a3056e34148e4b17&sub=2E6D5A0575F44F6293C484763E90E60E)
3. 迪米特法则:如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。(类似三层架构模式)
4. 建造者模式参考笔记 [09 建造者模式(BuilderPattern)](http://note.youdao.com/noteshare?id=66c9833a9ffa1444c575e81663bfc526&sub=807A2B406D86485886793A3022C8C6B1)

### 1月8日 观察者模式,委托
0. 关键词:观察者模式,委托
1. 观察者模式项目笔记[10 观察者模式(ObserverPattern)](http://note.youdao.com/noteshare?id=e001ad9b37b980a31513ca408b563335&sub=2464A41ECACC419D84A663CFDD743E80)

### 1月9日 抽象工厂模式
0. 关键词:抽象工厂模式,反射,状态模式
1. 抽象工厂模式项目笔记:[11 抽象工厂模式(AbstractFactoryPattern)](http://note.youdao.com/noteshare?id=6b657554c78dacd5b60e540cf8c527b1&sub=13DF8B48ABFF4733B683A4E33B50CE42)
2. 状态模式项目笔记:[12 状态模式(StatePattern)](http://note.youdao.com/noteshare?id=955be314dd9aa1be6f6b702b22035e37&sub=FE5BF441059E4D3CB4E87282D9A2F62D)
3. 题外:对于状态模式暂时没有很清晰的理解,初略知道他的作用就是当一个方法中的判断逻辑过多时,可以使用状态模式,从而简化代码,但是如此的话,我单独在写个方法引用的一样也是可以;逻辑待缕清

### 1月10日 适配器模式,备忘录模式
0. 关键词:适配器模式,备忘录模式
1. 适配器模式项目笔记:[13 适配器模式(AdapterPattern)](http://note.youdao.com/noteshare?id=eaa6123659f3f5d8eb663bd91dcd6b58&sub=88255C7A68EF4F0BAE57F18B528264F3)
2. 行为型模式备忘录模式项目笔记:[14 备忘录模式(MementoPattern)](http://note.youdao.com/noteshare?id=83392665248b570c521fa877a2b4b7e3&sub=794238E1195343ADA0C53D7D9E3CFEE2)