package com.bridgelabzs;

import java.util.ArrayList;
import java.util.List;

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
    public static InvoiceRecords findInvoice(String userId) throws InvalidInputException{
    		try {
    	List<InvoiceRecords> list = new ArrayList<InvoiceRecords>();
		list.add(new InvoiceRecords("U01",3,363,121));
		list.add(new InvoiceRecords("U02",2,340,170));
		list.add(new InvoiceRecords("U03",4,208,52));
		list.add(new InvoiceRecords("U04",8,480,60));
		
		InvoiceRecords user = null;
		  for (int i = 0; i < list.size(); i++) {
			if (userId.equals(list.get(i).getUserId())) {
				user = list.get(i);
			        break;
			 } 
		   }
		return user;    
} catch (NullPointerException e) {
   throw new InvalidInputException("Invalid Input!No Records Found");
}
    
}
}