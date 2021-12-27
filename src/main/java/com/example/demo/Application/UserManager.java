package com.example.demo.Application;

import java.util.ArrayList;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin;

public interface UserManager {
	ArrayList<Admin> adminArr = new ArrayList<Admin>();
	ArrayList<Client> clientsArr = new ArrayList<Client>();
	ArrayList<Driver> approvedDriversArr = new ArrayList<Driver>();
	ArrayList<Driver> pendingDriverArr = new ArrayList<Driver>();
	public static final Admin adminUser = null;
    public static final Client clientUser = null;
	public static final Driver driverUser = null;
	public Admin loginAdmin(String name,String pass);
    public Client loginClient(int mobile,String pass);
    public Driver loginDriver(int mobile,String pass);
    public void registerAdmin(Admin adminUser);
    public void registerClient(Client clientUser);
    public void registerDriver(Driver driverUser);
    public void listDriversByAdmin();
    public Boolean verifyDriverByAdmin(Driver driverProfile);
}