package com.cab.booking.services;

public interface DistanceStrategyManager {

    public abstract double calculateDistance(String source, String destination);
    public abstract int calculateETA(String source, String destination);
    
}
