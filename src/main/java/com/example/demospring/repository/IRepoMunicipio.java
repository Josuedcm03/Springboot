package com.example.demospring.repository;


import com.example.demospring.model.MunicipioSpring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoMunicipio extends JpaRepository<MunicipioSpring, Integer> {
}
