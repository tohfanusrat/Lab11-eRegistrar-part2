package edu.miu.cs.cs425.eregistrar.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/eregistrar", "/home", "/eregistrar/home"})
    public String home() {
        return "home/index";
    }

}
