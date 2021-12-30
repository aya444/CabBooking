package com.example.demo.Core;

public abstract class User {
	private String type, name, address, pass, status;
	private int mobile, id, license,index;
    
    public User(){
        this.type="";
    	this.name="";
        this.status="";
        this.address="";
        this.pass="";
        this.mobile=0;
    }
    public User(String type, String name, String pass){
        this.type=type;
        this.name=name;
        this.pass=pass;
        System.out.println("User(" + type + "," + name + "," + pass + ") has been created!");
    }
    
    public User(String type, String name, String status, String pass){
        this.type=type;
        this.name=name;
        this.status=status;
        this.pass=pass;
        System.out.println("User(" + type + "," + name + "," + pass + ") has been created!");
    }

    public User(String type, String name, String address,String pass, int mobile){
        this.type=type;
        this.name=name;
        this.address=address;
        this.pass=pass;
        this.mobile=mobile;
        System.out.println("User(,,,,) has been created!");
    }
    
    public User(String type, String name, String status, String address,String pass, int mobile){
        this.type=type;
        this.name=name;
        this.status=status;
        this.address=address;
        this.pass=pass;
        this.mobile=mobile;
        System.out.println("User(,,,,) has been created!");
    }

    public User(String type, String name, String address,String pass, int mobile, int id, int license){
        this.type=type;
        this.name=name;
        this.address=address;
        this.pass=pass;
        this.mobile=mobile;
        this.id=id;
        this.license=license;
        System.out.println("User(,,,,) has been created!");
    }
    
    public User(String type, String name, String status, String address,String pass, int mobile, int id, int license){
        this.type=type;
        this.name=name;
        this.status=status;
        this.address=address;
        this.pass=pass;
        this.mobile=mobile;
        this.id=id;
        this.license=license;
        System.out.println("User(,,,,) has been created!");
    }

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
    public void setindex(int index){
        this.index=index;
    }

    public int getIndex(){
        return index;
    }

    public String getName(){
        return name;
    }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    public String getAddress(){
        return address;
    }
    public String getPass(){
        return pass;
    }
    public int getMobile(){
        return mobile;
    }
	public int getId() {
		return id;
	}

	public int getLicense() {
		return license;
	}

    public void setName(String name) {
		this.name = name;
	}

    public void setAddress(String address) {
		this.address = address;
	}

    public void setPass(String pass) {
		this.pass = pass;
	}

    public void setMobile(int mobile) {
		this.mobile = mobile;
	}

    public void setId(int id) {
		this.id = id;
	}

    public void setLicense(int license) {
		this.license = license;
	}

    public void setNotification(String message) {
        System.out.println(message);
    }
}