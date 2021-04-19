package com.example.demo.services;

import com.example.demo.dto.BooksDTO;
import com.example.demo.mappers.BookMapper;
import com.example.demo.models.Books;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Autowired
    private EntityManager em;

    public List<BooksDTO> findAll(){
        List<Books> allBooks = booksRepository.findAll();
        return BookMapper.INSTANCE.toBookListDTO(allBooks);
    }

    public void saveBook(Books book){
        booksRepository.save(book);
    }

    public void deleteById(Integer book){
        booksRepository.deleteById(book);
    }
    public Optional<Books> findById(Integer bookid){
        return booksRepository.findById(bookid);
    }

}
