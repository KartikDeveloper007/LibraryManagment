package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.ServiceImpl.BooksImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksImpl booksImpl;

    @PostMapping("/save")
    public Books saveBooks(@RequestBody Books books) {
        return booksImpl.saveBooks(books);
    }

    @GetMapping("/get")
    public List<Books> fetchBooksList() {
        return booksImpl.fetchBooks();
    }

    @GetMapping("/get/{bookId}")
    public Books fetchBooksListById(@PathVariable("bookId") Long bookId) {
        return booksImpl.fetchBookById(bookId);
    }

    @GetMapping("/getbyBookName/{bookName}")
    public Books fetchBookByName(@PathVariable("bookName") String bookName) {
        return booksImpl.fetchBookByName(bookName);
    }

    @GetMapping("/getBookByPublisherId/{publisherId}")
    public Books fetchBookByPublisherId(@PathVariable("publisherId") Long publisherId) {
        return booksImpl.getDetailsByPId(publisherId);
    }


    @GetMapping("/getBySubjectId/{subjectId}")
    public Books fetchBookBySubjectId(@PathVariable("subjectId") Long subjectId) {
        return booksImpl.fetchBookBySubjectId(subjectId);
    }

    @PutMapping("/updateById")
    public Books updateBookById(@RequestBody Books books, @RequestParam("id") Long bookId) {
        return booksImpl.updateBookById(books, bookId);
    }


    @DeleteMapping("/deleteBook/{bookId}")
    public void DeleteBooks(@PathVariable("bookId") Long bookId) {
        booksImpl.DeleteBooks(bookId);
    }
}
