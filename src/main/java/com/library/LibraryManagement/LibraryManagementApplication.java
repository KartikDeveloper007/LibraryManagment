package com.library.LibraryManagement;

import com.library.LibraryManagement.Model.StudentBookIssued;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(LibraryManagementApplication.class, args);

//		SimpleDateFormat simpleDateFormatt=new SimpleDateFormat("dd/MM/yyyy");
//		StudentBookIssued studentBookIssued=new StudentBookIssued();
//		studentBookIssued.setIssueDate("12/12/2022");
//		studentBookIssued.setReturnDate("18/12/2022");
//        Date date1 = simpleDateFormatt.parse(studentBookIssued.getIssueDate());
//
//		Date date2 =simpleDateFormatt.parse(studentBookIssued.getReturnDate());
//		long time= date2.getTime()-date1.getTime();
//		long days_difference = (time/ (1000*60*60*24)) % 365;
//
//		System.out.println(days_difference);

	}

}
