package com.fullstack.fullstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")

public class ClienteController {   
    
@GetMapping("/hello")
public  String Hello() {
 return "Ola meu retorno";

}




}//end class
