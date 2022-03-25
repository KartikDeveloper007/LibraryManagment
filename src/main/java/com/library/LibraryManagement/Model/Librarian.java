package com.library.LibraryManagement.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "librarian_TBL")
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long librarianId;
    private String firstName;
    private String lastName;
    private String librarianEmail;
    private Long mobileNo;
    private String gender;
    private Date doj;
    private Boolean isActive;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "librarianAddressId")
    @JsonIgnore
    private Address address1;

}
