package com.library.LibraryManagement.ServiceTest;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.StudentBookIssued;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibrarianService {
    Librarian saveLibrarian(Librarian librarian);

    List<Librarian> findAllLibrarians();

    Librarian findLibrarianById(Long id);

    Books findBooksBy(Long id);

   Books findByBookName(String bName);

    void deleteBooks(Long bookId);

    List<List<Books>> findBookBySubjectName(String subjectName);

    List<Books> findBookBySubjectId(Long subId);

    List<Books> findAllBooks();

    void issueBook(Long id, StudentBookIssued studentBookIssued);
}
