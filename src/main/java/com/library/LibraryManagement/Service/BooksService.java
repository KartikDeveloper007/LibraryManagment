package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BooksService {
    public Books saveBooks(Books books);

    public List<Books> fetchBooks();

    public Books fetchBookById(Long bookId);

    public void DeleteBooks(Long bookId);

//    Books updateBookById(Books books, Long bookId);

    public Books fetchBookByName(String bookName);

    Books getDetailsByPId(Long publisherId);



    public Books fetchBookBySubjectId(Long subjectId);

    Books updateBookById(Books books, Long bookId);
}
