package com.example.demo.controllers;

import com.example.demo.services.AuthorsService;
import com.example.demo.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private final BooksService booksService;
    private final AuthorsService authorsService;

    @Autowired
    public MainController(BooksService booksService, AuthorsService authorsService) {
        this.booksService = booksService;
        this.authorsService = authorsService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("version", "version-0-1");
        return "home";
    }
}
