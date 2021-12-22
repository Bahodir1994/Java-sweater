package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Maincontroller {

    @GetMapping("/main")
    public String main(Map<String, Object> model)
    {
        model.put("some", "Hello from controller switchsome");
        return "main";
    }

}