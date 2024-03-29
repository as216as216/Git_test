package com.example.demo.services;

import com.example.demo.dto.AuthorDTO;
import com.example.demo.mappers.AuthorMapper;
import com.example.demo.models.Authors;
import com.example.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;
    private final EntityManager em;

    @Autowired
    public AuthorsService(AuthorsRepository authorsRepository, EntityManager em) {
        this.authorsRepository = authorsRepository;
        this.em = em;
    }

    public void saveAuthor(Integer authorId, String authorName){
        Authors author;
        if (authorId == 0) { // создаём нового автора
            author = new Authors();
        }
        else { // редактируем автора
            author = this.findById(authorId);
        }
        author.setName(authorName);
        authorsRepository.save(author);
    }

    public List<AuthorDTO> findAll(){
        List<Authors> authors = authorsRepository.findAll();
        return AuthorMapper.INSTANCE.toAuthorListDTO(authors);
    }

    public Authors findById(Integer authorId){
        return authorsRepository.findById(authorId).orElseThrow(() -> new NoSuchElementException("Автор не найден в БД!"));
    }

    public List<Authors> findAllById(List<Integer> authorsIds){
        return authorsRepository.findAllById(authorsIds);
    }

    public void deleteById(Integer authorId){
        authorsRepository.deleteById(authorId);
    }

}
