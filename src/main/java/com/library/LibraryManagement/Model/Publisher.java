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
@Table(name = "publisher_TBL")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long publisherId;
    private String publisherName;
    private String publisherEmail;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Books books1;
}
