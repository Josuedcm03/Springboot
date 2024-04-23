package com.example.demospring.service;

import com.example.demospring.model.DepartamentSpring;
import com.example.demospring.model.MunicipioSpring;
import com.example.demospring.repository.IRepoDepartament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepartament implements IServiceDepartament{

    @Autowired
    private IRepoDepartament repoDepartament;
    @Override
    public List<DepartamentSpring> getAll() {
        return repoDepartament.findAll();
    }

    @Override
    public void create(DepartamentSpring departamentSpring){
        List<MunicipioSpring> lista = departamentSpring.getMunicipioSpring();
        for (MunicipioSpring municipioSpring: lista){
            municipioSpring.setDepartamentSpring(departamentSpring);
        }
        repoDepartament.save(departamentSpring);
    }
}
