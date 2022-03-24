package com.library.LibraryManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "studentBookIssued_TBL")
public class StudentBookIssued {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long issueId;
    private String studentName;
    private Date dob;
    private Long bookId;
    private String bookName;
    private String bookSubject;
    private Date issueDate;
    private Date returnDate;
    private Double penality;
    private Boolean isReturned;
    private Boolean isIssued;
    private Long studentId;


}
