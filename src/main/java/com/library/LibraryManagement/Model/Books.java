package com.library.LibraryManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="books_TBL")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String bookName;
    private Integer noOfPages;
    private String publisher;
    private Boolean isAvailable;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Subject subject;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "books")
    private List<BookAuthor> author;


}
