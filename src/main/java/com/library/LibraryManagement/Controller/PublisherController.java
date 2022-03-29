package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.ServiceTest.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
@Autowired
    private PublisherService publisherService;

    @GetMapping("/findBooksByPublisherName/{pname}")
    public List<Books> findByPublisherName(@PathVariable("pname") String pname) {
        return publisherService.findBookByPublisherName(pname);
    }
}
