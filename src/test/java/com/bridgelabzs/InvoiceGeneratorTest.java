package com.bridgelabzs;

import static org.junit.jupiter.api.Assertions.*;

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

}

