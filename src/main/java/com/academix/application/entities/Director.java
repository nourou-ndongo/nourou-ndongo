package com.academix.application.entities;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
    @Entity
    @Table(name = "director")
    @PrimaryKeyJoinColumn(name = "idPerson")
    public class Director extends Person implements Serializable {

        private static final long serialVersionUID = 1L;

        @Column(name = "Number_registration", length = 45)
        private String numberOfRegistration;

        @Column(name = "CIN", length = 45)
        private String cin;
        //private Set<Person> persons = new HashSet<Person>(0);



}