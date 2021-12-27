package com.example.demo.Core;

import java.util.ArrayList;

public class Driver{

	private String name;
	private String address;
	private String pass;
	private int mobile;
    private int ID;
    private int license;
    ArrayList<String> FavAreas= new ArrayList<String>();
    ArrayList<Ride> RideArea = new ArrayList<Ride>();
    @SuppressWarnings("unused")
	private double balance;

    public Driver(){
    }

    public Driver(String name, String address,String pass, int mobile,int ID,int license){
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        this.ID=ID;
        this.license=license;
        System.out.println("Driver has been created");
    }

//    public boolean addDriver(Driver d){
//        this.drivers.add(d);
//        System.out.println("Driver has been added Successfully!");
//        return true;
//    }
    
//    public Driver findDriver(Driver d){
//    	for (int index = 0; index < getDrivers().size(); index++) {
//    		  if (drivers[index].contains("A")) {
//    		    System.out.println("Found an element on array that contains 'A': " + ar[index]);
//    		  }
//    	}
//        System.out.println("Driver has been added Successfully!");
//        return d;
//    }

//    public ArrayList<Driver> getDrivers() {
//		return drivers;
//	}
//
//	public void setDrivers(ArrayList<Driver> drivers) {
//		this.drivers = drivers;
//	}
	
    public void addToFav(String FavArea) 
    {
        FavAreas.add(FavArea);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRideArea(ArrayList<Ride> rideArea) {
        RideArea = rideArea;
    }

    public int getId()
    {
        return ID;
    }

    public int getLicense() {
        return license;
    }

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public void SetOffer(int i, double offer){
        Ride r=RideArea.get(i);
        r.setPrice(offer);
        RideArea.set(i,r);
    }
    
    public ArrayList<String> getFavAreas(){
        return FavAreas;
    }
    
    public ArrayList<Ride> getRideArea(){
        return RideArea;
    }
	
    public String toString(){
      return "Driver {" + "name='" + getName()
      + ", address=" + getAddress() +", pass='"
      + getPass()+ ", mobile=" + getMobile()
      + ", ID='" + getId()+ ", license='" + getLicense()+ "}";
    }
}

