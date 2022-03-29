package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Library;
import com.library.LibraryManagement.Repository.LibraryRepo;
import com.library.LibraryManagement.ServiceTest.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepo libraryRepo;

    @Override
    public Library saveLibrary(Library library) {
        return libraryRepo.save(library);
    }



    @Override
    public Library updateLibrary(Library library,Long id) {
        Library updateLibrary =libraryRepo.findById(id).get();
        updateLibrary.setNoOfBooksAvailable(library.getNoOfBooksAvailable());
        updateLibrary.setNoOfBooksIssued(library.getNoOfBooksIssued());
        updateLibrary.setNoOfBooksIssuedToday(library.getNoOfBooksIssuedToday());
        updateLibrary.setNoOfBooksReturnedToday(library.getNoOfBooksReturnedToday());

        return libraryRepo.save(updateLibrary);

    }
}
