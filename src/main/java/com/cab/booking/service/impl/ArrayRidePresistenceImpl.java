package com.cab.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cab.booking.model.Ride;
import com.cab.booking.service.RidePresistenceManager;

public class ArrayRidePresistenceImpl implements RidePresistenceManager{
	private static List<Ride> allRides = new ArrayList<Ride>();
    private static List<Ride> ridehistory = new ArrayList<Ride>();

    @Override
    public int getSize() {
        return allRides.size();
    }

    @Override
    public  boolean add(Ride ride) {
        return allRides.add(ride);
    }

    @Override
    public  Ride get(int id) {
        for (Ride ride : allRides) {
            if (ride.getIndex() == id) {
                return ride;
            }
        }
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return allRides;
    }

    @Override
    public boolean delete(int index) {
        for (Ride ride : allRides) {
            if (ride.getIndex() == index) {
                return allRides.remove(ride);
            }
        }

        return false;
    }

    @Override
    public void addtohistory (Ride ride) {
    	ridehistory.add(ride);
    }

    @Override
    public List<Ride> getAllHistory() {
        return ridehistory;
    }
}