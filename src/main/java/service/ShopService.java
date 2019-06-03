package service;

import entity.Shop;
import main.java.common.Result;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*我认为所谓service层就是对于使用者来说是不可分割的元服务，就如登陆注册一样，虽然在controller层是没有注册就帮用户注册...*/
/*shop该如何管理呢？我应该给shop赋予owner和manager之类的权限管理吗？
* 暂时先不要这种owner之类的*/


public interface ShopService {
    //session在这里充当说明角色？
    //shop用最原始的password登陆和注册
    //interceptor拦截，
    Result register(Shop shop);

    Result login(Shop shop);



//    public Result
}
