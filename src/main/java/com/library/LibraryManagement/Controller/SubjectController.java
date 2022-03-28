package com.library.LibraryManagement.Controller;


import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.ServiceImpl.SubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectImpl subjectImpl;

    @GetMapping("/findBooksBySubjectCode/{subjectCode}")
    public List<Books>  findBySubjectCode(@PathVariable("subjectCode") String subjectCode) {
        return subjectImpl.findBookBySubjectCode(subjectCode);
    }
    @GetMapping("/findBooksBySubjectName/{subjectName}")
    public List<List<Books>> findBySubjectName(@PathVariable("subjectName") String subjectName) {
        return subjectImpl.findBookBySubjectName(subjectName);
    }


}
