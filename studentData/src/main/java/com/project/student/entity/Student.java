package com.project.student.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "father's_name")
    private String father;
    @ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;
    @ManyToOne(targetEntity = College.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id", referencedColumnName = "id")
    private College college;
}
