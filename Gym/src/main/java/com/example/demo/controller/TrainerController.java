package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Activity;
import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;
import com.example.demo.service.ActivityService;
import com.example.demo.service.TraineeService;
import com.example.demo.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	// --------------------------------------------------------------------------------------
	@Autowired
	ActivityService activity_service;

	@GetMapping("/allactivities")
	public List<Activity> getActivity() {
		return activity_service.getAllActivities();
	}

	@GetMapping(path = "/activity/{act_id}")
	public Optional<Activity> getSingleEmployee(@PathVariable("act_id") Integer act_id) {
		Optional<Activity> Activity = activity_service.getSingleActivity(act_id);
		return Activity;
	}

	// -------------------------------------------------------------------------------------
	@Autowired
	TraineeService trainee_service;

	@GetMapping("/alltrainees")
	public List<Trainee> getTrainee() {
		return trainee_service.getAllTrainees();
	}

	@GetMapping(path = "/trainee/{trne_id}")
	public Optional<Trainee> getSingleTrainee(@PathVariable("trne_id") Integer trne_id) {
		Optional<Trainee> Trainee = trainee_service.getSingleTrainee(trne_id);
		return Trainee;
	}

	@PostMapping("/trainee")
	public HttpStatus saveTrainee(@RequestBody Trainee trne) {
		Trainee Trainee = trainee_service.saveTrainee(trne);
		if (Trainee == null) {
			return HttpStatus.BAD_REQUEST;
		}
		return HttpStatus.CREATED;
	}

	@DeleteMapping(path = "/trainee/{trne_id}")
	public HttpStatus deleteTrainee(@PathVariable("trne_id") Integer trne_id) {
		String result = trainee_service.deleteTrainee(trne_id);
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;
	}

	@DeleteMapping("/alltrainee")
	public HttpStatus deleteAlltrainees() {
		String result = trainee_service.deleteAlltrainees();
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;

	}

	@GetMapping("/trneCount")
	public int count_trne() {
		return activity_service.count();
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

}
