package com.example.demospring.controller;

import com.example.demospring.model.DepartamentSpring;
import com.example.demospring.service.IServiceDepartament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departament")

public class ControllerDepartament {

    @Autowired
    private IServiceDepartament serviceDepartament;


    @GetMapping("/all")
    public List<DepartamentSpring> getAll(){
        return serviceDepartament.getAll();
    }

    @PostMapping("/crate")
    public void create(@RequestBody DepartamentSpring departamentSpring){
        serviceDepartament.create(departamentSpring);
    }

}
