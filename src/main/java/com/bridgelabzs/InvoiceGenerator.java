package com.bridgelabzs;

public class InvoiceGenerator {
   public static final int costPerMinute=1;
public static final double minCostPerKm=10;
public static final double minFare=5;	
	public static  double calculateFare(double distance,int minutes) {
	double totalFare=(distance*minCostPerKm)+(minutes*costPerMinute);
	if(totalFare<=5) {
		return minFare;
	}		
	return totalFare;	
	}
    public static double calculateFareForMultipleTrips(Ride[] rides){
        double totalFare=0.0;
    for(Ride ride : rides){
        totalFare=totalFare+calculateFare(ride.getDistance(),ride.getMinutes());
    }
        return totalFare;
    } 
    public static InvoiceSummary calculateTotalFare(Ride[] rides){
        double totalFare=calculateFareForMultipleTrips(rides);
        return new InvoiceSummary(rides.length,totalFare,totalFare/rides.length);
    }
}
