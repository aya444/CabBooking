package com.example.demo.Application;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public class RideManagementImpl{
    Ride ride;

    public void Start(){

    }

    public Boolean isFavourite(Ride r,Driver d) {
        for (int i=0;i< d.getFavAreas().size();i++) {
            if (r.getSrcLocation() == d.getFavAreas().get(i))
                return true;
        }
        return false;
    }


    public void NotifyDriver(){

        System.out.println("new ride!");

    }
    public void addToRideArea (Ride r,Driver d){
        d.getRideArea().add(r);
        //System.out.println(r.getSrcLocation());
    }
    public void NotifyClient(){
        System.out.println("new ride!");
    }
    public void addToAvailableRides (Ride r,Client c){
        c.getAvailableRides().add(r);
        //System.out.println(r.getSrcLocation());
    }

}