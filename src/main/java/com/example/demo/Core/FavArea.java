package com.example.demo.Core;

import com.example.demo.Core.Driver;
import java.util.ArrayList;

//methods: getName, addSubscriber, sendNotification
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
 
   public void addSubscriber(Driver driver, String fav)
   {
    subscribers.add(driver);
    subscribers.get(subscribers.size()-1).addToFav(fav);  //add to favAreas list in driver
   }
     
     public void sendNotification(String notification) 
     {
         for(int i=0; i<subscribers.size(); i++)
           subscribers.get(i).addNoitification(notification);
     } 
  
   
   public void removeSubscriber(Driver driver)
    {
        subscribers.remove(driver);
    }

    public String toString(){
      return "favArea { "+getName();
    }

}
