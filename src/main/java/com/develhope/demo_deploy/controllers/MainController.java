package com.develhope.demo_deploy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MainController {

    @GetMapping("")
    public int Sum (Integer integer1 , Integer integer2) {

        return 4 + 8;
    }
}
