package com.example.demospring.controller;


import com.example.demospring.model.Usuario;
import com.example.demospring.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {
    @Autowired
    private IServiceUsuario serviceUsuario;

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return serviceUsuario.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Usuario usuario){
        serviceUsuario.create(usuario);
        return ResponseEntity.ok("Usuario creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Usuario usuario){
        if(usuario.getId() == null){
            return ResponseEntity.badRequest().body("Id no existente");
    }
        serviceUsuario.create(usuario);
        return ResponseEntity.ok("Usuario Actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if (id == null) {
            return ResponseEntity.badRequest().body("Id no existente");
        }
            serviceUsuario.delete(id);
            return ResponseEntity.ok("Usuario borrado");
    }
}
