package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trainee;
import com.example.demo.model.TraineeRepo;

@Service
public class TraineeService {

	@Autowired
	TraineeRepo Trainee_repo;
	
	//get single Trainee
	public Optional<Trainee> getSingleTrainee(Integer trne_Id) {
		Optional<Trainee> Trainee = Trainee_repo.findById(trne_Id);
		return Trainee;
	}

	//get all trainees
	public List<Trainee> getAllTrainees() {
		return Trainee_repo.findAll();
	}

	//add Trainee
	public Trainee saveTrainee(Trainee trne) {
		return Trainee_repo.save(trne);
	}

	//delete one Trainee
	public String deleteTrainee(Integer trne_id) {
		Trainee_repo.deleteById(trne_id);
		return "Success";
	}
	
	//delete all trainees
	public String deleteAlltrainees() {
		Trainee_repo.deleteAll();
		return "Success";
	}
	
	//number of activities
	public int count() {
		return (int) Trainee_repo.count();
	}
}
