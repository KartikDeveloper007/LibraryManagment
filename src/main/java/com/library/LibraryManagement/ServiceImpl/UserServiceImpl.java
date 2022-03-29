package com.library.LibraryManagement.ServiceImpl;

import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Repository.UserRepo;
import com.library.LibraryManagement.ServiceTest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public Users saveUser(Users users) {
        return userRepo.save(users);
    }

    @Override
    public List<Users> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Users findUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public Users findUserByName(String username) {
        return userRepo.findByUserName(username);
    }

    @Override
    public Users findUserByEmail(String email) {
        return userRepo.findByUserEmail(email);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Users updateuser(Long id, Users users) {
        Users updatedUser= userRepo.findById(id).get();
      if(!(updatedUser.getUserEmail().equalsIgnoreCase(users.getUserEmail())))
        {
            updatedUser.setUserEmail(users.getUserEmail());
        }
         if (!(updatedUser.getUserName().equals(users.getUserName())))
      {
          updatedUser.setUserName(users.getUserName());
      }
        return userRepo.save(updatedUser);
    }


}
