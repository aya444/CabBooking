package com.example.demo.Application;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin;

import com.example.demo.Application.UserManager;

public class UserManagerImpl implements UserManager{

	@SuppressWarnings("unused")
	public Admin loginAdmin(String name,String pass){
        for(int i=0; i < adminArr.size(); i++){
            if(name == adminArr.get(i).getName() && pass == adminArr.get(i).getPass()){
                System.out.println("Driver Logged in Successfully!");
            	System.out.println(clientsArr.get(i).toString());
                return adminArr.get(i);
            } else {
            	System.out.println("Driver Login information is incorrect or not registered!");
            }
        	return adminArr.get(i);
        }
        return adminUser;
    }
    
    @SuppressWarnings("unused")
    public Driver loginDriver(int mobile,String pass){
        for(int i=0; i < approvedDriversArr.size(); i++){
            if(mobile == approvedDriversArr.get(i).getMobile() && pass == approvedDriversArr.get(i).getPass()){
                System.out.println("Driver Logged in Successfully!");
            	System.out.println(approvedDriversArr.get(i).toString());
                return approvedDriversArr.get(i);
            } else {
            	System.out.println("Driver Login information is incorrect or not registered!");
            }
        	return approvedDriversArr.get(i);
        }
        return driverUser;
    }
    
    @SuppressWarnings("unused")
    public Client loginClient(int mobile,String pass){
        for(int i=0; i < clientsArr.size(); i++){
            if(mobile == clientsArr.get(i).getMobile() && pass == clientsArr.get(i).getPass()){
                System.out.println("Client Logged in Successfully!");
            	System.out.println(clientsArr.get(i).toString());
                return clientsArr.get(i);
            } else {
            	System.out.println("Client Login information is incorrect or not registered!");
            }
        	return clientsArr.get(i);
        }
        return clientUser;
    }

    public void registerAdmin(Admin adminUser){
        adminArr.add(adminUser);
//        System.out.println("Admin has been added & registered!");
    }
    
    public void registerDriver(Driver driverUser){
    	pendingDriverArr.add(driverUser);
        //driversArr.add(driverUser);
        System.out.println("Driver has been added & registered!");
    }

    public void registerClient(Client clientUser){
        clientsArr.add(clientUser);
        System.out.println("Client has been added & registered!");
    }
    
    public void listDriversByAdmin(){
    	for(int i=0; i < pendingDriverArr.size(); i++){
    		System.out.println(pendingDriverArr.get(i));
    	}
    }
    
    public Boolean verifyDriverByAdmin(Driver driverProfile){
    	for(int i=0;i<pendingDriverArr.size();i++){
    		System.out.println("Admin has approved (" + pendingDriverArr.get(i).getName() + ") ... !");
    		approvedDriversArr.add(pendingDriverArr.get(i));
    		pendingDriverArr.remove(i);
    	}
    	return false;
    }
}
