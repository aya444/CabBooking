package com.cab.booking.service;

import com.cab.booking.model.Ride;
import com.cab.booking.model.User;

public interface RideSubjectManager 
{
    public void subscribe(User c, Ride r);
    public void notifyClient(Ride ride);
}
