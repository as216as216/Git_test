package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name; // название книги

    @Column(name = "authorid")
    private String authorid;

    @Column (name = "bookid")
    public String bookid;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Books() {
    }

    public String getAuthorid() {
        return authorid;
    }

    public String getBookid() {
        return bookid;
    }

    public Books(String name, String authorid, String bookid) {
        this.name = name;
        this.authorid = authorid;
        this.bookid = bookid;
    }
}
