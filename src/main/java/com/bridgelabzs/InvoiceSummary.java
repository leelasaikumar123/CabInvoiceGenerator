package com.bridgelabzs;

public class InvoiceSummary {
    public int numofRides;
    public double totalFare;
    public double averageFare;
    public InvoiceSummary(int numofRides, double totalFare, double averageFare) {
        this.numofRides = numofRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }
    public int getNumofRides() {
        return numofRides;
    }
    public void setNumofRides(int numofRides) {
        this.numofRides = numofRides;
    }
    public double getTotalFare() {
        return totalFare;
    }
    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
    public double getAverageFare() {
        return averageFare;
    }
    public void setAverageFare(double averageFare) {
        this.averageFare = averageFare;
    }
    @Override
public boolean equals(Object obj) {
    InvoiceSummary other = (InvoiceSummary) obj;
 return totalFare == other.totalFare && numofRides == other.numofRides && averageFare == other.averageFare;
}
}
