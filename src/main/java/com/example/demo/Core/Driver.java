package com.example.demo.Core;

import java.util.ArrayList;

public class Driver extends User{

	ArrayList<String> FavAreas= new ArrayList<String>();
    public Driver(){
    }

    public Driver(String type, String name, String address,String pass, int mobile,int ID,int license){
    	this.setType(type);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        this.setId(ID);
        this.setLicense(license);
        System.out.println("Driver has been created");
    }
    
    public Driver(String type, String status, String name, String address,String pass, int mobile,int ID,int license){
    	this.setType(type);
        this.setStatus(status);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        this.setId(ID);
        this.setLicense(license);
        System.out.println("Driver has been created");
    }
	
    public void addToFav(String FavArea) 
    {
        FavAreas.add(FavArea);
    }

    /*public void SetOffer(int i, double offer){
        Ride r=RideArea.get(i);
        r.setPrice(offer);
        RideArea.set(i,r);
    }*/
    
    public ArrayList<String> getFavAreas(){
        return FavAreas;
    }
	
    public String toString(){
      return "Driver { type='" + getType() + "', status='" + getStatus() + "', name='" + getName()
       + "', address='" + getAddress() +"', pass='"
      + getPass()+ "', mobile=" + getMobile()
      + "', ID='" + getId()+ "', license='" + getLicense()+ "}\n";
    }
}

