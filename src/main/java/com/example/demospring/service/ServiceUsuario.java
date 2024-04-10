package com.example.demospring.service;

import com.example.demospring.model.Usuario;
import com.example.demospring.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsuario implements IServiceUsuario{

    @Autowired
    private IRepoUsuario repo;


    @Override
    public List<Usuario> getAll() {
        return repo.findAll();
    }

    @Override
    public void create(Usuario usuario) {
        repo.save(usuario);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
