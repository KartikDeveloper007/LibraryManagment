package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import com.library.LibraryManagement.Service.LibrarianService;
import com.library.LibraryManagement.ServiceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/saveLibrarian")
    public Librarian saveLibrarian(@RequestBody Librarian librarian) {
        return librarianService.saveLibrarian(librarian);
    }

    @GetMapping("/findAllLibrarians")
    public List<Librarian> findAllLibrarians() {
        return librarianService.findAllLibrarians();
    }

    @GetMapping("/findLibrarianById/{lid}")
    public Librarian findLibrarianById(@PathVariable("lid") Long id) {
        return librarianService.findLibrarianById(id);
    }


    @GetMapping("/findBooksById/{bid}")
    public Books findBooksBy(@PathVariable("bid") Long id) {
        return librarianService.findBooksBy(id);
    }


    @GetMapping("findByBookName/{bName}")
    public Books findByBookName(@PathVariable("bName") String bName) {
        return librarianService.findByBookName(bName);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public void deleteBooks(@PathVariable("bookId") Long bookId) {
        librarianService.deleteBooks(bookId);
    }

    @GetMapping("findBookBySubjectName/{SubjectName}")
    public List<List<Books>> findBookBySubjectName(@PathVariable("SubjectName") String SubjectName) {
        return librarianService.findBookBySubjectName(SubjectName);
    }

    @GetMapping("findBookBySubjectId/{SubjectId}")
    public List<Books> findBookBySubjectId(@PathVariable("SubjectId") Long SubId) {
        return librarianService.findBookBySubjectId(SubId);
    }

    @GetMapping("findAllBooks")
    public List<Books> findAllBooks() {
        return librarianService.findAllBooks();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/findStudents")
    public List<Student> findStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/findStudentById/{StudentId}")
    public Student findStudentById(@PathVariable("StudentId") Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/updatestudent/{id}")
    public Student updateStudentById(@RequestBody Student student, @PathVariable("id") Long id) {
        return studentService.updateStudent(student, id);
    }


    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudentBuId(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/getBooksIssue/{id}")
    public List<StudentBookIssued> getStudentBooks(@PathVariable("id") Long id) {
        return studentService.getStudentsBookIssued(id);
    }

    @PostMapping("/issueBook/{StudentId}/{bookId}")
    public String issueBook(@PathVariable("StudentId") Long Id, @PathVariable("bookId") Long bookId) {
     return    librarianService.issueBook(Id, bookId);
    }

}
