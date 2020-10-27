package com.capgemini.cabinvoicesystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceTest {
	
	CabInvoice cabInvoiceGenerator;
	
	@Before
	public void initializeCabInvoiceObject() {
		cabInvoiceGenerator = new CabInvoice();
	}
	
	@Test
	public void givenDistanceAndTimeRespectively_ShouldReturnCorrectFare() {
		double cabFare = cabInvoiceGenerator.getTotalFare(20.0, 15.0);
		Assert.assertEquals(215.0, cabFare, 0);
	}

	@Test
	public void givenDistanceAndTimeRespectively_ShouldReturnMinimumFare() {
		double cabFare = cabInvoiceGenerator.getTotalFare(0.2, 1);
		Assert.assertEquals(5.0, cabFare, 0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnAggregateTotal() {
		RideInfo[] rides = {new RideInfo(20.0, 15.0), new RideInfo(0.2, 1.0)};
		double cabFare = cabInvoiceGenerator.getTotalFare(rides);
		Assert.assertEquals(220.0, cabFare, 0);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnInvoice() {
		RideInfo[] rides = {new RideInfo(20.0, 15.0), new RideInfo(0.2, 1.0)};
		InvoiceStructure expectedInvoice = new InvoiceStructure(2, 220.0);
		InvoiceStructure generatedInvoice = cabInvoiceGenerator.getInvoice(rides);
		Assert.assertEquals(expectedInvoice, generatedInvoice);
	}
	
	@Test
	public void givenUserId_ShouldReturnInvoice() {
		String userId = "abhineet@xyz.com";
		RideInfo[] rides = {new RideInfo(20.0, 15.0), new RideInfo(0.2, 1.0)};
		cabInvoiceGenerator.addRideDetailsToRideRepo(userId, rides);
		InvoiceStructure expectedInvoice = new InvoiceStructure(2, 220.0);
		InvoiceStructure generatedInvoice = cabInvoiceGenerator.getInvoice(userId);
		Assert.assertEquals(expectedInvoice, generatedInvoice);
	}
}

