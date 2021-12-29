package com.example.demo.Presistence;

import java.util.List;

import com.example.demo.Core.User;

public interface UserPresistence {

    public int getSize();

    boolean add(User user);

    User get(int index);

    List<User> getAll();

    boolean delete(int index);

}
