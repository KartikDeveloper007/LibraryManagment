package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublisherService {


    List<Books> findBookByPublisherName(String pname);
}
