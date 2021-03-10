package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name; // название книги

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Books() {
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Authors> bookAuthors;

    public Books(String name, String authorid, Integer bookid) {
        this.name = name;
    }

    public Books(String name, List<Authors> bookAuthors) {
        this.name = name;
        this.bookAuthors = bookAuthors;
    }

    public List<Authors> getBookAuthors() {
        return bookAuthors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookAuthors(List<Authors> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }
}
