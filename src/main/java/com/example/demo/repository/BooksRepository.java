package com.example.demo.repository;

import com.example.demo.domain.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Integer> {
    List<Books> findAllByName (String name);

    @Query(value = "select * from \"BOOKS\"", nativeQuery = true)
        //если и этого мало - можно написать запрос на чистом SQL и все это будет работать
    List<Books> findAllAS();
}
