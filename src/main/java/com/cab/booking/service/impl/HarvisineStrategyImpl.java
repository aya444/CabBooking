package com.cab.booking.service.impl;

import com.cab.booking.service.DistanceStrategyManager;

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
