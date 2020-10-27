package com.capgemini.cabinvoicesystem;

public class CabInvoice {

	private static final double COST_PER_KILOMETRE = 10;
	private static final double COST_PER_MINUTE = 1;

	public double getTotalFare(double distance, double time) {
		double calculatedFare = distance * COST_PER_KILOMETRE + time * COST_PER_MINUTE;
		return Math.max(calculatedFare, 5.0);
	}

	public double getTotalFare(RideInfo[] rides) {
		// TODO Auto-generated method stub
		return 0;
	}
}
