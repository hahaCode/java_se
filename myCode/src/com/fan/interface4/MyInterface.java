package com.fan.interface4;

/**
 * 接口组成更新:
 *   1.Java8 之后, 接口中可以定义默认方法和静态方法
 *   2.Java9 之后, 接口中可以定义私有方法
 *
 * 接口中默认方法的定义格式: (主要用于不破坏现有的代码结构, 进行接口升级)
 *   public default 返回值类型 方法名(参数列表) {}   ---->  public可以省略
 *
 * 接口中静态方法的定义格式：(只能被接口本身调用, 不能被实现类重写)
 *   public static 返回值类型 方法名(参数列表) {}   ----->  public可以省略
 *
 * 接口中私有方法的定义格式: (为了抽取公共部分, 简化代码) (默认方法可以调用私有的静态方法和非静态方法, 静态方法只能调用私有的静态方法)
 *   private 返回值类型 方法名(参数列表) {}
 *   private static 返回值类型 方法名(参数列表) {}
 */

public interface MyInterface {
    void show1();
    void show2();

//    public default void show3() {
//        System.out.println("public default void show3");
//    }
    default void show3() {
        System.out.println("public default void show3");
    }

    public static void show4() {
        System.out.println("public static void show4");
    }

    default void test1() {
        System.out.println("这是接口中默认方法的开始");
        //System.out.println("这是公共部分");
        test();
        System.out.println("这是接口中默认方法的结束");
    }

    static void test2() {
        System.out.println("这是接口中静态方法的开始");
        //System.out.println("这是公共部分");
        test();
        System.out.println("这是接口中静态方法的结束");
    }

    private static void test() {
        System.out.println("这是公共部分");
    }
}
