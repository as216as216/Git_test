package com.example.demo.services;

import com.example.demo.models.Books;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Autowired
    private EntityManager em;

    public List<Books> findAll(){
        return booksRepository.findAll();

    }

    public List<Books> findAllGroupped(){
        return booksRepository.findAllGroupped();
    }

    public Books saveBook(Books book){
        return booksRepository.save(book);
    }

    public void deleteById(int bookId){
        booksRepository.deleteById(bookId);
    }




}
