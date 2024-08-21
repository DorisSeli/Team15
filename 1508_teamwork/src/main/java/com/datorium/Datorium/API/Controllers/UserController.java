package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.UpdateUserDTO;
import com.datorium.Datorium.API.DTOs.User; //import com.datorium.Datorium.API.DTOs.* we could also import like this, without specific thing
import com.datorium.Datorium.API.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(){
        //This code runs first, when creating UserController Object
        userService = new UserService();
    }

    //CRUD
    //AddUser
    //UpdateUser
    //GetUser
    //DeleteUser

    //@GetMapping
    @PostMapping("/add") //localhost:8080/user/add
    public int add(@RequestBody User user){ //we from UserController requesting data for UserService and then return the result
        return userService.add(user);
    }

    @GetMapping("/get")
    public ArrayList<User> get(){
        return userService.get();
    }

    @PostMapping("/update")
    public User update(@RequestBody UpdateUserDTO updateUserDTO){
        return userService.update(updateUserDTO.userIndex, updateUserDTO.user);
    }
}