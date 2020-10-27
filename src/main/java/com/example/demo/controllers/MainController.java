package com.example.demo.controllers;

import com.example.demo.models.Authors;
import com.example.demo.models.Books;
import com.example.demo.services.AuthorsService;
import com.example.demo.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/books")
    public String books(Model model) {
//        List<Books> books = booksService.findAll();
        List<Books> books = booksService.findAllGroupped();
//        model.put("books", books);
        model.addAttribute("books", books);

        String s1 = "Привет из Контроллера";
        model.addAttribute("s1", s1);
        return "books";
    }

    @GetMapping("/book/create")
    public String bookCreateForm(Model model){
        List<Authors> allAuthors = authorsService.findAll();
        model.addAttribute("allAuthors", allAuthors);
        return "bookCreateForm";
    }

    @PostMapping("/book/create")
    public String bookCreate(@RequestParam String bookName, @RequestParam int[] authorsList ){
        Books newBook = new Books(bookName, "1", "1");
        booksService.saveBook(newBook);
        return "redirect:/books";
    }

    @GetMapping("/books/delete")
    public String bookDelete(@RequestParam int bookId){
        booksService.deleteById(bookId);
        return "redirect:/books";
    }

    @GetMapping("books/authors")
    public String authors(Map<String, Object> model, @RequestParam(value = "bookId") Integer bookId) {
        List<Authors> authors = authorsService.findByBookID(bookId);
        model.put("authors", authors);
        return "authors";
    }
}
