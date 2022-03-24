package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Repository.UserRepo;
import com.library.LibraryManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public Users saveUser(Users users) {
        return userRepo.save(users);
    }
}
