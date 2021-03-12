package com.example.demo.repository;

import com.example.demo.domain.Authors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorsRepository extends CrudRepository<Authors, Integer> {
    @Query("select a from Authors a where bookid = ?1")
    List<Authors> findByBookID(Integer BID);
}
