package com.example.demospring.controller;


import com.example.demospring.model.Usuario;
import com.example.demospring.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class Welcome {


    @Autowired
    private IServiceUsuario serviceUsuario;


    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(){
        return  ResponseEntity.ok("Hello");
    }

    @GetMapping("/goodBye")
    public ResponseEntity<String> goodBye(){
        return new ResponseEntity<>("Gracias", HttpStatus.OK);
    }

    @GetMapping("/usuario")
    public List<Usuario> getAll(){
        return serviceUsuario.getAll();
    }

}
