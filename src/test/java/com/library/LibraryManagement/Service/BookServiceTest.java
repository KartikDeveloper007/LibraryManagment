package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.BookAuthor;
import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Publisher;
import com.library.LibraryManagement.Model.Subject;
import com.library.LibraryManagement.Repository.BooksRepo;
import com.library.LibraryManagement.ServiceImpl.BooksImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class BookServiceTest {
    @Mock
    private BooksRepo booksRepo;
    @InjectMocks
    private BooksImpl booksImpl;

    @Test
    public void saveTest() {
        Subject subject = Subject.builder().subjectId(1L).subjectName("Maths").subjectCode("M02").build();

        Publisher publisher = Publisher.builder().build();
        publisher.setPublisherId(1L);
        publisher.setPublisherName("KK-Publicaation");
        publisher.setPublisherEmail("kartikkhantal@gmail.com");

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
        Mockito.when(booksRepo.save(books)).thenReturn(books);
        Assertions.assertThat(booksImpl.saveBooks(books)).isEqualTo(books);


    }

    @Test
    public void getAllBooksTest() {
        List<Books> bookList = new ArrayList<>();
        Subject subject = Subject.builder().subjectId(1L).subjectName("Maths").subjectCode("M02").build();

        Publisher publisher = Publisher.builder().build();
        publisher.setPublisherId(1L);
        publisher.setPublisherName("KK-Publicaation");
        publisher.setPublisherEmail("kartikkhantal@gmail.com");

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
        bookList.add(books);

        Mockito.when(booksRepo.findAll()).thenReturn(bookList);
        Assertions.assertThat(booksImpl.fetchBooks()).isEqualTo(bookList);
    }

    @Test
    public void updateBookTest() {
        Subject subject = Subject.builder().subjectId(1L).subjectName("Maths").subjectCode("M02").build();

        Publisher publisher = Publisher.builder().build();
        publisher.setPublisherId(1L);
        publisher.setPublisherName("KK-Publicaation");
        publisher.setPublisherEmail("kartikkhantal@gmail.com");

        BookAuthor bookAuthor = BookAuthor.builder().build();
        bookAuthor.setAuthorName("YAsh");
        bookAuthor.setAuthorId(4L);
        List<BookAuthor> bookAuthors = new ArrayList<>();
        bookAuthors.add(bookAuthor);


        Books books = Books.builder().build();
        books.setBookId(3L);
        books.setBookName("ALgebra");
        books.setSubject(subject);
        books.setNoOfPages(300);
        books.setIsAvailable(true);
        books.setPublisher(publisher);
        books.setAuthor(bookAuthors);

        Mockito.when(booksRepo.save(books)).thenReturn(books);
books.setBookName("Calculus");
        Mockito.when(booksRepo.save(books)).thenReturn(books);
        Assertions.assertThat(booksImpl.saveBooks(books)).isEqualTo(books);

    }

    @Test
    public void deleteBooktest() {
        Mockito.doNothing().when(booksRepo).deleteById(1L);
        booksImpl.DeleteBooks(1L);
    }


}
