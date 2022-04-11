package com.test;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("In Home controller");
        return "index";
    }
}
