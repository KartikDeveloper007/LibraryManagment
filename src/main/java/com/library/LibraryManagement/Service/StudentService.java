package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student updateStudent(Student student,Long id);
    public  void deleteStudent(Long id);
    public List<StudentBookIssued> getStudentsBookIssued(Long id);
    public void penality(Long id) throws ParseException;
    public void isReturnedBooks(Long id) throws ParseException;
    public Student getStudentByMobileNo(Long mobileNo);
}
