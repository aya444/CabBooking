package com.cab.booking.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.model.User;
import com.cab.booking.service.FavAreaObserverManager;
import com.cab.booking.service.UserManager;
import com.cab.booking.service.UserPresistenceManager;

public class UserManagerImpl implements UserManager, FavAreaObserverManager
{

    private UserPresistenceManager presistence;

    @Override
    public void update(ArrayList<Driver> subs, Ride r)
    {
      for(int i=0; i< subs.size(); i++)
         subs.get(i).addAvailable(r);
    }

    @Override
    public void setUserPresistence(UserPresistenceManager presistence) {
        this.presistence=presistence;   
    }

    @Override
    public UserPresistenceManager getpresistence() {
        return presistence;
    }

    @Override
    public boolean add(User user) {
        user.setindex(presistence.getSize());
        return presistence.add(user);
    }

    @Override
    public User get(int index) {
        return presistence.get(index);
    }

    @Override
    public List<User> getAll() {
        return presistence.getAll();
    }

    @Override
    public boolean delete(int index) {
        return presistence.delete(index);
    }

	public Admin loginAdmin(String type, String name,String pass){
        for(int i=0; i < presistence.getSize(); i++){
            if(type.equals("admin") && 
            		name.equals(presistence.get(i).getName()) && 
            		pass.equals(presistence.get(i).getPass())){
                System.out.println("Admin Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
                return (Admin) presistence.get(i);
            }
        }
        return null;
    }

    public Driver loginDriver(String type, int mobile,String pass){
        for(int i=0; i < presistence.getSize(); i++){
            if(type.equals("driver") && 
            		mobile == presistence.get(i).getMobile() && 
            		pass.equals(presistence.get(i).getPass())){
                System.out.println("Driver Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
                return (Driver) presistence.get(i);
            }
        }
        return null;
    }

    public Client loginClient(String type, int mobile,String pass){
        System.out.println(presistence.getAll());
        for(int i=0; i < presistence.getSize(); i++){
            if(type.equals("client") &&
            		mobile == presistence.get(i).getMobile() && 
            		pass.equals(presistence.get(i).getPass())){
                System.out.println("Client Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
                return (Client) presistence.get(i);
            }
        }
        return null;
    }

    public void registerAdmin(Admin adminUser){
    	adminUser.setStatus("approved");
        presistence.add(adminUser);
       System.out.println("Admin has been added & registered!");
    }

    public void registerDriver(Driver driverUser){
    	driverUser.setStatus("pending");
    	presistence.add(driverUser);
        System.out.println("Driver has been added & registered!");
    }

    public void registerClient(Client clientUser){
    	clientUser.setStatus("approved");
        presistence.add(clientUser);
        System.out.println("Client has been added & registered!");
    }

    public void listDriversByAdmin(){
    	for(int i=0; i < presistence.getSize(); i++){
    		System.out.println(presistence.get(i));
    	}
    }
    
    public Driver selectDriverByAdmin(String name){
    	for(int i=0; i < presistence.getSize(); i++){
    		if(presistence.get(i).getName().equals(name)) {
    			return (Driver) presistence.get(i);
    		}
    	}
		return null;
    }

    public Boolean verifyDriverByAdmin(Driver driverProfile){
    	for(int i=0;i<presistence.getSize();i++){
    		if(presistence.get(i).getMobile() == driverProfile.getMobile()) {
	    		driverProfile.setStatus("approved");
	    		System.out.println("Admin has approved (" + driverProfile.getName() + ") ... !");
	    		return true;
    		}
    		
    	}
    	return false;
    }


}
