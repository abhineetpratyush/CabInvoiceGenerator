package com.capgemini.cabinvoicesystem;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	@Test
	public void givenDistanceAndTimeRespectively_ShouldReturnCorrectFare() {
		CabInvoice cabInvoiceGenerator = new CabInvoice();
		double cabFare = cabInvoiceGenerator.getTotalFare(20.0, 15.0);
		Assert.assertEquals(215.0, cabFare, 0);
	}

	@Test
	public void givenDistanceAndTimeRespectively_ShouldReturnMinimumFare() {
		CabInvoice cabInvoiceGenerator = new CabInvoice();
		double cabFare = cabInvoiceGenerator.getTotalFare(0.2, 1);
		Assert.assertEquals(5.0, cabFare, 0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnAggregateTotal() {
		CabInvoice cabInvoiceGenerator = new CabInvoice();
		RideInfo[] rides = {new RideInfo(20.0, 15.0), new RideInfo(0.2, 1.0)};
		double cabFare = cabInvoiceGenerator.getTotalFare(rides);
		Assert.assertEquals(220.0, cabFare, 0);
	}
}

