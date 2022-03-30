package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Library;

public interface LibraryService {
    public Library saveLibrary(Library library);

    public Library updateLibrary(Library library,Long id);
}
