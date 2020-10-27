package com.capgemini.cabinvoicesystem;

public enum RideCategory {
	NORMAL(10.0, 1.0, 5.0), PREMIUM(15.0, 2.0, 20.0);
	private final double costPerKm;
	private final double costPerMin;
	private final double minFare;
	
	private RideCategory(double costPerKm, double costPerMin, double minFare) {
		this.costPerKm = costPerKm;
		this.costPerMin = costPerMin;
		this.minFare = minFare;
	}
	
	public double getTotalFareForARide(RideInfo ride) {
		double totalFare = ride.getDistance() * costPerKm + ride.getTime() * costPerMin;
		return Math.max(totalFare, minFare);
	}
}
