package com.example.demo.Presistence;

import java.util.List;

import com.example.demo.Core.User;
import java.util.Collections;

public class DatabaseUserPresistence implements UserPresistence {

    //Create Database

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public User get(int index) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return Collections.emptyList();
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

}
