package com.cab.booking.services.impl;

import java.util.ArrayList;

import com.cab.booking.model.Driver;
import com.cab.booking.model.FavArea;
import com.cab.booking.model.Ride;
import com.cab.booking.services.FavAreaManager;
import com.cab.booking.services.FavAreaSubjectManager;

public class FavAreaManagerImpl implements FavAreaSubjectManager, FavAreaManager 
{
  private  ArrayList<FavArea> AllFavAreas= new ArrayList<FavArea>();

  @Override
  public void addArea(FavArea newFav)
  {
    AllFavAreas.add(newFav);
  }

  @Override
  public Boolean isExisting(Driver D, String fav)
  {
    for(int i=0; i< AllFavAreas.size(); i++)        
    {
        if(fav== AllFavAreas.get(i).getName())
        {
          AllFavAreas.get(i).addSubscriber(D,fav);
          return true;
        }
    }
    return false;
  }

  @Override
  public void subscribe(Driver driver, String fav)
  {
      if (isExisting(driver, fav)== false)
       {

          FavArea FA= new FavArea(fav);
          FA.addSubscriber(driver, fav);
          addArea(FA);
       }   
  }

  @Override
  public void unsubscribe(Driver D, String Area)
  {
    for(int i=0; i<AllFavAreas.size();i++)
    {
        if(Area== AllFavAreas.get(i).getName())
           AllFavAreas.get(i).removeSubscriber(D);
    }
  }

  @Override
  public void notify(Ride ride, UserManagerImpl userManager)
  {
    for(int i=0; i<AllFavAreas.size() ; i++)
    { 
      if(ride.getSrcLocation() == AllFavAreas.get(i).getName())
        {
          userManager.update(AllFavAreas.get(i).getSubscribers(), ride);
          AllFavAreas.get(i).sendNotification("New available ride in "+ride.getSrcLocation()+"!");
        
        }
    }
  }
  


  public void showAllFavs()
  {
    for(int i=0; i<AllFavAreas.size(); i++)
    {
      System.out.println(AllFavAreas.get(i)+" ");
    }
  }
}
