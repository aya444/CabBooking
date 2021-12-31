package com.cab.booking.services.impl;

import java.util.List;

import com.cab.booking.model.User;
import com.cab.booking.services.UserPresistenceManager;

import java.util.Collections;

public class DBUserPresistenceImpl implements UserPresistenceManager {

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
