package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Activity;
import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;
import com.example.demo.service.ActivityService;
import com.example.demo.service.TraineeService;
import com.example.demo.service.TrainerService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

	// --------------------------------------------------------------------------------------
	@Autowired
	ActivityService activity_service;

	@GetMapping("/allactivities")
	public List<Activity> getActivity() {
		return activity_service.getAllActivities();
	}

	@GetMapping(path = "/activity/{act_id}")
	public Optional<Activity> getSingleEmployee(@PathVariable("act_id") Integer act_id) {
		Optional<Activity> prod = activity_service.getSingleActivity(act_id);
		return prod;
	}

	// -------------------------------------------------------------------------------------
	@Autowired
	TrainerService trainer_service;

	@GetMapping("/alltrainers")
	public List<Trainer> getTrainer() {
		return trainer_service.getAllTrainers();
	}

	@GetMapping(path = "/trainer/{trnr_id}")
	public Optional<Trainer> getSingleTrainer(@PathVariable("trnr_id") Integer trnr_id) {
		Optional<Trainer> Trainer = trainer_service.getSingleTrainer(trnr_id);
		return Trainer;
	}

	// -------------------------------------------------------------------------------------
	@Autowired
	TraineeService trainee_service;

	@GetMapping("/alltrainees")
	public List<Trainee> getTrainee() {
		return trainee_service.getAllTrainees();
	}

}
