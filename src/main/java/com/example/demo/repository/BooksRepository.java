package com.example.demo.repository;

import com.example.demo.domain.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
