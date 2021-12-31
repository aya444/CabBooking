package com.cab.booking.services;

import java.util.ArrayList;

import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
public interface FavAreaObserverManager 
{
    public void update(ArrayList<Driver> subs , Ride r);
}
