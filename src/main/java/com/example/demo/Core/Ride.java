package com.example.demo.Core;
public class Ride {
    private String SrcLocation;
    private String DestLocation;
    private double price= 0.00;


    public Ride(){
        this.DestLocation="";
        this.SrcLocation="";
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
}
