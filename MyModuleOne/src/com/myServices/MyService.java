package com.myServices;

/**
 * Java9允许将服务接口定义在一个模块中, 并使用uses语句来声明该服务接口, 然后针对该服务接口提供不同的服务实现类, 这些服务实现类
 *   可以分布在不同的模块中, 服务实现模块则使用provides语句为服务接口指定实现类, 服务使用者只需要面向接口编程即可
 */
public interface MyService {
    void service();
}
