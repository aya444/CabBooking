package com.example.demo.Presistence;

//import java.util.ArrayList;
//hello

import com.example.demo.Presistence.RideStorageManagement;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Core.Ride;

public class RideStoreByArray implements RideStorageManagement{
	private static List<Ride> allRides = new ArrayList<Ride>();
    @Override
    public int getNextId() {
        return allRides.size();
    }
    @Override
    public  boolean add(String source, String destination ) {
        Ride ride= new Ride(source, destination);
        return allRides.add(ride);
    }

    @Override
    public  Ride get(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
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
    public boolean delete(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }


	
}
