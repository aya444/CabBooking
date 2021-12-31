package com.cab.booking.service;

import java.util.List;

import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.User;

public interface UserManager {
    public void setUserPresistence(UserPresistenceManager presistence);
	public UserPresistenceManager getpresistence();
    boolean add(User user);
    User get(int index);
    List<User> getAll();
    boolean delete(int index);
	User login(User user);
	boolean register(User user);
	void listDriversByAdmin();
	User selectDriverByAdmin(User user);
	boolean verifyDriverByAdmin(User user);
}