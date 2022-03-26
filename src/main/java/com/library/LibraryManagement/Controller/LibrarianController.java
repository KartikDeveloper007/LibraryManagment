package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @PostMapping("/saveLibrarian")
    public Librarian saveLibrarian(@RequestBody Librarian librarian)
    {
       return librarianService.saveLibrarian(librarian);
    }

    @GetMapping("/findAllLibrarians")
    public List<Librarian> findAllLibrarians()
    {
        return librarianService.findAllLibrarians();
    }

    @GetMapping("/findLibrarianById/{lid}")
    public Librarian findLibrarianById(@PathVariable("lid")Long id)
    {
        return librarianService.findLibrarianById(id);
    }
}
