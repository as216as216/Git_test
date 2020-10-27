package com.example.demo.services;

import com.example.demo.models.Authors;
import com.example.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;

    @Autowired
    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public List<Authors> findByBookID(int id){
        return authorsRepository.findByBookID(id);
    }

    public Authors saveAuthor(Authors author){
        return authorsRepository.save(author);
    }

    public List<Authors> findAll(){
        return authorsRepository.findAll();
    }

}
