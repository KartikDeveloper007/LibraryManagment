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


	}

}
