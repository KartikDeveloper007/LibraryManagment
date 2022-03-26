package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentBookIssueRepo extends JpaRepository<StudentBookIssued,Long> {

    @Query(value = "select * from student_book_issued_tbl st where s_id=:id",nativeQuery = true)
    public List<StudentBookIssued> getStudentsBooksById(@Param("id") Long id);
}
