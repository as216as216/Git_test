package com.example.demo.repository;

import com.example.demo.domain.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Integer> {
    @Query("select b from Books b")
    List<Books> finbooksAS();

    @Query(value = "select * from  \"public\".\"books\"", nativeQuery = true)
        List<Books> findAllAS();
}
