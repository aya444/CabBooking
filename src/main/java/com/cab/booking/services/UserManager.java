package com.cab.booking.services;

import java.util.List;

import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.User;

public interface UserManager {
	Admin adminUser = null;
    Client clientUser = null;
	Driver driverUser = null;
    public void setUserPresistence(UserPresistenceManager presistence);
	public UserPresistenceManager getpresistence();
    boolean add(User user);
    User get(int index);
    List<User> getAll();
    boolean delete(int index);

}