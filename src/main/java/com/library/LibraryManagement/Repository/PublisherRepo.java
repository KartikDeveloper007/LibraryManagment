package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepo extends JpaRepository <Publisher,Long> {
    List<Publisher> findByPublisherName(String pname);
}
