import com.myServices.MyService;
import com.myServices.MyServiceImpl_01;
import com.myServices.MyServiceImpl_02;

module MyModuleOne {
    exports com.myModuleOne;
    exports com.myServices;

    //provides MyService with MyServiceImpl_01;  //指定MyService的服务实现类是MyServiceImpl_01
    provides MyService with MyServiceImpl_02;
}