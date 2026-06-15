package com.bridgelabzs;

public class Ride {
    public double distance;
    public int minutes;
    public Ride(double distance, int minutes) {
        this.distance = distance;
        this.minutes = minutes;
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
    
}
