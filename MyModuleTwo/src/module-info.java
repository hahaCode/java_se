import com.myServices.MyService;

module MyModuleTwo {
    requires MyModuleOne;

    uses MyService;
}