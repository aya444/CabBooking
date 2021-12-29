package com.example.demo.Core;

import java.util.ArrayList;

public class FavArea 
{
    private String areaName;
    private ArrayList<Driver> subscribers= new ArrayList<Driver>();
     
    public FavArea(String areaName)
    {
      this.areaName= areaName;
    }

    public String getName()
    {
        return areaName;
    }

    public void addSubscriber(Driver driver)
    {
        subscribers.add(driver);
    }

    public void removeSubscriber(Driver driver)
    {
        subscribers.remove(driver);
    }

   /* Public void sendNotification(String area)
    {
        for(int i=0; i<subscribers.size(); i++)
           
    }*/
}
