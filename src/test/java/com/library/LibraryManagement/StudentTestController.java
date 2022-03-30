package com.library.LibraryManagement;

import com.library.LibraryManagement.Controller.StudentController;
import com.library.LibraryManagement.Model.Address;
import com.library.LibraryManagement.Model.Student;
import com.library.LibraryManagement.Model.StudentBookIssued;
import com.library.LibraryManagement.ServiceImpl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class StudentTestController {

    @Mock
    private StudentServiceImpl studentService;

    @InjectMocks
    private StudentController studentController;

    @Test
    public void saveStudentTestcase(){

        Address address=Address.builder()
                .addressId(1L)
                .city("Ujjian")
                .landMark("asd")
                .pinCode(12213L)
                .state("M.P")
                .street("wqew")
                .build();

        Student student=new Student();

        List<StudentBookIssued> studentBookIssuedList =new ArrayList<>();
//        studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//        studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//        studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));


        Student studenttest=Student.builder()
                .studentId(1L)
                .profilePicture("asd")
                .noOfBookIssued(3)
                .isActive(true)
                .penality((double) 0)
                .dob(new Date(25/07/2022))
                .studentEmail("yash@gmail.com")
                .registrationDate(new Date(24/05/2022))
                .gender("M")
                .mobileNo(2342342L)
                .lastName("shri")
                .firstName("yash")
                .address(address)
                .studentBookIssuedList(studentBookIssuedList)
                .build();


        Mockito.when(studentService.saveStudent(studenttest)).thenReturn(studenttest);

        Student returnStudent= studentController.createStudent(studenttest);

        assertEquals(returnStudent,studenttest);

    }

    @Test
    public void getStudentByIdTest(){

        Address address=Address.builder()
                .addressId(1L)
                .city("Ujjian")
                .landMark("asd")
                .pinCode(12213L)
                .state("M.P")
                .street("wqew")
                .build();

        Student student=new Student();

        List<StudentBookIssued> studentBookIssuedList =new ArrayList<>();
//        studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//        studentBookIssuedList.add(new StudentBookIssued(2L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//        studentBookIssuedList.add(new StudentBookIssued(3L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));


        Student studenttest=Student.builder()
                .studentId(1L)
                .profilePicture("asd")
                .noOfBookIssued(3)
                .isActive(true)
                .penality((double) 0)
                .dob(new Date(25/07/2022))
                .studentEmail("yash@gmail.com")
                .registrationDate(new Date(24/05/2022))
                .gender("M")
                .mobileNo(2342342L)
                .lastName("shri")
                .firstName("yash")
                .address(address)
                .studentBookIssuedList(studentBookIssuedList)
                .build();

        Mockito.when(studentService.getStudentById(1L)).thenReturn(studenttest);

        Student returnStudent= studentController.findStudentById(1L);

        assertEquals(returnStudent,studenttest);
    }


    @Test
   public void updateStudenttest(){
       Address address=Address.builder()
               .addressId(1L)
               .city("Ujjian")
               .landMark("asd")
               .pinCode(12213L)
               .state("M.P")
               .street("wqew")
               .build();

       Student student=new Student();

       List<StudentBookIssued> studentBookIssuedList =new ArrayList<>();
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));


       Student studenttest=Student.builder()
               .studentId(1L)
               .profilePicture("asd")
               .noOfBookIssued(3)
               .isActive(true)
               .penality((double) 0)
               .dob(new Date(25/07/2022))
               .studentEmail("yash@gmail.com")
               .registrationDate(new Date(24/05/2022))
               .gender("M")
               .mobileNo(2342342L)
               .lastName("shri")
               .firstName("yash")
               .address(address)
               .studentBookIssuedList(studentBookIssuedList)
               .build();

      Mockito.when(studentService.updateStudent(studenttest,1L)).thenReturn(studenttest);

      Student returnUpdate =studentController.updateStudentById(studenttest,1L);

      assertEquals(returnUpdate,studenttest);
   }

   @Test
   public void deleteStudenttest(){
       doNothing().when(studentService).deleteStudent(1L);
       studentController.deleteStudentBuId(1L);
   }

   @Test
  public void penalityTest() throws ParseException {

       Address address=Address.builder()
               .addressId(1L)
               .city("Ujjian")
               .landMark("asd")
               .pinCode(12213L)
               .state("M.P")
               .street("wqew")
               .build();

       Student student=new Student();

       List<StudentBookIssued> studentBookIssuedList =new ArrayList<>();
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(2L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(3L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));


       Student studenttest=Student.builder()
               .studentId(1L)
               .profilePicture("asd")
               .noOfBookIssued(3)
               .isActive(true)
               .penality((double) 0)
               .dob(new Date(25/07/2022))
               .studentEmail("yash@gmail.com")
               .registrationDate(new Date(24/05/2022))
               .gender("M")
               .mobileNo(2342342L)
               .lastName("shri")
               .firstName("yash")
               .address(address)
               .studentBookIssuedList(studentBookIssuedList)
               .build();

       Mockito.when(studentService.getStudentById(1L)).thenReturn(studenttest);

       Student returnStudent= studentController.findStudentById(1L);

       assertEquals(returnStudent,studenttest);


     Mockito.when(studentService.getStudentsBookIssued(1L)).thenReturn(studentBookIssuedList);

     List<StudentBookIssued> books =studentController.getStudentBooks(1L);

     assertEquals(books,studentBookIssuedList);

     StudentBookIssued studentBookIssued =new StudentBookIssued();
      studentBookIssued.setIssueDate("23-04-2022");
      studentBookIssued.setReturnDate("01-05-2022");

     Double penality= Double.valueOf(0);
     SimpleDateFormat simpleDateFormatt=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

       Date issueDate= simpleDateFormatt.parse(studentBookIssued.getIssueDate());
       Date returnDate =simpleDateFormatt.parse(studentBookIssued.getReturnDate());

       long time= returnDate.getTime() - issueDate.getTime();
       long days_difference = (time/ (1000*60*60*24)) % 365;
       // System.out.println(days_difference);
       if(days_difference>7){
           penality= Double.valueOf((days_difference*5) - 35);
           System.out.println(penality);
       }

       studenttest.setPenality(penality);
       Mockito.when(studentService.saveStudent(studenttest)).thenReturn(studenttest);

       Student newreturnStudent= studentController.createStudent(studenttest);

       assertEquals(newreturnStudent,studenttest);

   }

   @Test
   public void getAllStudentTest(){
        List<Student> studentsList=new ArrayList<>();


       Address address=Address.builder()
               .addressId(1L)
               .city("Ujjian")
               .landMark("asd")
               .pinCode(12213L)
               .state("M.P")
               .street("wqew")
               .build();

       Student student=new Student();

       List<StudentBookIssued> studentBookIssuedList =new ArrayList<>();
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));
//       studentBookIssuedList.add(new StudentBookIssued(1L,"Let us C","C","24-04-2022","230-04-2022",false,true,student));


       Student studenttest=Student.builder()
               .studentId(1L)
               .profilePicture("asd")
               .noOfBookIssued(3)
               .isActive(true)
               .penality((double) 0)
               .dob(new Date(25/07/2022))
               .studentEmail("yash@gmail.com")
               .registrationDate(new Date(24/05/2022))
               .gender("M")
               .mobileNo(2342342L)
               .lastName("shri")
               .firstName("yash")
               .address(address)
               .studentBookIssuedList(studentBookIssuedList)
               .build();

       studentsList.add(studenttest);

       Mockito.when(studentService.getAllStudents()).thenReturn(studentsList);

       List<Student> students =studentController.findAllStudent();

       assertEquals(studentsList,students);

   }

}
