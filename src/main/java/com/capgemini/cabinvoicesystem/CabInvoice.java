package com.capgemini.cabinvoicesystem;

public class CabInvoice {

	private static final double COST_PER_KILOMETRE = 10;
	private static final double COST_PER_MINUTE = 1;
	private static final double MIN_FARE = 5.0;

	public double getTotalFare(double distance, double time) {
		double calculatedFare = distance * COST_PER_KILOMETRE + time * COST_PER_MINUTE;
		return Math.max(calculatedFare, MIN_FARE);
	}

	public double getTotalFare(RideInfo[] rides) {
		double totalFare = 0;
		for(int ridesItr = 0; ridesItr < rides.length; ridesItr++) {
			totalFare += getTotalFare(rides[ridesItr].getDistance(), rides[ridesItr].getTime());
		}
		return totalFare;
	}

	public InvoiceStructure getInvoice(RideInfo[] rides) {
		return new InvoiceStructure(rides.length, getTotalFare(rides));
	}

	public void addRideDetailsToRideRepo(String userId, RideInfo[] rides) {
		// TODO Auto-generated method stub
		
	}

	public InvoiceStructure getInvoice(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
