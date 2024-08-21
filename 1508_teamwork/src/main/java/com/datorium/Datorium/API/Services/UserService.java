package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Repo.UserRepo;

import java.util.ArrayList;

public class UserService {
    private UserRepo userRepo;

    public UserService() {
        userRepo = new UserRepo(); //creates a new object whenever a UserService is added
    }
    public int add(User user){
        return userRepo.add(user);
    }

    public ArrayList<User> get(){
        return userRepo.get();
    }

    public User update(int userIndex, User updateUserDTO){ /* the userIndex is the index nr of the user in the arraylist,
    updateUserDTO is the updated information of the already existing user
     the user that is in the database does not contain the information yet
     but we are using it as a kind of carrier to provide data to database */
        return userRepo.update(userIndex, updateUserDTO);

    }
}