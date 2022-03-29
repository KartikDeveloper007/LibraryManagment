package com.library.LibraryManagement.ControllerTest;

import com.library.LibraryManagement.Controller.LibrarianController;
import com.library.LibraryManagement.Model.*;
import com.library.LibraryManagement.Service.LibrarianService;
import com.library.LibraryManagement.ServiceImpl.BooksImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class LibrarianControllerTest {

    @InjectMocks
    private LibrarianController librarianController;
    @Mock
    private LibrarianService librarianService;

    @Mock
    private BooksImpl booksimpl;

    @Test
    public void SaveLibrarian() {
        Address address = Address.builder().addressId(1L).city("indore").landMark("sayajiHotel").pinCode(452002L).state("MP")
                .street("103,pardeshi pura").build();
        Library library
                = Library.builder().libraryId(1L).noOfBooksAvailable(400L).noOfBooksIssued(200L).noOfBooksIssuedToday(20L)
                .noOfBooksReturnedToday(10L).build();

        Librarian librarian = Librarian.builder()
                .librarianEmail("ak@123456")
                .librarianId(1L)
                .lastName("akul")
                .firstName("saklecha")
                .mobileNo(9171247781L)
                .doj(null)
                .gender("male")
                .isActive(true)
                .address1(address)
                .library(library)
                .build();

        Mockito.when(librarianService.saveLibrarian(librarian)).thenReturn(librarian);
        Librarian librarianReturned = this.librarianController.saveLibrarian(librarian);
        assertEquals(librarianReturned, librarian);

    }

    @Test
    public void FindBooksById() {
        Subject subject = Subject.builder()
                .subjectId(1L)
                .subjectName("Maths").subjectCode("M02").build();

        Publisher publisher = Publisher.builder().build();
        publisher.setPublisherId(1L);
        publisher.setPublisherName("KK-Publicaation");
//        publisher.setpublisheremail("kartikkhantal@gmail.com");

        BookAuthor bookAuthor = BookAuthor.builder().build();
        bookAuthor.setAuthorName("YAsh");
        bookAuthor.setAuthorId(2L);
        List<BookAuthor> bookAuthors = new ArrayList<>();
        bookAuthors.add(bookAuthor);


        Books books = Books.builder().build();
        books.setBookId(1L);
        books.setBookName("ALgebra");
        books.setSubject(subject);
        books.setNoOfPages(300);
        books.setIsAvailable(true);
        books.setPublisher(publisher);
        books.setAuthor(bookAuthors);

//        Mockito.when(booksimpl.fetchBookById(books.getBookId())).thenReturn(books);
        Mockito.when(librarianService.findBooksBy(books.getBookId())).thenReturn(books);

        Books booksRetuned = this.librarianController.findBooksBy(books.getBookId());

        assertEquals(booksRetuned, books);
    }

}
