package com.academix.application.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "")
@PrimaryKeyJoinColumn(name = "idPerson")
@NoArgsConstructor
public class Cleaner extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Number_registration", length = 45)
    private String numberOfRegistration;
    @Column(name = "CIN", length = 45)
    private String cin;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date_of_work", length = 10)
    private Date startDateOfWork;


}