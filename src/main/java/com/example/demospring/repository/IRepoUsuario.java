package com.example.demospring.repository;

import com.example.demospring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //spring lo reconoce como un repositorio
public interface IRepoUsuario extends JpaRepository<Usuario, Integer> {
}
