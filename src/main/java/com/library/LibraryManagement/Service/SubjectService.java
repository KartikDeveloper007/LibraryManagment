package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService  {
    Books findBookBySubjectCode(String subjectCode);
    List<Books> findBookBySubjectName(String subjectName);

}
