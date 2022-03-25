package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository <Publisher,Long> {
    Publisher findByPublisherName(String pname);
}
