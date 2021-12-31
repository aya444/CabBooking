package com.cab.booking.service.impl;
import java.util.List;

import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.model.User;
import com.cab.booking.service.DistanceStrategyManager;
import com.cab.booking.service.FavAreaSubjectManager;
import com.cab.booking.service.RideManager;
import com.cab.booking.service.RidePresistenceManager;
import com.cab.booking.service.RideSubjectManager;

public class RideManagerImpl  implements RideManager , RideSubjectManager 
{
    private RidePresistenceManager persistence = new ArrayRidePresistenceImpl();
    private DistanceStrategyManager strategy;
    double distance;
    double time;
    int counter=1;
    int count=1;

    // TODO clean comments
    @Override
    public void subscribe(User c, Ride r)
    {
     r.setClient(c);
    //  r=new Ride(r.getSrcLocation(),r.getDestLocation(),c);
    
    }

    @Override
    public void setDistanceStrategy(DistanceStrategyManager strategy) 
    {
        this.strategy=strategy;    
    }

    @Override
    public DistanceStrategyManager getDistanceStrategy() {
        if(counter<=2){
            counter++;
            setDistanceStrategy(new GoogleAPIStrategyImpl());
        }   
        else{
            setDistanceStrategy(new HarvisineStrategyImpl());
        }
        return strategy;
    }

    //  @Override
    //  public void createRide(String source, String dest, Client client) 
    //  {
    //       Ride r2 = new Ride (source, dest,client);
    //       add(ride, user, subject favServ, userManagerImpl userManager)
    //  }

    @Override
    public  boolean add(Ride ride,User c ,FavAreaSubjectManager favServ, UserManagerImpl userManager) 
    {
        count++;
        Boolean flag= persistence.add(ride);
        subscribe(c, ride);
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
        notifyClient(ride);

    }
    
    @Override
    public void endRide(Driver driver ,int index) {
        Ride ride = persistence.get(index);
        ride.setStatus(false);
        driver.balance+=ride.getprice();
        persistence.addtohistory(index);
        persistence.delete(index);
    }
    
//    @Override
//    public void endRide(Driver driver ,Ride ride) {
//        //Ride ride = persistence.get(index);
//        ride.setStatus(false);
//        double balance =driver.getbalance();
//        driver.setbalance(balance+=ride.getprice());
//        persistence.addtohistory(index);
//        persistence.delete(index);
//    }

    @Override
    public List<Ride> getAllHistory() {
        return persistence.getAllHistory();
    }

    @Override
    public void notifyClient(Ride ride)
    {
       ride.getClient().setNotification("New offer has been added!");
    }
   
}