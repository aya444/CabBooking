package com.example.demo.Application;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Core.User;

public interface RideManagement {
    public boolean add(Ride ride,User c ,Subject favServ, UserManagerImpl userManager) ;
    public void setDistanceStrategy(DistanceStrategy strategy);
	public DistanceStrategy getDistanceStrategy();
    public Ride get(int id);
    public void addoffer (Ride ride, double offer);
    public List<Ride> getAll();
    public void endRide(Driver driver, int id);
    public boolean delete(int id);
    public List<Ride> getAllHistory();
   // public void createRide(String source, String dest, Client client);
}