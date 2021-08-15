package com.wust.linliang.springbootweb01.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("index") //注解映射请求路径
    @ResponseBody //可以将java对象转为json格式的数据
    public String index()
    {
        return "Hello World !";
    }
}
