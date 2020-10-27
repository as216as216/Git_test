package com.example.demo.repository;

import com.example.demo.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Integer> {
//    @Query("select new com.example.demo.models.Books('') from Books b group by b.name")
//    List<Books> findAllGroupped();

    @Query("select b.name from Books b group by b.name")
    List<Books> findAllGroupped();
}
