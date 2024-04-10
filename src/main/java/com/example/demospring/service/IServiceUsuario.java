package com.example.demospring.service;

import com.example.demospring.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //spring lo reconoce como service o capa de negocios
public interface IServiceUsuario {
    public List<Usuario> getAll();

    public void create(Usuario usuario);

    public void delete(Integer id);


}
