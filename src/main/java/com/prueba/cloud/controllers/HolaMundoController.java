package com.prueba.cloud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @RequestMapping(value="test")
    public String test(){

        return "test";
    }
}
