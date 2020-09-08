package com.example.demo.repository;

import com.example.demo.domain.Authors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorsRepository extends CrudRepository<Authors, Integer> {
    @Query(value = "select * from \"AUTHORS\" where \"Bookid\"= :BID" , nativeQuery = true)
    List<Authors> findByBookID(@Param("BID") String BID);
}
