package com.myModuleTwo;

import com.myModuleOne.Cat;

/**
 * 一个模块要访问其他的模块, 必须明确指定依赖哪些模块, 未明确指定依赖的模块不能访问
 *     在模块下的描述性文件中配置导出模块: requires 模块名;
 *
 */
public class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
