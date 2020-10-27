package com.example.demo.repository;

import com.example.demo.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {
//    @Query("from Authors a inner join Books b where b.id=:BID")
//    List<Authors> findByBookID(@Param("BID") Integer BID);
//
//    @Query("select a from Authors a inner join Books b where  =?1")
//    List<Authors> findByBookID(Integer BID);

//    @Query("select a from Authors a, Books b where a.id = b.authorid and a.id=?1")
//    List<Authors> findByBookID(Integer BID);


//    @Query("select a.name from Authors a inner join a.Books b where ")
//    List<Authors> findByBookID(Integer BID);

//    @Query("select a from Authors a where bookid = ?1")
//    List<Authors> findByBookID(Integer BID);

    @Query(value = "select a.* from Authors a inner join Books b on a.id = b.authorid where b.bookid =?1", nativeQuery = true)
    List<Authors> findByBookID(Integer BID);
}
