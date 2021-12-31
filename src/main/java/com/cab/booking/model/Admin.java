package com.cab.booking.model;

public class Admin extends User{

    public Admin(String type, String name, String pass){
    	this.setType(type);
		this.setName(name);
		this.setPass(pass);
        System.out.println("Admin has been created");
    }
    
    public Admin(String type, String status, String name, String pass){
    	this.setType(type);
		this.setStatus(status);
		this.setName(name);
		this.setPass(pass);
        System.out.println("Admin has been created");
    }

    public String toString(){
        return "Admin { type='" + getType() + "', status='" + getStatus() + "', name='" + getName() + "' ,pass='" + getPass() + "}\n";
      }
}
