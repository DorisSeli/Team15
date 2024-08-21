package com.datorium.Datorium.API.Repo;

import com.datorium.Datorium.API.DTOs.User;

import java.util.ArrayList;

public class UserRepo {

    private ArrayList<User> users = new ArrayList<>();

    public int add(User user){
        users.add(user);//changed the name from addUser to add, naming conventions and preferences to keep everything small and simple
        return users.size();
    }

    public ArrayList<User> get() {
        return users;
    }

    public User update(int userIndex, User updateUserDTO){/*this User user is the true meaning of the DTO,
    this user in general its never gonna exist in the database,
    but what we can do is we can use the data from this user to update the existing users from database.
    So usually in the database we would not be using DTOs, we would use the entities and updating these entities with DTOs,
    but for now both of them gonna be the same object but we are updating them from another user */
        var user = users.get(userIndex);
        user.name = updateUserDTO.name; /*updateUserDTO - this is a user we get from the frontend,
        we are not adding it to the user list, it is just an object to get the data*/
        return user;
    }

}
