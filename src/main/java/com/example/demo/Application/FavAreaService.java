package com.example.demo.Application;

import java.util.ArrayList;

import com.example.demo.Core.Driver;
import com.example.demo.Core.FavArea;
import com.example.demo.Core.Ride;

public class FavAreaService implements Subject, IFavAreaService 
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
  public void notify(Ride ride)
  {
    for(int i=0; i<AllFavAreas.size() ; i++)
    { 
      if(ride.getSrcLocation() == AllFavAreas.get(i).getName())
        {
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
