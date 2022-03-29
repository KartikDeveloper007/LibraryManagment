package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Publisher;
import com.library.LibraryManagement.Repository.PublisherRepo;
import com.library.LibraryManagement.ServiceTest.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherRepo publisherRepo;
    @Autowired
    private BooksImpl books;

    @Override
    public List<Books> findBookByPublisherName(String pname) {
        List<Publisher> publishers = publisherRepo.findByPublisherName(pname);
        List<Books> book = new ArrayList<>();
        for (Publisher publisher : publishers
        ) {

            book.add(books.getDetailsByPId(publisher.getPublisherId()));


        }
        return book;
    }
}
