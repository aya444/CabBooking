package com.cab.booking.services.impl;

import com.cab.booking.services.DistanceStrategyManager;

public class HarvisineStrategyImpl implements DistanceStrategyManager{

    @Override
    public double calculateDistance(String source, String destination) {
        return 100.20;
    }

    @Override
    public int calculateETA(String source, String destination){
        return 20;
    }
    
}
