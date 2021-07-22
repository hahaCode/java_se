package com.myModuleOne;

/**
 * 模块中所有未导出的包都是私有的, 他们是不能在模块外被访问的
 *    在模块下的描述性文件中配置导出模块  exports 包名;
 *
 *
 */
public class Cat {
    public void eat() {
        System.out.println("猫吃鱼!");
    }
}
