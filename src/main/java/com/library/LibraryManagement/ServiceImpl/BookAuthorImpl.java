package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.BookAuthor;
import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Repository.BookAuthorRepo;
import com.library.LibraryManagement.Repository.BooksRepo;
import com.library.LibraryManagement.ServiceTest.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookAuthorImpl implements BookAuthorService {
    @Autowired
    private BookAuthorRepo bookAuthorRepo;
    @Autowired
    private BooksRepo booksRepo;


    @Override
    public List<Books> findBookByAuthorName(String authorName) {
        List<BookAuthor> bookAuthors = bookAuthorRepo.findByAuthorName(authorName);
        List<Books> booksList = new ArrayList<>();
        for (BookAuthor bookAuthor : bookAuthors) {

            booksList.add(bookAuthor.getBooks());
        }


        return booksList;
    }
}