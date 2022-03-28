package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.ServiceImpl.BookAuthorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookAuthor")
public class BookAuthorController {
    @Autowired
    private BookAuthorImpl bookAuthorimpl;

    @GetMapping("/author/{authorName}")
    public List<Books> findByAuthorName(@PathVariable("authorName") String authorName){
        return bookAuthorimpl.findBookByAuthorName(authorName);
    }


}
