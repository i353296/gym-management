package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Activity;
import com.example.demo.model.ActivityRepo;

@Service
public class ActivityService {
	@Autowired
	ActivityRepo activity_repo;
	
	//get single activity
	public Optional<Activity> getSingleActivity(Integer act_Id) {
		Optional<Activity> Activity = activity_repo.findById(act_Id);
		return Activity;
	}

	//get all activities
	public List<Activity> getAllActivities() {
		return activity_repo.findAll();
	}

	//add activity
	public Activity saveActivity(Activity act) {
		return activity_repo.save(act);
	}

	//delete one activity
	public String deleteActivity(Integer act_id) {
		activity_repo.deleteById(act_id);
		return "Success";
	}
	
	//delete all activities
	public String deleteAllActivities() {
		activity_repo.deleteAll();
		return "Success";
	}
	
	//number of activities
	public int count() {
		return (int) activity_repo.count();
	}

}
