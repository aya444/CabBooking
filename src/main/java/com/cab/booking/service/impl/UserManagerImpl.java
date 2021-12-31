package com.cab.booking.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	@Autowired
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
    	setUserPresistence(new ArrayUserPresistenceImpl());
        user.setRideIndex(getpresistence().getSize());
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

	public User login(User user){
        for(int i=0; i < presistence.getSize(); i++){
            if(user.getType().equals("admin") && 
            		user.getName().equals(presistence.get(i).getName()) && 
            		user.getPass().equals(presistence.get(i).getPass())){
                System.out.println("Admin Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
            	presistence.get(i).setStatus("Last Login on [" + timeFormatted() + "]");
                return presistence.get(i);
            }else if(user.getType().equals("driver") && 
            		user.getMobile() == presistence.get(i).getMobile() && 
            		user.getPass().equals(presistence.get(i).getPass())){
                System.out.println("Driver Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
            	presistence.get(i).setStatus("Last Login on [" + timeFormatted() + "]");
                return presistence.get(i);
            }else if(user.getType().equals("client") &&
            		user.getMobile() == presistence.get(i).getMobile() && 
            		user.getPass().equals(presistence.get(i).getPass())){
                System.out.println("Client Logged in Successfully!");
            	System.out.println(presistence.get(i).toString());
            	presistence.get(i).setStatus("Last Login on [" + timeFormatted() + "]");
                return presistence.get(i);
            }
        }
        return null;
    }

    public boolean register(User user){
    	boolean flag = false;
    	if(user.getType().equals("admin")){
    		user.setStatus("approved");
    		System.out.println("Admin has been added & registered!");
    		System.out.println(presistence.add(user));
    		flag = presistence.add(user);
        }else if(user.getType().equals("driver")){
        	user.setStatus("pending");
        	System.out.println("Driver has been added & registered!");
        	flag = presistence.add(user);
        }else if(user.getType().equals("client")) {
        	user.setStatus("approved");
            System.out.println("Client has been added & registered!");
            flag = presistence.add(user);
        }
		return flag;
    }

    public void listDriversByAdmin(){
    	for(int i=0; i < presistence.getSize(); i++){
    		System.out.println(presistence.get(i));
    	}
    }
    
    public User selectDriverByAdmin(User user){
    	for(int i=0; i < presistence.getSize(); i++){
    		if(presistence.get(i).getName().equals(user.getName())) {
    			return (Driver) presistence.get(i);
    		}
    	}
		return null;
    }

    public boolean verifyDriverByAdmin(User user){
    	for(int i=0;i<presistence.getSize();i++){
    		if(presistence.get(i).getMobile() == user.getMobile()) {
	    		user.setStatus("approved");
	    		System.out.println("Admin has approved (" + user.getName() + ") ... !");
	    		return true;
    		}
    		
    	}
    	return false;
    }
    
    public String timeFormatted() {
    	return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
    }
}
