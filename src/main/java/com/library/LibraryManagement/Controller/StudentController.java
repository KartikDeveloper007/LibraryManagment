package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import com.library.LibraryManagement.ServiceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/savestudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/findallstudent")
    public List<Student> findAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/findstudent/{id}")
    public Student findStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/updatestudent/{id}")
    public Student updateStudentById(@RequestBody Student student,@PathVariable("id") Long id){
        return studentService.updateStudent(student,id);
    }

    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudentBuId(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/getBooksIssue/{id}")
    public List<StudentBookIssued> getStudentBooks(@PathVariable("id") Long id){
        return studentService.getStudentsBookIssued(id);
    }

    @GetMapping("/penality/{id}")
    public void penalityOfStudent(@PathVariable("id") Long id) throws ParseException {
        studentService.penality(id);
    }

    @GetMapping("/getStudent/{mobileNo}")
    public Student getStudentbyNumber(@PathVariable("mobileNo") Long mobileNo){
        return studentService.getStudentByMobileNo(mobileNo);
    }
}
