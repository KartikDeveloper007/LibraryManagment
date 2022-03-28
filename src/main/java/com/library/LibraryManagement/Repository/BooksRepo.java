package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {
    Books findByBookName(String name);


    Books findBooksByPublisherPublisherId(long Id);

    Books findBookBySubjectSubjectId(Long id);

}
