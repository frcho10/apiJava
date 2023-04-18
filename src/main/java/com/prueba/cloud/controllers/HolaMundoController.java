package com.prueba.cloud.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundoController {

    @GetMapping("/")
    @ResponseBody
    public String inicial(){
        return "Inicial";
    }
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Entra a test";
    }
    @GetMapping(value = "/test", params = "mensaje")
    @ResponseBody
    public String test(@RequestParam String mensaje){
        mensaje=mensaje==null?"default":mensaje;
        return "Mensaje recibido: "+mensaje;
    }
}
