package com.capgemini.cabinvoicesystem;

public class RideInfo {
	
	private double distance;
	private double time;
	private RideCategory rideCategory;
	
	public RideInfo(RideCategory rideCategory, double distance, double time) {
		this.distance = distance;
		this.time = time;
		this.rideCategory = rideCategory;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getTime() {
		return time;
	}
	
	public void setTime(double time) {
		this.time = time;
	}

	public RideCategory getRideCategory() {
		return rideCategory;
	}

	public void setRideCategory(RideCategory rideCategory) {
		this.rideCategory = rideCategory;
	}
}	
