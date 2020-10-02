package com.example.demo.controllers;

import com.example.demo.domain.Authors;
import com.example.demo.domain.Books;
import com.example.demo.repository.AuthorsRepository;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private AuthorsRepository authorsRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("version", "version-0-1");
        return "home";
    }

    @GetMapping("/books")
    public String main(Map<String, Object> model) {
        Iterable<Books> books = booksRepository.findAll();
        model.put("books", books);

        String s1 = "Привет из Контроллера";
        model.put("s1", s1);
        return "books";
    }

    @GetMapping("books/authors")
    public String authors(Map<String, Object> model, @RequestParam(value = "bookId") Integer bookId) {
        Iterable<Authors> authors = authorsRepository.findByBookID(bookId);
        model.put("authors", authors);
        return "authors";
    }
}
