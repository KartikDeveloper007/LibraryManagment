package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.BookAuthor;
import com.library.LibraryManagement.Repository.BookAuthorRepo;
import com.library.LibraryManagement.Repository.BooksRepo;
import com.library.LibraryManagement.Service.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorImpl  implements BookAuthorService {
@Autowired
private BookAuthorRepo bookAuthorRepo;
@Autowired
private BooksRepo booksRepo;

    @Override
    public BookAuthor saveBookAuthor(BookAuthor bookAuthor) {
        return bookAuthorRepo.save(bookAuthor);
    }

//    @Override
//    public List<Books> findBookByAuthorname(String authorName) {
//        BookAuthor bookAuthor= bookAuthorRepo.findByAuthorName(authorName);
//
//        bookAuthor.getBooks()
//        return ;
//    }
}
