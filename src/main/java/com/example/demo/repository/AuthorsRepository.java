package com.example.demo.repository;

import com.example.demo.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {
    @Query(value = "select a from Authors a")
    List<Authors> findByBookID(Integer BID);
}
