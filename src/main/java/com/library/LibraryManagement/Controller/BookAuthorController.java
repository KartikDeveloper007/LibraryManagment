package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.BookAuthor;
import com.library.LibraryManagement.ServiceImpl.BookAuthorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookAuthor")
public class BookAuthorController {
    @Autowired
    private BookAuthorImpl bookAuthorimpl;

    @PostMapping("/save")
    public BookAuthor saveBookAuthor(@RequestBody BookAuthor bookAuthor){
        return bookAuthorimpl.saveBookAuthor(bookAuthor);
    }


}
