package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloAction {

    //这是我在github上面做的修改 
    
    @RequestMapping("/boot")
    @ResponseBody
    public  String   boot() throws Exception{
        System.out.println("Hello  SpringBoot");
        return "hello  SpringBoot";
    }

}
