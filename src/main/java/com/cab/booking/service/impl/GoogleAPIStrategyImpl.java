package com.cab.booking.service.impl;

import com.cab.booking.service.DistanceStrategyManager;

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
