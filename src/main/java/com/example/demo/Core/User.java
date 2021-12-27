package com.example.demo.Core;

public abstract class User{
	private String name, address, pass;
	private int mobile;
	//private String email;
    

    public User(){
        this.name="";
        this.address="";
        this.pass="";
        this.mobile=0;
    }
    public User(String name, String pass){
        this.name=name;
        this.pass=pass;
        System.out.println("User(,) has been created!");
    }

    public User(String name, String address,String pass, int mobile){
        this.name=name;
        this.address=address;
        this.pass=pass;
        this.mobile=mobile;
        System.out.println("User(,,,,) has been created!");
    }

    public String getName(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getpass(){
        return pass;
    }
    public int getmobile(){
        return mobile;
    }

}

