package com.library.LibraryManagement.Repository;

import com.library.LibraryManagement.Model.Librarian;
import com.library.LibraryManagement.Model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepo extends JpaRepository<Library,Long> {
}
