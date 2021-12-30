package com.example.demo.Core;

import java.util.ArrayList;

public class Ride {
    private String SrcLocation;
    private String DestLocation;
    public ArrayList<Double> offers= new ArrayList<Double>();
    private double price= 0.00;
    private int index= 0;
    private int rating= 0;
    private boolean status=false;
 

    public Ride(){
        this.DestLocation="";
        this.SrcLocation="";
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
    public Ride(String SrcLocation, String DestLocation){
        this.DestLocation=DestLocation;
        this.SrcLocation=SrcLocation;
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
