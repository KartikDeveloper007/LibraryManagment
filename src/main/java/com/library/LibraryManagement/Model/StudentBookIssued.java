package com.library.LibraryManagement.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "studentBookIssued_TBL")
public class StudentBookIssued {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long issueId;
    private String bookName;
    private String bookSubject;
    private String issueDate;
    private String returnDate;
    private Boolean isReturned;
    private Boolean isIssued;


    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private Student student;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    @JsonIgnore
    @ToString.Exclude
    private List<Books> booksList;

}
