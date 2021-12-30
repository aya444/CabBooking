package com.example.demo.Application;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Presistence.RideStorageManagement;
import com.example.demo.Presistence.RideStoreByArray;

public class RideManagementImpl  implements RideManagement , Subject2 {
    private RideStorageManagement persistence = new RideStoreByArray();
    // TODO Creates a new Fav which re-writes old
    Subject FavServ= new FavAreaService();
    @Override
    public  boolean add(Ride ride) 
    {
      Boolean flag= persistence.add(ride);
       FavServ.notify(ride);
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
    public void addoffer(double offer,int index) {
        //Ride ride=persistence.get(index);
        //ride.offers.add(offer);
        persistence.addtoffer(offer,index);
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