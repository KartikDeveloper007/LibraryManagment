package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

@Service
public interface PublisherService {


    Books findBookByPublisherName(String pname);
}
