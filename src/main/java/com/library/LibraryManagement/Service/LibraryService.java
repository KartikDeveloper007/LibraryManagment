package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.Library;

import java.util.List;

public interface LibraryService {
    public Library saveLibrary(Library library);

    public Library updateLibrary(Library library,Long id);
}
