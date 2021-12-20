package com.mab.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        return Arrays.asList(
                new Book(1l,"Livre 1","Auteur livre 1"),
                new Book(2l,"Livre 2","Auteur livre 2"),
                new Book(3l,"Livre 3","Auteur livre 3"),
                new Book(4l,"Livre 4","Auteur livre 4"));
    }

}
