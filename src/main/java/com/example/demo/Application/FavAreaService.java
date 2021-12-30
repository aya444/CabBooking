package com.example.demo.Application;

import java.util.ArrayList;

import com.example.demo.Core.Driver;
import com.example.demo.Core.FavArea;
import com.example.demo.Core.Ride;

public class FavAreaService implements Subject, IFavAreaService 
{
  private  ArrayList<FavArea> AllFavAreas= new ArrayList<FavArea>();
 // IDriverService service=new DriverService();

  /*loop on all favorite areas, 
  if the passed area already exists, add the driver to it and return true*/

  @Override
  public void addArea(FavArea newFav)
  {
    AllFavAreas.add(newFav);
    System.out.println("New Fav Area Added as [" + AllFavAreas + "] . !");
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
    System.out.println("hello subs out of if cond");
      if (isExisting(driver, fav)== false)
       {

          FavArea FA= new FavArea(fav);
          FA.addSubscriber(driver, fav);
          addArea(FA);
          // System.out.println("this is faveArea "+AllFavAreas);
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
    
     System.out.println(" notify "+AllFavAreas);
     System.out.println("notify before for");
    for(int i=0; i<AllFavAreas.size() ; i++)
    {
      System.out.println("notify in for");
      
      if(ride.getSrcLocation() == AllFavAreas.get(i).getName())
        {
          System.out.println("notify in if");

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
