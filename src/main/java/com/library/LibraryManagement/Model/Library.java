package com.library.LibraryManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "library_TBL")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libraryId;
    private Long noOfBooksAvailable;
    private Long noOfBooksIssued;
    private Long noOfBooksReturnedToday;
    private Long noOfBooksIssuedToday;

}
