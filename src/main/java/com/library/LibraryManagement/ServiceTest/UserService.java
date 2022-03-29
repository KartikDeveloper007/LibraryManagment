package com.library.LibraryManagement.ServiceTest;

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

    Users updateuser(Long id, Users users);
}
