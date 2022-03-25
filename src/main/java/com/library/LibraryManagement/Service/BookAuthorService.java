package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.BookAuthor;
import org.springframework.stereotype.Service;

@Service
public interface BookAuthorService{
    public BookAuthor saveBookAuthor(BookAuthor bookAuthor);

//    List<Books> findBookByAuthorname(String authorName);
}

