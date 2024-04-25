package com.academix.application.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "secretarys")
@PrimaryKeyJoinColumn(name = "idPerson")
public class Secretary extends Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSecretary;
    @Column(name = "CIN", length = 45)
    private String cin;
    @Temporal(TemporalType.DATE)
    @Column(name = "start_date_of_work", length = 10)
    private Date startDateOfWork;
}