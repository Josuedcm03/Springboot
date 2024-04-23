package com.example.demospring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MunicipioSpring {
    @Id
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // se relaciona con el padre que es Departament
    @JoinColumn(name = "departamentSpring_id") //nombre de  la tabla que se va a crear
    private DepartamentSpring departamentSpring;
}
