package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Users saveUser(Users users);

}
