package com.cab.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cab.booking.model.User;
import com.cab.booking.service.UserPresistenceManager;

public class ArrayUserPresistenceImpl implements UserPresistenceManager {
    private static ArrayList<User> allkindofUsers = new ArrayList<>();

    @Override
    public int getSize(){
        return allkindofUsers.size();
    };

    @Override
    public boolean add(User user) {
        return allkindofUsers.add(user);
    }
    
    @Override
    public User get(int index) {
    	for(int i = 0; i < allkindofUsers.size(); i++){
            if (i == index) {
                return (User) allkindofUsers.get(index);
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return allkindofUsers;
    }

    @Override
    public boolean delete(int index) {
        for (User user : allkindofUsers) {
            if (user.getIndex()==index) {
                return allkindofUsers.remove(user);
            }
        }
        return false;
    }
}
