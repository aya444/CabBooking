package com.cab.booking.service;
import java.util.List;

import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.model.User;
import com.cab.booking.service.impl.UserManagerImpl;

public interface RideManager {
    public boolean add(Ride ride,User c ,FavAreaSubjectManager favServ, UserManagerImpl userManager) ;
    public void setDistanceStrategy(DistanceStrategyManager strategy);
	public DistanceStrategyManager getDistanceStrategy();
    public Ride get(int id);
    public void addoffer (Ride ride, double offer);
    public List<Ride> getAll();
    public void endRide(Driver driver, int id);
    public boolean delete(int id);
    public List<Ride> getAllHistory();
   // public void createRide(String source, String dest, Client client);
}