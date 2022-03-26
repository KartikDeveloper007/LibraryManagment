package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Librarian;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibrarianService {
    Librarian saveLibrarian(Librarian librarian);

    List<Librarian> findAllLibrarians();

    Librarian findLibrarianById(Long id);
}
