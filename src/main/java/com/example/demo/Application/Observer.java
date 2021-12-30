package com.example.demo.Application;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public interface Observer 
{
    public void update(Driver d, Ride r);
}
