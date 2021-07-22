package com.fan.overwrite;

/**
 * 方法重写: 子类中出现了和父类中一模一样的方法声明. 当子类需要父类的功能, 而功能主体子类有自己特有的
 *          内容时, 可以重写父类中的方法, 这样, 即沿袭了父类的功能, 又定义了子类特有的内容
 *
 * 方法重写注意事项:
 *    1.私有方法不能被重写(父类私有成员, 子类是不能集成的)
 *    2.子类方法访问权限不能更低 (public > 默认 > 私有)
 */

//https://www.bilibili.com/video/BV1Ei4y137HJ?p=157&spm_id_from=pageDriver
public class NewPhone extends Phone {

    //在父类打电话的功能上添加视频通话
    @Override   //运用override注解帮我们检查重写方法的声明是否正确
    public void call(String name){
        System.out.println("This is a Video Call");
        super.call(name);
    }

}
