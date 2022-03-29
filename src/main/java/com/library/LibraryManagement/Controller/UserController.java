package com.library.LibraryManagement.Controller;

import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public Users saveUser(@RequestBody Users users) {
        return userService.saveUser(users);
    }

    @GetMapping("/findalluser")
    public List<Users> findAllUsers()
    {
        return userService.findAllUsers();
    }

    @GetMapping("/findUserById/{userid}")
    public Users findUserById(@PathVariable("userid") Long id)
    {
        return userService.findUserById(id);
    }

    @GetMapping("/findUserByName/{username}")
    public Users findUserByName(@PathVariable("username") String username)
    {
        return userService.findUserByName(username);
    }

    @GetMapping("/findUserByEmail/{email}")
    public Users findUserByEmail(@PathVariable("email") String email)
    {
        return userService.findUserByEmail(email);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUserById(@PathVariable("id") Long id)
    {
        userService.deleteUserById(id);
    }

    @PutMapping("/updateuser/{userid}")
    public Users updateuser(@PathVariable("userid")Long id,@RequestBody Users users)
    {
        return userService.updateuser(id,users);
    }

}
