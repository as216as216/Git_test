package com.example.demo.domain;

import javax.persistence.*;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name; // название книги

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
