package com.library.LibraryManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "address_TBL")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String street;
    private String landMark;
    private String state;
    private String city;
    private Long pinCode;

    @OneToOne(mappedBy = "address")
    private Student student;
    @OneToOne(mappedBy = "address1")
    private Librarian librarian;

}
