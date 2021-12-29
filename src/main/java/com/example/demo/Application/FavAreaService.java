package com.example.demo.Application;

import java.util.ArrayList;

import com.example.demo.Core.Driver;
import com.example.demo.Core.FavArea;

public class FavAreaService implements Subject, IFavAreaService 
{
  private  ArrayList<FavArea> AllFavAreas= new ArrayList<FavArea>();

  /*loop on all favorite areas, 
  if the passed area already exists, add the driver to it and return true*/

  @Override
  public Boolean isExisting(Driver D)
  {
    int x= D.getFavAreas().size() -1;
    for(int i=0; i< AllFavAreas.size(); i++)        
    {
        if(D.getFavAreas().get(x)== AllFavAreas.get(i).getName())
           {
            AllFavAreas.get(i).addSubscriber(D);
            return true;
            }
    }
    return false;
  }

  @Override
  public void subscribe(Driver driver)
  {
    int x= driver.getFavAreas().size() -1;
      if (isExisting(driver)== false)
       {
          FavArea FA= new FavArea(driver.getFavAreas().get(x));
          FA.addSubscriber(driver);
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
}
