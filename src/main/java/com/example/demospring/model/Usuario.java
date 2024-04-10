package com.example.demospring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Entity
@Data


public class Usuario {
    @Id
    private Integer id;

    private String name;
}
