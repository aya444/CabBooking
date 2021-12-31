package com.cab.booking.services.impl;

import com.cab.booking.services.DistanceStrategyManager;

public class GoogleAPIStrategyImpl implements DistanceStrategyManager {

    @Override
    public double calculateDistance(String source, String destination) {
        return 200.30;
    }
    
    @Override
    public int calculateETA(String source, String destination){
        return 50;
    } 
    
}
