package com.example.demo.repository;

import com.example.demo.domain.Books;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
