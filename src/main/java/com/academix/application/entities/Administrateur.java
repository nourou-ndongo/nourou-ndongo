package com.academix.application.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.jpa.repository.Temporal;
import com.vaadin.flow.component.template.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import lombok.Data;
@Data
@Entity
@Table(name = "administrators")
@PrimaryKeyJoinColumn(name = "idPerson")
public class Administrateur extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdministrator;
    ///private Double salary;
// private  String registration_number;
    @Column(name = "CIN", length = 45)
    private String cin;
    @jakarta.persistence.Temporal(TemporalType.DATE)
    @Column(name = "start_date_of_work", length = 10)
    private Date startDateOfWork;
}