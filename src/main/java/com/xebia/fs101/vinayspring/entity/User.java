package com.xebia.fs101.vinayspring.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    private String rollno;

    public User() {

    }

    public User( String name, String rollno) {

        this.name = name;
        this.rollno = rollno;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getRollno() {

        return rollno;
    }
}
