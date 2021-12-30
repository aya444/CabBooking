package com.example.demo.Application;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import java.util.ArrayList;
public interface Observer 
{
    public void update(ArrayList<Driver> subs , Ride r);
}
