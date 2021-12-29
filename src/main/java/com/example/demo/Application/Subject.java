package com.example.demo.Application;

import com.example.demo.Core.Driver;

public interface Subject 
{
    //TODO public void notifyDrivers();
   public void subscribe(Driver driver);
   public void unsubscribe(Driver D, String Area);
}
