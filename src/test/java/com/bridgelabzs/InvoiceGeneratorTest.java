package com.bridgelabzs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class InvoiceGeneratorTest {

	@Test
	void givenDistanceAndMinutesShouldReturnTotalFare() {	
		assertEquals(215,InvoiceGenerator.calculateFare(20.0, 15));
	}
	@Test
	void givenDistanceAndTimeShouldReturnMinCharge() {
		assertEquals(5,InvoiceGenerator.calculateFare(0.3, 2));
	}
    @Test
    void givenDistanceAndTimeShouldReturnMinChargeForMultipleTrips(){
        Ride[] rides={ new Ride(20.0,15),new Ride(0.3,2),new Ride(5.0,3)};
        assertEquals(273.0,InvoiceGenerator.calculateFareForMultipleTrips(rides));
    }

    @Test
    void givenMultipleRidesMustReturnInvoiceSummary(){
        Ride[] rides={ new Ride(20.0,15),new Ride(0.3,2),new Ride(5.0,3)};
        InvoiceSummary summary=InvoiceGenerator.calculateTotalFare(rides);
        assertEquals(new InvoiceSummary(3, 273.0, 91.0),summary);
    }
    @Test
    void givenUserId_shouldReturn_InvoiceSummary() throws InvalidInputException{
        String userId="U04";
        InvoiceRecords expected = new InvoiceRecords("U04",8,480,60);
        assertEquals(expected,InvoiceGenerator.findInvoice(userId));
    }
}

