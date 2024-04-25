package com.academix.application.entities;

import lombok.Data;
import lombok.ToString;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@ToString
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "idPerson")
public class Teacher extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTeacher;
    @Column(name = "CIN", length = 45)
    private String cin;
    private String diploma;
    @Temporal(TemporalType.DATE)
    @Column(name = "start_date_of_work", length = 10)
    private Date startDateOfWork;


}