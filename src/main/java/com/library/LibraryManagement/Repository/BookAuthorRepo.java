package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepo extends JpaRepository<BookAuthor,Long> {
    BookAuthor findByAuthorName(String authorname);
}
