package com.cab.booking.service;

import java.util.List;

import com.cab.booking.model.Ride;

public interface RidePresistenceManager {
    
    public int getSize();

    public  boolean add(Ride ride );

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id); 
    
    public void addtohistory (Ride ride) ;

    public List<Ride> getAllHistory();

}