package com.library.LibraryManagement.ServiceTest;

import com.library.LibraryManagement.Model.Library;

public interface LibraryService {
    public Library saveLibrary(Library library);

    public Library updateLibrary(Library library,Long id);
}
