package com.library.LibraryManagement.ControllerTest;

import com.library.LibraryManagement.Controller.UserController;
import com.library.LibraryManagement.Model.Role;
import com.library.LibraryManagement.Model.Users;
import com.library.LibraryManagement.Model.UsersDetails;
import com.library.LibraryManagement.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
    @InjectMocks
    private UserController userController;
    @Mock
    private UserService userService;

    @Test
    public void saveUser() {
        Role roles = new Role(1L, "Librarian");
        Set<Role> roles1 = new HashSet<>();
        roles1.add(roles);
        UsersDetails usersDetails = new UsersDetails(1L, "akul", "saklecha", 9171247781L, "male", null);
        Users users = new Users(1L, "akul", "akul123456", "akul@123456", null, true, roles1, usersDetails);
        Mockito.when(userService.saveUser(users)).thenReturn(users);
        Users returned = this.userController.saveUser(users);
        assertEquals(users, returned);
    }

    @Test
    void deleteUser() {

        doNothing().when(userService).deleteUserById(1L);
        this.userController.deleteUserById(1L);

    }


    @Test
    public void updateuser() {
        Role roles = new Role(1L, "Librarian");
        Set<Role> roles1 = new HashSet<>();
        roles1.add(roles);
        UsersDetails usersDetails = new UsersDetails(1L, "akul", "saklecha", 9171247781L, "male", null);
        Users users = new Users(1L, "akul", "akul123456", "akul@123456", null, true, roles1, usersDetails);

        Mockito.when(userService.updateuser(users.getUserId(), users)).thenReturn(users);

        Users usersReturned = this.userController.updateuser(users.getUserId(), users);

        assertEquals(users, usersReturned);
    }

}
