package com.cab.booking.model;

import java.util.ArrayList;

public class Driver extends User{

	ArrayList<String> FavAreas= new ArrayList<String>();
    ArrayList<Ride> AvailableRides= new ArrayList<Ride>();
    ArrayList<String> Notifications= new ArrayList<String>();
    public double balance;


    public Driver(){
    	
    }

    public Driver(String type, String name, String address,String pass, int mobile,int nationalId,int license){
    	this.setType(type);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        this.setNationalId(nationalId);
        this.setLicense(license);
        System.out.println("Driver has been created");
    }
    
    public Driver(String type, String status, String name, String address,String pass, int mobile,int nationalId,int license){
    	this.setType(type);
        this.setStatus(status);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        this.setNationalId(nationalId);
        this.setLicense(license);
        System.out.println("Driver has been created");
    }
	
    public void addToFav(String FavArea) 
    {
        FavAreas.add(FavArea);
    }
    
    public void setBalance(double balance) 
    {
       this.balance=balance;
    }
    public double getBalance() 
    {
       return balance;
    }
    
    public ArrayList<String> getFavAreas(){
        return FavAreas;
    }
	
    public String toString(){
      return "Driver { type='" + getType() + "', status='" + getStatus() + "', name='" + getName()
       + "', address='" + getAddress() +"', pass='"
      + getPass()+ "', mobile=" + getMobile()
      + "', ID='" + getNationalId()+ "', license='" + getLicense()+ "}\n";
    }

    public void addAvailable(Ride ride) 
    {
        AvailableRides.add(ride);
    }

    public ArrayList<Ride> getAvailableRides()
    {
        return AvailableRides;
    }

    public void addNotification(String message)
    {
        Notifications.add(message);
    }

    public void showNotifications()
    {
        for(int i=0; i< Notifications.size(); i++)
            System.out.println( (i+1)+"- "+Notifications.get(i)+"\n");
        
    }

    public void showAvailableRides()
    {
        System.out.println("Available rides: "+AvailableRides);
    }

}

