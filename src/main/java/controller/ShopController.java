package controller;

import common.Result;
import entity.Shop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
    /*在controller这里规定前端与后端的职责*/
    @Autowired
    ShopService shopService;
    //我需要返回什么才能说明已经注册了呢？
    //进入个人信息界面，那看起来是jsp，或者HTML了
    //collegeShop is Map,Mmall is ServceResponse
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    //@Responsebody 注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，一般在异步获取数据时使用；
    @ResponseBody
    public Result<Shop> register(Shop shop){//我之所以没有像geely那样用name，password原因在于着更灵活
        return null;
    }
    //我觉得我应该与客户端连接一下，不然完全就是在盲人摸象
}
