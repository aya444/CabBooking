package com.cab.booking.services;

import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.services.impl.UserManagerImpl;

public interface FavAreaSubjectManager 
{
   public void subscribe(Driver driver, String fav);
   public void unsubscribe(Driver D, String Area);
   public void notify(Ride ride, UserManagerImpl userManager);
}
