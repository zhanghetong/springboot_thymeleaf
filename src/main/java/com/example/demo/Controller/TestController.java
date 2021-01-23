package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hetong.zhang
 * @version 1.0
 * @date 2021/1/21
 */
@Controller
public class TestController {

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "test11";
    }

}
