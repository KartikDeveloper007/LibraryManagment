package com.library.LibraryManagement.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnore
    private Student student;
    @OneToOne(mappedBy = "address1")
    private Librarian librarian;

}
