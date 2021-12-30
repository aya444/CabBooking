package com.example.demo.Presistence;
//hello
import java.util.List;

import com.example.demo.Core.Ride;

public interface RideStorageManagement {
    
    public int getNextID();

    public  boolean add(Ride ride );

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id);

    public boolean addtohistory (int id) ;

    public List<Ride> getAllHistory();

}