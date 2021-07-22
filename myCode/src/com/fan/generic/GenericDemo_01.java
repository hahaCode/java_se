package com.fan.generic;

/**
 * 泛型的好处:
 *  1.把运行期间的问题提到到编译期间
 *  2.避免了强制类型转换
 *
 * 泛型类:
 *  1.格式: public class Generic<T> {}
 *         (此处的T可以随便写为任意标识, 常见的如T,E,K,V等形式的参数常用于表示泛型)
 *
 * 泛型方法:
 *  1.格式: public <T> void show (T t) {}
 *
 * 泛型接口
 * 1.格式  public interface GenericInter <T>{
 *              void show(T t);
 *        }
 */
public class GenericDemo_01 {
    public static void main(String[] args) {
        Generic<String> generic1 = new Generic<>();
        generic1.setT("Test");
        System.out.println(generic1.getT());

        Generic<Integer> generic2 = new Generic<>();
        generic2.setT(20);
        System.out.println(generic2.getT());

        GenericMethod gm = new GenericMethod();
        gm.show("Hello");
        gm.show(true);

        GenericInter<String> genericInter = new GenericInterImpl<>();
        genericInter.show("yes");
    }


}
