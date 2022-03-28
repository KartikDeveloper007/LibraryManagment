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
    private  BooksImpl books;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private LibrarianRepo librarianRepo;
    @Autowired SubjectImpl subject;

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
        return books.fetchBookById(id);
    }

    @Override
    public Books findByBookName(String bName) {
        return books.fetchBookByName(bName);
    }

    @Override
    public void deleteBooks(Long bookId) {
        books.DeleteBooks(bookId);
    }

    @Override
    public List<List<Books>> findBookBySubjectName(String subjectName) {
        return subject.findBookBySubjectName(subjectName);
    }

    @Override
    public List<Books> findBookBySubjectId(Long subId) {
        return books.fetchBookBySubjectId(subId);
    }

    @Override
    public List<Books> findAllBooks() {
        return books.fetchBooks();
    }

    @Override
    public void issueBook(Long id, StudentBookIssued studentBookIssued) {
        int i=0;

        Student student1= studentService.getStudentById(id);
        List<StudentBookIssued> studentBookIssuedList =student1.getStudentBookIssuedList();
        studentBookIssuedList.add(studentBookIssued);
        i++;
        student1.setStudentBookIssuedList(studentBookIssuedList);
        student1.setNoOfBookIssued(i);
        studentService.updateStudent(student1,id);
    }

}
