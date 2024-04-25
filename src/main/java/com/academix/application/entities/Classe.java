package com.academix.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class Classe implements Serializable {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
