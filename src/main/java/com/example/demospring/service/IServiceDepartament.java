package com.example.demospring.service;


import com.example.demospring.model.DepartamentSpring;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDepartament {

    List<DepartamentSpring> getAll();

    void create(DepartamentSpring departamentSpring);
}
