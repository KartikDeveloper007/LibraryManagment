package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Service.UserService;
import com.library.LibraryManagement.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public Users  saveUser(@RequestBody Users users)
    {
        return userService.saveUser(users);
    }
}
