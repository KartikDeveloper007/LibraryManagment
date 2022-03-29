package com.library.LibraryManagement.ServiceImpl;


import com.library.LibraryManagement.Model.Books;
import com.library.LibraryManagement.Model.Subject;
import com.library.LibraryManagement.Repository.SubjectRepo;
import com.library.LibraryManagement.ServiceTest.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectImpl implements SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private BooksImpl books;


    @Override
    public List<Books> findBookBySubjectCode(String subjectCode) {
        Subject subject = subjectRepo.findBySubjectCode(subjectCode);
       List <Books> books2 = books.fetchBookBySubjectId(subject.getSubjectId());
        return books2;
    }

    @Override
    public List<List<Books>> findBookBySubjectName(String subjectName) {
        List<Subject> subject = subjectRepo.findBySubjectName(subjectName);
        List<List<Books>> books2 = new ArrayList<>();
        for (Subject subject1 : subject
        ) {

           books2.add( books.fetchBookBySubjectId(subject1.getSubjectId()));



        }

        return books2;
    }


}
