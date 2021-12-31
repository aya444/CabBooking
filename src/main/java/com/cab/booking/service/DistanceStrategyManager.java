package com.cab.booking.service;

public interface DistanceStrategyManager {

    public abstract double calculateDistance(String source, String destination);
    public abstract int calculateETA(String source, String destination);
    
}
