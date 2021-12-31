package com.cab.booking.model;

public class Client extends User{

    public Client(){
    	
    }
    
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
    
    public String toString(){
        return "Client { type='" + getType() + "', status='" + getStatus() + "', name='" + getName()
        + "', address='" + getAddress() +"', pass='"
        + getPass()+ "', mobile=" + getMobile() + "}\n";
      }

}
