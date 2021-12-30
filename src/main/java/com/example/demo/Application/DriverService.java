package com.example.demo.Application;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public class DriverService implements Observer, IDriverService
{

    @Override
    public void update(Driver d, Ride r)
    {
        d.addAvailable(r);
    }
}
