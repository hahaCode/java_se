package com.fan.inhertance;

public class Demo_01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.show();

        /**
         * 子类中的所有构造方法默认都会访问父类中的无参的构造方法:
         *   1.因为子类会继承父类中的数据,可能还会使用父类中的数据, 所以子类初始化之前, 一定要先完成父类数据的初始化
         *   2.每一个子类的构造方法的第一条语句默认都是 super()
         *
         * 如果父类中没有无参构造方法, 只有带参构造方法:
         *   1.通过使用super(参数)来显示的调用父类的带参构造方法
         *   2.在父类中自己提供一个无参构造方法  (推荐使用!)
         */

        System.out.println("-----------无参构造-----------");
        Zi z1 = new Zi();
        System.out.println("-----------有参构造------------");
        Zi z2 = new Zi(2);
    }
}
