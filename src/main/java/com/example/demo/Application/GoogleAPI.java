package com.example.demo.Application;

public class GoogleAPI implements DistanceStrategy {

    @Override
    public double calculateDistance(String source, String destination) {
        return 200.30;
    }
    
    @Override
    public int calculateETA(String source, String destination){
        return 50;
    } 
    
}
