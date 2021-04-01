package com.example.demo.controllers;

import com.example.demo.models.Authors;
import com.example.demo.models.Books;
import com.example.demo.services.AuthorsService;
import com.example.demo.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class BookController {
    private final BooksService booksService;
    private final AuthorsService authorsService;

    @Autowired
    public BookController(BooksService booksService, AuthorsService authorsService) {
        this.booksService = booksService;
        this.authorsService = authorsService;
    }

    @GetMapping("/books")
    public String books(Model model) {
        List<Books> books = booksService.findAll();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/book/create")
    public String bookCreateForm(Model model){
        List<Authors> allAuthors = authorsService.findAll();
        model.addAttribute("allAuthors", allAuthors);
        return "bookCreateForm";
    }

    @PostMapping("/books/create")
    public String bookCreate(@RequestParam String bookName, @RequestParam List<Integer> authorsList){
        List<Authors> newBookAuthors = authorsService.findAllById(authorsList);
        Books newBook = new Books(bookName, newBookAuthors);
        booksService.saveBook(newBook);
        return "redirect:/books";
    }

    @GetMapping("/books/delete")
    public String bookDelete(@RequestParam int bookId){
        booksService.deleteById(bookId);
        return "redirect:/books";
    }

    @GetMapping("/books/edit")
    public String bookEditForm(Model model, @RequestParam(value = "bookId") Integer bookId){
        Optional<Books> curBook = booksService.findById(bookId);
        model.addAttribute("curBook", curBook.get());
        List<Authors> allAuthors = authorsService.findAll();
        model.addAttribute("allAuthors", allAuthors);
        return "bookEditForm";
    }

    @PostMapping("/books/edit")
    public String bookEdit(@RequestParam Integer bookId, @RequestParam String bookName, @RequestParam List<Integer> authorsList){
        List<Authors> newBookAuthors = authorsService.findAllById(authorsList);
        Books updBook = booksService.findById(bookId).get();
        updBook.setName(bookName);
        updBook.setBookAuthors(newBookAuthors);
        booksService.saveBook(updBook);
        return "redirect:/books";
    }

    @GetMapping("books/authors")
    public String authors(Map<String, Object> model, @RequestParam(value = "bookId") Integer bookId) {
        Optional<Books> curBook = booksService.findById(bookId);
        model.put("curBook", curBook.get());
        return "authors";
    }
}
