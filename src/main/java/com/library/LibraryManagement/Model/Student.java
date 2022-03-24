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
@Table(name = "student_TBL")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private Long mobileNo;
    private String gender;
    private Date dob;
    private Date registrationDate;
    private Boolean isActive;
    private Integer noOfBookIssued;
    private Double penality;
    private String profilePicture;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;


}
