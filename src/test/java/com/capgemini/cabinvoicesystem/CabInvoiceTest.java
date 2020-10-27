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
}
