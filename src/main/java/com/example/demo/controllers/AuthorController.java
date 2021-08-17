package com.example.demo.controllers;

import com.example.demo.dto.AuthorDTO;
import com.example.demo.models.Authors;
import com.example.demo.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {
    private final AuthorsService authorsService;

    @Autowired
    public AuthorController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @GetMapping("/authors")
    public String authors(Model model){
        List<AuthorDTO> authorsList = authorsService.findAll();
        model.addAttribute("authorsList", authorsList);
        return "catalogAuthors";
    }

    @GetMapping("/author/create")
    public String authorCreate(){
        return "authorCreateForm";
    }

    @PostMapping("/author/create")
    public String authorAdd(@RequestParam String authorName){
        authorsService.saveAuthor(0, authorName);
        return "redirect:/authors";
    }

    @GetMapping("/author/delete")
    public String authordelete(@RequestParam Integer authorId){
        authorsService.deleteById(authorId);
        return "redirect:/authors";
    }

    @GetMapping("/author/edit")
    public String authoEditForm(Model model, @RequestParam Integer authorId){
        Authors author = authorsService.findById(authorId).get();
        model.addAttribute("author", author);
        return "authorEditForm";
    }

    @PostMapping("/author/edit")
    public String authorEdit(@RequestParam Integer authorId, @RequestParam String authorName){
        authorsService.saveAuthor(authorId, authorName);
        return "redirect:/authors";
    }
}
