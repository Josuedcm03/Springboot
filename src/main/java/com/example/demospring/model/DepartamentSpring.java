package com.example.demospring.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data //getter y setter, constructor de los datos requeridos
public class DepartamentSpring {
    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "departamentSpring", cascade = CascadeType.ALL)
    private List<MunicipioSpring> municipioSpring;

    /*
    * diferencias entre set y list
    * una lista puede tener datos repetidos.
    * */

}
