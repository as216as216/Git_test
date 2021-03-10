package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

//    @OneToMany (mappedBy="address", fetch=FetchType.EAGER)
//    private Collection<Person> tenants;

//    @OneToOne(optional = false, cascade = CascadeType.ALL)
//    @JoinColumn(name = "PASSPORT_ID")

    @ManyToMany(mappedBy = "bookAuthors",fetch = FetchType.EAGER)
    public List<Books> authorsBooks;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
