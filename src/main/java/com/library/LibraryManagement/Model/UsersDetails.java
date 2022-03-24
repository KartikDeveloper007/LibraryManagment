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
@Table(name = "usersDetails_TBL")
public class UsersDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long usersDetailsId;
    private String firstName;
    private String lastName;
    private Long mobileNo;
    private String gender;
    private Date dob;
}
