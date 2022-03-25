package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Publisher;
import com.library.LibraryManagement.Repository.PublisherRepo;
import com.library.LibraryManagement.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherRepo publisherRepo;
    @Autowired
    private BooksImpl books;

    @Override
    public Books findBookByPublisherName(String pname) {
        Publisher publisher = publisherRepo.findByPublisherName(pname);
        Books books1 = books.getDetailsByPId(publisher.getPublisherId());
        return books1;
    }
}
