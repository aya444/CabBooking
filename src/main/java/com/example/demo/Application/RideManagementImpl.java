package com.example.demo.Application;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Presistence.RideStorageManagement;
import com.example.demo.Presistence.RideStoreByArray;

public class RideManagementImpl  implements RideManagement , Subject2 {
    private RideStorageManagement persistence = new RideStoreByArray();
    private DistanceStrategy strategy;
    double distance;
    double time;
    int counter=1;
    int count=1;

    @Override
    public void setDistanceStrategy(DistanceStrategy strategy) {
        this.strategy=strategy;    
    }

    @Override
    public DistanceStrategy getDistanceStrategy() {
        if(counter<=2){
            counter++;
            setDistanceStrategy(new GoogleAPI());
        }   
        else{
            setDistanceStrategy(new Harvisine());
        }
        return strategy;
    }

    @Override
    public  boolean add(Ride ride, Subject favServ, UserManagerImpl userManager) {
        count++;
        Boolean flag= persistence.add(ride);
        favServ.notify(ride, userManager);
        strategy=getDistanceStrategy();
        distance=strategy.calculateDistance(ride.getSrcLocation(), ride.getDestLocation());
        time=strategy.calculateETA(ride.getSrcLocation(), ride.getDestLocation());
        System.out.println("Ride "+(count-1)+": Distance= "+distance +" , Time= "+ time);
        return flag;
    }

    @Override
    public Ride get(int index) {
        persistence.get(index);
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return persistence.getAll();
    }

    @Override
    public boolean delete(int index) {
        persistence.delete(index);
        return false;
    }
    @Override
    public void addoffer (Ride ride,double offer){
        ride.addNewOffer(offer);
    }
    
    @Override
    public void endRide(Driver driver ,int index) {
        Ride ride = persistence.get(index);
        ride.setStatus(false);
        driver.balance+=ride.getprice();
        persistence.addtohistory(index);
        persistence.delete(index);
    }

    @Override
    public List<Ride> getAllHistory() {
        return persistence.getAllHistory();
    }
}