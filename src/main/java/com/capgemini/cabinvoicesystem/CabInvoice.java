package com.capgemini.cabinvoicesystem;

public class CabInvoice {

	private RideRepository rideRepo;

	public CabInvoice() {
		this.rideRepo = new RideRepository();
	}

	public InvoiceStructure getInvoice(RideInfo[] rides) {
		double totalFare = 0;
		for(RideInfo ride : rides) 
			totalFare += ride.getRideCategory().getTotalFareForARide(ride);
		return new InvoiceStructure(rides.length, totalFare);
	}

	public void addRideDetailsToRideRepo(String userId, RideInfo[] rides) {
		this.rideRepo.addRidesAgainstUserId(userId, rides);
	}

	public InvoiceStructure getInvoice(String userId) {
		return getInvoice(this.rideRepo.getRidesForUserId(userId));
	}
}
