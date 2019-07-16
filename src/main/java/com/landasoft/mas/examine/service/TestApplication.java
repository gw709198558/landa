package com.landasoft.mas.examine.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestApplication {


    @GetMapping("/get")
    public void stringgbeg(){
        System.out.print("asdfjaskdfa");
    }
}
