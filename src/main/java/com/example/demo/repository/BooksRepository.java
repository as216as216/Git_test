package com.example.demo.repository;

import com.example.demo.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
