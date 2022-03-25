package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Long> {

    Subject findBySubjectCode(String subjectCode);
    List<Subject> findBySubjectName(String subjectName);
}
