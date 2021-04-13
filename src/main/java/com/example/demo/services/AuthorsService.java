package com.example.demo.services;

import com.example.demo.dto.AuthorDTO;
import com.example.demo.mappers.AuthorMapper;
import com.example.demo.models.Authors;
import com.example.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
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
        if (authorId == 0) { // создаём нового автора
            Authors author = new Authors();
            author.setName(authorName); // не понимаю, почему, если эту строку вынести за пределы if, то IDEA ругается
            authorsRepository.save(author);
        }
        else { // редактируем автора
            Authors author = this.findById(authorId).get();
            author.setName(authorName); // не понимаю, почему, если эту строку вынести за пределы if, то IDEA ругается
            authorsRepository.save(author);
        }
    }

    public AuthorDTO findAll(){
        List<Authors> authors = authorsRepository.findAll();
        return AuthorMapper.INSTANCE.toDTO(authors);
    }

    public Optional<Authors> findById(Integer authorId){
        return authorsRepository.findById(authorId);
    }

    public List<Authors> findAllById(List<Integer> authorsIds){
        return authorsRepository.findAllById(authorsIds);
    }

    public void deleteById(Integer authorId){
        authorsRepository.deleteById(authorId);
    }

}
