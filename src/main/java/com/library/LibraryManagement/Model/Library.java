package com.library.LibraryManagement.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "library")
    @JsonManagedReference
    private List<Librarian> librarian;

}
