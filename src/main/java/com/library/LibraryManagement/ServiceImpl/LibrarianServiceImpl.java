package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import com.library.LibraryManagement.Repository.LibrarianRepo;
import com.library.LibraryManagement.Service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibrarianServiceImpl implements LibrarianService {
    @Autowired
    private BooksImpl booksimpl;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private LibrarianRepo librarianRepo;
    @Autowired
    SubjectImpl subject;

    @Override
    public Librarian saveLibrarian(Librarian librarian) {
        return librarianRepo.save(librarian);
    }

    @Override
    public List<Librarian> findAllLibrarians() {
        return librarianRepo.findAll();
    }

    @Override
    public Librarian findLibrarianById(Long id) {
        return librarianRepo.findById(id).get();
    }

    @Override
    public Books findBooksBy(Long id) {
        return booksimpl.fetchBookById(id);
    }

    @Override
    public Books findByBookName(String bName) {
        return booksimpl.fetchBookByName(bName);
    }

    @Override
    public String  deleteBooks(Long bookId) {
        booksimpl.DeleteBooks(bookId);
        return "successfully deleted";
    }

    @Override
    public List<List<Books>> findBookBySubjectName(String subjectName) {
        return subject.findBookBySubjectName(subjectName);
    }

    @Override
    public List<Books> findBookBySubjectId(Long subId) {
        return booksimpl.fetchBookBySubjectId(subId);
    }

    @Override
    public List<Books> findAllBooks() {
        return booksimpl.fetchBooks();
    }

    @Override
    public String issueBook(Long id, Long Bid) {
        int i = 0;

        Student student1 = studentService.getStudentById(id);
        List<StudentBookIssued> studentBookIssuedList = student1.getStudentBookIssuedList();
        Books books = booksimpl.fetchBookById(Bid);
        if (books.getIsAvailable()) {
            books.setIsAvailable(false);
            booksimpl.updateBookById(books, books.getBookId());

            StudentBookIssued studentBookIssued = StudentBookIssued.builder().isIssued(true).issueDate("25-2-2022").bookName(books.getBookName())
                    .build();
            List<Books> booksList;
            if (studentBookIssued.getBooksList() == null) {
                booksList = new ArrayList<>();
            } else {
                booksList = studentBookIssued.getBooksList();
            }
            booksList.add(books);
            studentBookIssued.setBooksList(booksList);

            studentBookIssuedList.add(studentBookIssued);
            i++;
            student1.setStudentBookIssuedList(studentBookIssuedList);
            student1.setNoOfBookIssued(i);
            studentService.updateStudent(student1, id);
            return "successful issued";
        } else {
//            ResponseEntity<String> message=new ResponseEntity<String>("book already issued");
            return "book already issued";
        }
    }

}
