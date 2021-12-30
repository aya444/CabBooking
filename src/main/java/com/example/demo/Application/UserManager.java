package com.example.demo.Application;

import java.util.List;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin; 
import com.example.demo.Core.User;
import com.example.demo.Presistence.UserPresistence;

public interface UserManager {
	Admin adminUser = null;
    Client clientUser = null;
	Driver driverUser = null;
    public void setUserPresistence(UserPresistence presistence);
	public UserPresistence getpresistence();
    boolean add(User user);
    User get(int index);
    List<User> getAll();
    boolean delete(int index);

}