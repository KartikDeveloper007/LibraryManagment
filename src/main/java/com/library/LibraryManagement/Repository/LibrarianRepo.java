package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepo extends JpaRepository<Librarian,Long> {
}
