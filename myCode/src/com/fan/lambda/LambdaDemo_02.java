package com.fan.lambda;

/**
 * 组成Lambda表达式的三要素: 形式参数, 箭头, 代码块
 *
 * Lambda表达式的格式:
 *   格式: (形式参数) -> {代码块}
 *   这里的形式参数有还是没有要取决于接口里的那个抽象方法需不需要传递参数
 *
 * Lambda表达式的使用前提:
 *   1.必须要有一个接口, 接口中有且仅有一个抽象方法
 *   2.必须有上下文环境, 才能推导出Lambda对应的接口
 *      根据局部变量的赋值得知Lambda对应的接口: Runnable r = () -> System.out.println("An apple a day, the doctor keep away!");
 *      根据调用方法的参数得知Lambda对应的接口: new Thread(() -> System.out.println("线程已启动!")).start();
 *
 * Lambda表达式和匿名内部类的区别
 *   1.所需类型不同:
 *      匿名内部类：可以是接口, 也可以是抽象类, 还可以是具体类
 *      Lambda表达式: 只能接口
 *
 *   2.使用限制不同
 *      如果接口中有且仅有一个抽象方法, 可以使用Lambda表达式, 也可以使用匿名内部类
 *      如果接口中多于一个抽象方法, 只能使用匿名内部类, 而不能使用Lambda表达式
 *
 *   3.实现原理不同
 *      匿名内部类: 编译之后, 产生一个单独的.class字节码文件
 *      Lambda表达式: 编译之后, 不会生成单独的字节码文件, 对应的字节码文件是在运行时动态生成
 */

public class LambdaDemo_02 {
    public static void main(String[] args) {
//        //多态形式
//        Eatable e = new EatableImp();
//        useEatable(e);

//        //匿名内部类
//        useEatable(new Eatable(){
//            @Override
//            public void eat() {
//                System.out.println("An apple a day, the doctor keep away!");
//            }
//        });

        //Lambda表达式
        useEatable( () -> {
            System.out.println("An apple a day, the doctor keep away!");
        } );

    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
