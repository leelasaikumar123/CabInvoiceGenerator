package com.bridgelabzs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class InvoiceGeneratorTest {

    @Test
    void givenDistanceAndMinutesShouldReturnTotalFare() {
        assertEquals(215, InvoiceGenerator.calculateFare(20.0, 15));
    }

    @Test
    void givenDistanceAndTimeShouldReturnMinCharge() {
        assertEquals(5, InvoiceGenerator.calculateFare(0.3, 2));
    }

    @Test
    void givenDistanceAndTimeShouldReturnMinChargeForMultipleTrips() {
        Ride[] rides = { new Ride(20.0, 15, RideType.NORMAL), new Ride(0.3, 2, RideType.NORMAL),
                new Ride(5.0, 3, RideType.NORMAL) };
        assertEquals(273.0, InvoiceGenerator.calculateFareForMultipleTrips(rides));
    }

    @Test
    void givenMultipleRidesMustReturnInvoiceSummary() {
        Ride[] rides = { new Ride(20.0, 15, RideType.NORMAL), new Ride(0.3, 2, RideType.NORMAL),
                new Ride(5.0, 3, RideType.NORMAL) };
        InvoiceSummary summary = InvoiceGenerator.calculateTotalFare(rides);
        assertEquals(new InvoiceSummary(3, 273.0, 91.0), summary);
    }

    @Test
    void givenUserId_shouldReturn_InvoiceSummary() throws InvalidInputException {
        String userId = "U04";
        InvoiceRecords expected = new InvoiceRecords("U04", 8, 480, 60);
        assertEquals(expected, InvoiceGenerator.findInvoice(userId));
    }

    @Test
    void givenPremiumRide_ShouldReturnFare() {
        Ride ride = new Ride(20.0, 15, RideType.PREMIUM);

        assertEquals(330.0,
                InvoiceGenerator.calculateFare(ride));
    }

    @Test
    void givenNormalRide_ShouldReturnFare() {
        Ride ride = new Ride(20.0, 15, RideType.NORMAL);

        assertEquals(215.0,
                InvoiceGenerator.calculateFare(ride));
    }

    @Test
    void givenPremiumRide_ShouldReturnMinimumFare() {
        Ride ride = new Ride(0.5, 2, RideType.PREMIUM);

        assertEquals(20.0,
                InvoiceGenerator.calculateFare(ride));
    }

}
