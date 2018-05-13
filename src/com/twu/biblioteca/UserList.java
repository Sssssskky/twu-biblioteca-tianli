package com.twu.biblioteca;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> List;
    private User currentUser;

    public UserList(ArrayList<User> List) {
        this.List = List;
    }

    public boolean verify(String name, String password){
        for (User user: List
             ) {
            if(user.GetName().equals(name) && user.verify(password)){
                 this.currentUser = user;
                 return true;
            }
        }
        return false;
    }

    public String UserInfo(){
        return currentUser.toString();
    }
}
