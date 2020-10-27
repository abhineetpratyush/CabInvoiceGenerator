package com.capgemini.cabinvoicesystem;

public class InvoiceStructure {
	
	private int numOfRides;
	private double totalFare;
	private double avgFarePerRide;
	
	public InvoiceStructure(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.avgFarePerRide = totalFare / numOfRides;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avgFarePerRide);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numOfRides;
		temp = Double.doubleToLongBits(totalFare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceStructure other = (InvoiceStructure) obj;
		if (Double.doubleToLongBits(avgFarePerRide) != Double.doubleToLongBits(other.avgFarePerRide))
			return false;
		if (numOfRides != other.numOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}
}
