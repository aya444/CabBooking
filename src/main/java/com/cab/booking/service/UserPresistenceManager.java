package com.cab.booking.service;

import java.util.List;

import com.cab.booking.model.User;

public interface UserPresistenceManager {

    public int getSize();

    boolean add(User user);

    User get(int index);

    List<User> getAll();

    boolean delete(int index);

}
