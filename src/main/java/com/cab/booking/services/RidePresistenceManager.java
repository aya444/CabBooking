package com.cab.booking.services;

import java.util.List;

import com.cab.booking.model.Ride;

public interface RidePresistenceManager {
    
    public int getNextID();

    public  boolean add(Ride ride );

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id); 
    
    public boolean addtohistory (int id) ;

    public List<Ride> getAllHistory();

}