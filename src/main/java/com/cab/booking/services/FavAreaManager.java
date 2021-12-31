package com.cab.booking.services;

import com.cab.booking.model.Driver;
import com.cab.booking.model.FavArea;

public interface FavAreaManager
{
   public Boolean isExisting(Driver D, String fav);
   public void addArea(FavArea newFav);
}
