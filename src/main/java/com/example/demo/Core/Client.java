package com.example.demo.Core;

import java.util.ArrayList;

import com.example.demo.Application.Observer2;

public class Client extends User {

	Ride ride;
    private ArrayList<Ride> AvailableRides = new ArrayList<Ride>();

    public Client(String type, String name, String address,String pass, int mobile){
        this.setType(type);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        System.out.println("Client has been created");
    }
    
    public Client(String type, String status, String name, String address,String pass, int mobile){
        this.setType(type);
        this.setStatus(status);
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        System.out.println("Client has been created");
    }
	
    public void requestRide(String source, String destination)
    {
     	ride=new Ride(source,destination);
    }

    public String toString(){
        return "Client { type='" + getType() + "', status='" + getStatus() + "', name='" + getName()
        + "', address='" + getAddress() +"', pass='"
        + getPass()+ "', mobile=" + getMobile() + "}\n";
      }

	public ArrayList<Ride> getAvailableRides() {
		return AvailableRides;
	}

	public void setAvailableRides(ArrayList<Ride> availableRides) {
		AvailableRides = availableRides;
	}
}
