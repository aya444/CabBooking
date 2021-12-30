package com.example.demo.Application;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public interface RideManagement {
    public  boolean add(Ride ride, Subject favServ);
    public void setDistanceStrategy(DistanceStrategy strategy);
	public DistanceStrategy getDistanceStrategy();
    public Ride get(int id);
    public void addoffer (double offer,int id);
    public List<Ride> getAll();
    public void endRide(Driver driver ,int id);
    public boolean delete(int id);
    public List<Ride> getAllHistory();
}