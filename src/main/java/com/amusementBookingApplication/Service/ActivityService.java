package com.amusementBookingApplication.Service;

import java.util.List;

import com.amusementBookingApplication.Entity.Activity;
import com.amusementBookingApplication.Exception.ActivityAlreadyExistsException;
import com.amusementBookingApplication.Exception.NoSuchActivityExistsException;
import com.amusementBookingApplication.Exception.NoSuchIdExistsException;



public interface ActivityService  {
	
	//method to add Activity
	public Activity addActivity (Activity activity) throws ActivityAlreadyExistsException;
	
	//method to update activity
	public Activity updateActivity(Activity activity,int id) throws NoSuchActivityExistsException;
	
	//method to delete activity
	public String deleteActivity(int id) throws NoSuchIdExistsException; 
	
	//List to get All activities
	List<Activity> viewActivitiesOfCharges(float charges);

	int countActivitiesOfCharges(float charges);

    List<Activity> viewAllActivities();

    Activity getActivity(int id);
	
	//List<Activity> viewActivitiesOfCharges(float charges);

}