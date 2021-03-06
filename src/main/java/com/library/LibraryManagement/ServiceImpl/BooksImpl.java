package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Repository.BooksRepo;
import com.library.LibraryManagement.Repository.PublisherRepo;
import com.library.LibraryManagement.Repository.SubjectRepo;
import com.library.LibraryManagement.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksImpl implements BooksService {
    @Autowired
    private BooksRepo booksRepo;
    @Autowired
    private PublisherRepo publisherRepo;
    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public Books saveBooks(Books books) {
        return booksRepo.save(books);
    }

    @Override
    public List<Books> fetchBooks() {
        return booksRepo.findAll();
    }

    @Override
    public Books fetchBookById(Long bookId) {
        return booksRepo.findById(bookId).get();
    }



    @Override
    public Books fetchBookByName(String bookName) {
        return booksRepo.findByBookName(bookName);
    }

    /*@Override
    public Books fetchBookByPublisherId(Long bookId) {
        return null;
    }*/

    @Override
    public Books getDetailsByPId(Long publisherId) {

        return booksRepo.findBooksByPublisherPublisherId(publisherId);
    }


    @Override
    public List<Books> fetchBookBySubjectId(Long subjectId) {
        return booksRepo.findBookBySubjectSubjectId(subjectId);
    }

    @Override
    public Books updateBookById(Books books, Long bookId) {


        Books updated = booksRepo.findById(bookId).get();
        if (updated.getBookId() == null) {
            System.out.println("Element no present");
        }
        updated.setBookName(books.getBookName());
        updated.setAuthor(books.getAuthor());
        updated.setIsAvailable(books.getIsAvailable());

        updated.setPublisher(books.getPublisher());
        updated.setNoOfPages(books.getNoOfPages());
        updated.setSubject(books.getSubject());

//        System.out.println("is avalib====> " +updated.getIsAvailable());
        booksRepo.save(updated);
        return updated;
    }

    @Override
    public String fetchBookNameById(Long bookId) {
        String book = booksRepo.findById(bookId).get().getSubject().getSubjectName();
        return book;
    }


    @Override
    public void DeleteBooks(Long bookId) {
        booksRepo.deleteById(bookId);
    }

}
