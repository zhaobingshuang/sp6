package me.zhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index () {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500 () {
        int a = 1 / 0;
        return "test500";
    }
}
