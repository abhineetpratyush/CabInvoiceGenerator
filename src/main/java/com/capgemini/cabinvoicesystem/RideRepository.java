package com.capgemini.cabinvoicesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {

	private Map<String, List<RideInfo>> UserIdToRideListMap;
	
	public RideRepository() {
		this.UserIdToRideListMap = new HashMap<>();
	}
	
	public void addRidesAgainstUserId(String userId, RideInfo[] rides) {
		this.UserIdToRideListMap.put(userId, new ArrayList<>(Arrays.asList(rides)));
	}

	public RideInfo[] getRidesForUserId(String userId) {
		return this.UserIdToRideListMap.get(userId).toArray(new RideInfo[0]);
	}
}
