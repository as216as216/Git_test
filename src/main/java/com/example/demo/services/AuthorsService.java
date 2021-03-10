package com.example.demo.services;

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

    @Autowired
    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @Autowired
    EntityManager em;

    public List<Authors> findByBookID(Integer id){
        return authorsRepository.findByBookID(id);
    }

    public Authors saveAuthor(Authors author){
        return authorsRepository.save(author);
    }

    public List<Authors> findAll(){
        return authorsRepository.findAll();
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
