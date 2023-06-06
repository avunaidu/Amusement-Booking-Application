package com.amusementBookingApplication.Pojos;

import java.util.List;

import com.amusementBookingApplication.Entity.Activity;

import lombok.Data;



@Data
public class TripBooking {
	
	
	public int customerId;
	public String name;
	public float bill;
	public List<Activity> activities;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
	
}
