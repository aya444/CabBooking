package com.example.demo.Application;

public interface DistanceStrategy {

    public abstract double calculateDistance(String source, String destination);
    public abstract int calculateETA(String source, String destination);
    
}
