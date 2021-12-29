package com.example.demo.Application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin; 

import com.example.demo.Core.User;

public interface UserManager {
	ArrayList<Admin> adminArr = new ArrayList<Admin>();
	ArrayList<Client> clientsArr = new ArrayList<Client>();
	ArrayList<Driver> approvedDriversArr = new ArrayList<Driver>();
	ArrayList<Driver> pendingDriverArr = new ArrayList<Driver>();
	Admin adminUser = null;
    Client clientUser = null;
	Driver driverUser = null;
	User loginAdmin(String type, String name,String pass);
    User loginClient(String type, int mobile,String pass);
    User loginDriver(String type, int mobile,String pass);
    void registerAdmin(Admin adminUser);
    void registerClient(Client clientUser);
    void registerDriver(Driver driverUser);
    void listDriversByAdmin();
    Driver selectDriverByAdmin(String name);
    Boolean verifyDriverByAdmin(Driver driverProfile);


    boolean add(User user);////////

    User get(int index);//////

    List<User> getAll();////////

    boolean delete(int index);//////

}