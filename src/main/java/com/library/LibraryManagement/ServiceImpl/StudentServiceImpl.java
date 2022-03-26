package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import com.library.LibraryManagement.Repository.StudentBookIssueRepo;
import com.library.LibraryManagement.Repository.StudentRepo;
import com.library.LibraryManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentBookIssueRepo studentBookIssueRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Student updateStudent =getStudentById(id);
       updateStudent.setFirstName(student.getFirstName());
       updateStudent.setLastName(student.getLastName());
       updateStudent.setStudentEmail(student.getStudentEmail());
       updateStudent.setAddress(student.getAddress());
       updateStudent.setDob(student.getDob());
       updateStudent.setGender(student.getGender());
       updateStudent.setIsActive(student.getIsActive());
       updateStudent.setMobileNo(student.getMobileNo());
       updateStudent.setNoOfBookIssued(student.getNoOfBookIssued());
       updateStudent.setPenality(student.getPenality());
       updateStudent.setProfilePicture(student.getProfilePicture());
       updateStudent.setStudentBookIssuedList(student.getStudentBookIssuedList());
        return studentRepo.save(updateStudent);
    }

    @Override
    public void deleteStudent(Long id) {
       studentRepo.deleteById(id);
    }

    @Override
    public List<StudentBookIssued> getStudentsBookIssued(Long id) {
        return studentBookIssueRepo.getStudentsBooksById(id);
    }

      @Override
    public void penality(Long id) throws ParseException {
        Student student= getStudentById(id);
        List<StudentBookIssued> studentBookIssuedList=  student.getStudentBookIssuedList();
        SimpleDateFormat simpleDateFormatt=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
         Double penality= Double.valueOf(0);
          for(StudentBookIssued list: studentBookIssuedList){
              Date issueDate= simpleDateFormatt.parse(list.getIssueDate());
              Date returnDate =simpleDateFormatt.parse(list.getReturnDate());
              long time= returnDate.getTime() - issueDate.getTime();
              long days_difference = (time/ (1000*60*60*24)) % 365;
             // System.out.println(days_difference);
              if(days_difference>7){
                  penality= Double.valueOf((days_difference*5) - 35);
                  System.out.println(penality);

              }
         }
          student.setPenality(penality);
          studentRepo.save(student);
  }

    @Override
    public Student getStudentByMobileNo(Long mobileNo) {
        return studentRepo.findByMobileNo(mobileNo);
    }


}
