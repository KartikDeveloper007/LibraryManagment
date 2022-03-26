package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Repository.LibrarianRepo;
import com.library.LibraryManagement.Service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianServiceImpl implements LibrarianService {
    @Autowired
    private LibrarianRepo librarianRepo;

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

}
