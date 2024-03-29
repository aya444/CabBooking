package com.cab.booking.model;

import java.util.ArrayList;

public class Ride {
    private String SrcLocation;
    private String DestLocation;
    public ArrayList<Double> offers= new ArrayList<Double>();
    private double price= 0.00;
    private int index= 1;
    private int rating= 0;
    private boolean status=false;
    User client;
    User driver;
 
    public Ride(){

    }

    public Ride(String SrcLocation, String DestLocation){
        this.DestLocation=DestLocation;
        this.SrcLocation=SrcLocation;
    }

    public Ride(String SrcLocation, String DestLocation,Client cl){
        this.DestLocation=DestLocation;
        this.SrcLocation=SrcLocation;
        client=cl;
    }

    public void setClient(User c)
    {
        client= c;
    }

    public User getClient()
    {
        return client;
    }
    
    public void setDriver(User d)
    {
        driver= d;
    }

    public User getDriver()
    {
        return driver;
    }

    public void addNewOffer(double newOffer)
    {
        offers.add(newOffer);
    }

    public void displayOffers(){
        System.out.println(offers);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int Index) {
        this.index = Index;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSrcLocation ()
    {
        return SrcLocation;
    }

    public String getDestLocation ()
    {
        return DestLocation;
    }

    public double getprice() {
        return price;
    }

    public String toString(){
        return "Ride { "
        		+ "status='" + isStatus() + "'"
                + ", rating='" + getRating() + "'"
        		+ ", Index='" + getIndex() + "'"
        		+ ", offerPrice='" + getprice() + "'"
        		+ ", sourceLocation='" + getSrcLocation() + "'"
        		+ ", destinationLocation='" + getDestLocation() +"'"
        		+ "}";
    }


}