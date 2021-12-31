package com.cab.booking.service;

import java.util.ArrayList;

import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
public interface FavAreaObserverManager 
{
    public void update(ArrayList<Driver> subs , Ride r);
}
