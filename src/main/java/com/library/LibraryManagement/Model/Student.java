package com.library.LibraryManagement.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @JoinColumn(name="address_student_id")
    @ToString.Exclude
    private Address address;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    @ToString.Exclude
    private List<StudentBookIssued> studentBookIssuedList;




}
