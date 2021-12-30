package com.example.demo.Application;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public interface Subject 
{
   public void subscribe(Driver driver, String fav);
   public void unsubscribe(Driver D, String Area);
   public void notify(Ride ride, UserManagerImpl userManager);
}
