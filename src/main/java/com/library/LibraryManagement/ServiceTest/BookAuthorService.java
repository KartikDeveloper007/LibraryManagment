package com.library.LibraryManagement.ServiceTest;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookAuthorService{
//    public BookAuthor saveBookAuthor(BookAuthor bookAuthor);

    List<Books> findBookByAuthorName(String authorName);
}

