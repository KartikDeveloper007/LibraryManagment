package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Users saveUser(Users users);

    List<Users> findAllUsers();

    Users findUserById(Long id);

    Users findUserByName(String username);

    Users findUserByEmail(String email);

    void deleteUserById(Long id);
}
