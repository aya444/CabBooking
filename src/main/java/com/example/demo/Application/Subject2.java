package com.example.demo.Application;

import com.example.demo.Core.Ride;
import com.example.demo.Core.User;

public interface Subject2 
{
    public void subscribe(User c, Ride r);
    public void notifyClient(Ride ride);
}
