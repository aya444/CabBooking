package com.example.demo.Core;

import com.example.demo.Presistence.StorageManagement;


public class Admin{

	String name;
	String pass;
	StorageManagement storagemanagement;
    //Driver d;
    //ArrayList<Driver> VerifiedDrivers = new ArrayList<Driver>();
    //Admin[] admins;


    public Admin(String name,String pass){
        this.name=name;
    	this.pass=pass;
//        System.out.println("Admin has been created");
    }

    public Admin() {

    }

//    public void listDrivers(){
//        for(Driver drivers : d.drivers)
//            System.out.println(drivers);
//    }
//
//    public Boolean VerifyDriver(Driver d){  //Problem
//        for(int i=0;i<d.drivers.size();i++){
//            VerifiedDrivers.add(d.drivers.get(i));
//        }
//        return false;
//    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setStrategy(StorageManagement savingmethod) {
		this.storagemanagement=savingmethod;
	}
	
	public StorageManagement getStrategy() {
		return storagemanagement;	
	}

//    public String toString() {
//        return "Driver{" + "name='" + d.getName()
//                + ", address=" + d.getaddress() +", pass='"
//                +d.getpass()+ ", mobile=" + d.getmobile()
//                + ", ID='" +d.getID()+ ", license='" + d.getlicense()+ "}";
//    }

    public String toString(){
        return "Admin {" + "name='" + getName() + ", pass='" + getPass() + "}";
      }
}
