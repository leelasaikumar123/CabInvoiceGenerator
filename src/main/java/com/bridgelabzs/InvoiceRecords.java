package com.bridgelabzs;

public class InvoiceRecords {
    private String userId;
    private int numOfRides;
    private double totalFare;
    private double averageFare;
    public InvoiceRecords() {
    }
    public InvoiceRecords(String userId, int numOfRides, double totalFare, double averageFare) {
        this.userId = userId;
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public int getNumOfRides() {
        return numOfRides;
    }
    public void setNumOfRides(int numOfRides) {
        this.numOfRides = numOfRides;
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
    public boolean equals(Object obj){
        InvoiceRecords ir=(InvoiceRecords)obj; 
 return userId.equals(ir.userId) && numOfRides==ir.numOfRides && totalFare==ir.totalFare && averageFare==ir.averageFare;      
    }
}
