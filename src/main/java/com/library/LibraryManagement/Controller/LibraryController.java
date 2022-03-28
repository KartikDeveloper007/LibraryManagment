package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.Library;
import com.library.LibraryManagement.ServiceImpl.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library/")
public class LibraryController {

    @Autowired
    private LibraryServiceImpl libraryService;

    @PostMapping("/save")
    public Library createlibrary(@RequestBody Library library){
        return libraryService.saveLibrary(library);
    }


    @PutMapping("/update/{id}")
    public Library updatelibrary(@RequestBody Library library,@PathVariable("id") Long id){
        return libraryService.updateLibrary(library,id);
    }
}
