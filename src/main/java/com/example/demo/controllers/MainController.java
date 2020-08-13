package com.example.demo.controllers;

import com.example.demo.domain.Books;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("version", "version-0-1");
        return "home";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Books> books = booksRepository.findAll();
        model.put("books", books);
        return "main";
    }

}
