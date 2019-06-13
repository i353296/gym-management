package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trainer;
import com.example.demo.model.TrainerRepo;

@Service
public class TrainerService {

	@Autowired
	TrainerRepo Trainer_repo;
	
	//get single Trainer
	public Optional<Trainer> getSingleTrainer(Integer trnr_Id) {
		Optional<Trainer> Trainer = Trainer_repo.findById(trnr_Id);
		return Trainer;
	}

	//get all trainers
	public List<Trainer> getAllTrainers() {
		return Trainer_repo.findAll();
	}

	//add Trainer
	public Trainer saveTrainer(Trainer trnr) {
		return Trainer_repo.save(trnr);
	}

	//delete one Trainer
	public String deleteTrainer(Integer trnr_id) {
		Trainer_repo.deleteById(trnr_id);
		return "Success";
	}
	
	//delete all trainers
	public String deleteAllTrainers() {
		Trainer_repo.deleteAll();
		return "Success";
	}
	
	//number of trainers
	public int count() {
		return (int) Trainer_repo.count();
	}
}
