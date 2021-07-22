package com.fan.interface3;
/**
 * 抽象类和接口的区别:
 *   1.成员区别:
 *        抽象类: 变量, 常量, 有构造方法, 有抽象方法, 也有非抽象方法
 *        接口: 常量, 抽象方法
 *   2.关系区别:
 *        类与类: 继承, 单继承
 *        类与接口: 实现, 可以单实现, 也可以多实现
 *        接口与接口: 继承, 单继承, 多继承
 *   3.设计理念:
 *        抽象类: 对类抽象, 包括属性, 行为
 *        接口: 对行为抽象, 主要是行为
 *     如何理解: 门和报警的例子 ---> 报警门怎么实现比较好?
 *
 *     public interface Alarm {
 *         void alarm();
 *     }
 *
 *     public abstract class Door {
 *         public abstract void open();
 *         public abstract void open();
 *     }
 *
 *     public class AlarmDoor extends Door implements Alarm {
 *         public void open(){
 *             //实现open方法
 *         }
 *
 *         public void close(){
 *             //实现close方法
 *         }
 *
 *         public void alarm(){
 *             //具备报警功能
 *         }
 *     }
 *
 */

public interface Inter1 {
}


/**
 * 形参和返回值
 *   1.抽象类名作为形参和返回值
 *      方法的形参是抽象类名, 其实需要的是该抽象类的子类对象
 *      方法的返回值是抽象类名, 其实返回的是该抽象类的子类对象
 *   2.接口名作为形参和返回值
 *      方法的形参是接口名, 其实需要的是该接口的实现类对象
 *      方法的返回值是接口名, 其实返回的是该接口的实现类对象
 */