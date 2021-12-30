package com.example.demo.Application;

import com.example.demo.Core.Driver;
import com.example.demo.Core.FavArea;

public interface IFavAreaService
{
   public Boolean isExisting(Driver D, String fav);
   public void addArea(FavArea newFav);
}
