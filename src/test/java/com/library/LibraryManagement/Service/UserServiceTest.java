package com.library.LibraryManagement.Service;

import com.library.LibraryManagement.Model.Role;
import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Model.UsersDetails;
import com.library.LibraryManagement.Repository.UserRepo;
import com.library.LibraryManagement.ServiceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private UserRepo userRepo;

    @Test
    public  void SaveUser()
    {
        Role roles=new Role(1L,"Librarian");
        Set<Role> roles1=new HashSet<>();
        roles1.add(roles);
        UsersDetails usersDetails=new UsersDetails(1L,"akul","saklecha",9171247781L,"male",null);
        Users users=new Users(1L,"akul","akul123456","akul@123456",null,true,roles1,usersDetails);

        Mockito.when( userRepo.save(users)).thenReturn(users);

        Users returned =this.userService.saveUser(users);

        assertEquals(returned,users);
    }
    @Test
    public void deleteUser()
    {
        Role roles=new Role(1L,"Librarian");
        Set<Role> roles1=new HashSet<>();
        roles1.add(roles);
        UsersDetails usersDetails=new UsersDetails(1L,"akul","saklecha",9171247781L,"male",null);
        Users users=new Users(1L,"akul","akul123456","akul@123456",null,true,roles1,usersDetails);

        doNothing().when(userRepo).deleteById(1L);
        this.userService.deleteUserById(1L);
    }

    @Test
    public void updateuser()
    {
        Role roles=new Role(1L,"Librarian");
        Set<Role> roles1=new HashSet<>();
        roles1.add(roles);
        UsersDetails usersDetails=new UsersDetails(1L,"akul","saklecha",9171247781L,"male",null);
        Users users=new Users(1L,"akul","akul123456","akul@123456",null,true,roles1,usersDetails);

        Mockito.when(userRepo.findById(users.getUserId())).thenReturn(Optional.of(users));
        Mockito.when(userRepo.save(users)).thenReturn(users);
        Users usersReturned=this.userService.updateuser(users.getUserId(),users);

        assertEquals(users,usersReturned);
    }
}
