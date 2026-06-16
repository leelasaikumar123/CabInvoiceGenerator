package com.bridgelabzs;

public class Ride {
    public double distance;
    public int minutes;
    private RideType rideType;
    public Ride(double distance, int minutes,RideType rideType) {
        this.distance = distance;
        this.minutes = minutes;
        this.rideType = rideType;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public RideType getRideType() {
        return rideType;
    }
    public void setRideType(RideType rideType) {
        this.rideType = rideType;
    }
    
}
