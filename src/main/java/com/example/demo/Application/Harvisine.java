package com.example.demo.Application;

public class Harvisine implements DistanceStrategy{

    @Override
    public double calculateDistance(String source, String destination) {
        return 100.20;
    }

    @Override
    public int calculateETA(String source, String destination){
        return 20;
    }
    
}
