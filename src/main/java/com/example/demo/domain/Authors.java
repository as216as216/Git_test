package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Integer bookid;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBookid() {
        return bookid;
    }
}
