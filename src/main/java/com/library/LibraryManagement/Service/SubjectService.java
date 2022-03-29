package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService  {
    List<Books> findBookBySubjectCode(String subjectCode);
    List<List<Books>> findBookBySubjectName(String subjectName);

}
