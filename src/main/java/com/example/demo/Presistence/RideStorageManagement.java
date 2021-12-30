package com.example.demo.Presistence;

import java.util.List;

import com.example.demo.Core.Ride;

public interface RideStorageManagement {
    
    public int getNextID();

    public  boolean add(Ride ride );

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id); 

    public void addtoffer (double offer,int index);
    
    public boolean addtohistory (int id) ;

    public List<Ride> getAllHistory();

}