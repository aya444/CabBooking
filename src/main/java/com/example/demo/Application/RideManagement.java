package com.example.demo.Application;
//hello
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public interface RideManagement {
    //Ride ride= new Ride();
    public  boolean add(String source, String destination );
    public Ride get(int id);
    public List<Ride> getAll();
    boolean delete(int id);

}
