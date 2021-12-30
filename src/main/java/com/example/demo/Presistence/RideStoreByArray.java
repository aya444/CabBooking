/*package com.example.demo.Presistence;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Core.Ride;

public class RideStoreByArray implements RideStorageManagement{
	private static List<Ride> allRides = new ArrayList<>();
    @Override
    public int getSize() {
        return allRides.size();
    }
    @Override
    public  boolean add(Ride ride ) {
        return allRides.add(ride);
    }

    @Override
    public  Ride get(int index) {
        for (Ride ride : allRides) {
            if (ride.getIndex() == index) {
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
            if (ride.getIndex() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }


	
}*/


package com.example.demo.Presistence;

//import java.util.ArrayList;

import com.example.demo.Presistence.RideStorageManagement;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Core.Ride;

public class RideStoreByArray implements RideStorageManagement{
	private static List<Ride> allRides = new ArrayList<Ride>();
    private static List<Ride> ridehistory = new ArrayList<Ride>();
    @Override
    public int getNextID() {
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
    public boolean delete(int id) {
        for (Ride ride : allRides) {
            if (ride.getIndex() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }
    @Override
    public boolean addtohistory (int id) {
        for (Ride ride : allRides) {
            if (ride.getIndex() == id) {
                 ridehistory.add(ride);
                 return true;
            }
    }
        return false;
    }

    @Override
    public List<Ride> getAllHistory() {
        return ridehistory;
    }

	
}