package com.example.demo.Presistence;
//hello
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.Core.User;

public interface RideStorageManagement {
    
    public int getNextId();

    public  boolean add(String source, String destination );

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id);
    //public default void SaveAs(User user){}

}
