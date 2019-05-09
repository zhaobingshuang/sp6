package me.zhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myerror")
public class ErrorController {

    @RequestMapping("/404")
    public String page404() {
        System.out.printf("adsfaasas");
        return "my404";
    }

    @RequestMapping("/500")
    public String page500() {
        return "my500";
    }
}
