package com.example.demo.Core;

import java.util.ArrayList;

public class Client{

	private String name;
	private String address;
	private String pass;
	private int mobile;
    Ride ride;
    private ArrayList<Ride> AvailableRides = new ArrayList<Ride>();

    public Client(String name, String address,String pass, int mobile){
        this.setName(name);
        this.setAddress(address);
        this.setPass(pass);
        this.setMobile(mobile);
        System.out.println("Client has been created");
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
    public void requestRide(String source, String destination)
    {
     	ride=new Ride(source,destination);
    }

//    public boolean addClient(Client c){
//        this.client.add(c);
//        System.out.println("Client has been added Successfully!");
//        return true;
//    }
//    public ArrayList<Ride> getAvailableRides(){
//        return AvailableRides;
//    }
//    public Ride ChooseRide(){
//        return ride;
//    }

    public String toString(){
        return "Client {" + "name='" + getName()
        + ", address=" + getAddress() +", pass='"
        + getPass()+ ", mobile=" + getMobile() + "}";
      }

	public ArrayList<Ride> getAvailableRides() {
		return AvailableRides;
	}

	public void setAvailableRides(ArrayList<Ride> availableRides) {
		AvailableRides = availableRides;
	}
}
