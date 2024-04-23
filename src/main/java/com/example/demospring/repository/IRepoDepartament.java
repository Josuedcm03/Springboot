package com.example.demospring.repository;


import com.example.demospring.model.DepartamentSpring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoDepartament extends JpaRepository<DepartamentSpring, Integer> {

}
