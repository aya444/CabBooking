package com.example.demo.Application;
//hello
import java.util.List;

import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Presistence.RideStorageManagement;
import com.example.demo.Presistence.RideStoreByArray;

public class RideManagementImpl  implements RideManagement {
    private RideStorageManagement persistence = new RideStoreByArray();
    @Override
    public  boolean add(String source, String destination) {
       //Ride ride;
       //ride.setId(persistence.getNextId());
       return persistence.add(source,destination);
    }

    @Override
    public Ride get(int id) {
        persistence.get(id);
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return persistence.getAll();
    }

    @Override
    public boolean delete(int id) {
        persistence.delete(id);
        return false;
    }


}
    //Ride ride;
    //public void Start(){}

    /*public Boolean isFavourite(Ride r,Driver d) {
        for (int i=0;i< d.getFavAreas().size();i++) {
            if (r.getSrcLocation() == d.getFavAreas().get(i))
                return true;
        }
        return false;
    }
    */


   /* public void NotifyDriver(){

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

    */