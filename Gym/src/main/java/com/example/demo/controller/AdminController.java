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

import com.example.demo.service.ActivityService;
import com.example.demo.service.AdminService;
import com.example.demo.service.MemberService;
import com.example.demo.service.TraineeService;
import com.example.demo.service.TrainerService;
import com.example.demo.model.Activity;
import com.example.demo.model.Admin;
import com.example.demo.model.Member;
import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;

@RestController
@RequestMapping("/admin")
public class AdminController {

	// ---------------------------------------------------------------------------------
	@Autowired
	AdminService admin_service;

	@GetMapping("/alladmins")
	public List<Admin> getAdmin() {
		return admin_service.getAllAdmin();
	}

	@GetMapping(path = "/{ad_id}")
	public Optional<Admin> getSingleadmin(@PathVariable("ad_id") Integer ad_id) {
		Optional<Admin> prod = admin_service.getSingleActivity(ad_id);
		return prod;
	}

	@PostMapping()
	public HttpStatus saveAdminy(@RequestBody Admin admin) {
		Admin Admin = admin_service.saveActivity(admin);
		if (Admin == null) {
			return HttpStatus.BAD_REQUEST;
		}
		return HttpStatus.CREATED;
	}

	@DeleteMapping(path = "/{ad_id}")
	public HttpStatus deleteAdmin(@PathVariable("ad_id") Integer ad_id) {
		String result = admin_service.deleteAdmin(ad_id);
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;
	}

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

	@PostMapping("/activity")
	public HttpStatus saveActivity(@RequestBody Activity act) {
		Activity Activity = activity_service.saveActivity(act);
		if (Activity == null) {
			return HttpStatus.BAD_REQUEST;
		}
		return HttpStatus.CREATED;
	}

	@DeleteMapping(path = "/activity/{act_id}")
	public HttpStatus deleteActivity(@PathVariable("act_id") Integer act_id) {
		String result = activity_service.deleteActivity(act_id);
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;
	}

	@DeleteMapping("/allactivities")
	public HttpStatus deleteAllActivities() {
		String result = activity_service.deleteAllActivities();
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;

	}

	@GetMapping("/actCount")
	public int count_act() {
		return activity_service.count();
	}

	// --------------------------------------------------------------------------------------
	@Autowired
	MemberService member_service;

	@GetMapping("/allmembers")
	public List<Member> getMember() {
		return member_service.getAllMembers();
	}

	@GetMapping(path = "/member/{mem_id}")
	public Optional<Member> getSingleMember(@PathVariable("mem_id") Integer mem_id) {
		Optional<Member> member = member_service.getSingleMember(mem_id);
		return member;
	}

	@PostMapping("/member")
	public HttpStatus saveMember(@RequestBody Member mem) {
		Member Member = member_service.saveMember(mem);
		if (Member == null) {
			return HttpStatus.BAD_REQUEST;
		}
		return HttpStatus.CREATED;
	}

	@DeleteMapping(path = "/member/{mem_id}")
	public HttpStatus deleteMember(@PathVariable("mem_id") Integer mem_id) {
		String result = member_service.deleteMember(mem_id);
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;
	}

	@DeleteMapping("/allmembers")
	public HttpStatus deleteAllMembers() {
		String result = member_service.deleteAllMembers();
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;

	}

	@GetMapping("/memCount")
	public int count_mem() {
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

	@PostMapping("/trainer")
	public HttpStatus saveTrainer(@RequestBody Trainer trnr) {
		Trainer Trainer = trainer_service.saveTrainer(trnr);
		if (Trainer == null) {
			return HttpStatus.BAD_REQUEST;
		}
		return HttpStatus.CREATED;
	}

	@DeleteMapping(path = "/trainer/{trnr_id}")
	public HttpStatus deleteTrainer(@PathVariable("trnr_id") Integer trnr_id) {
		String result = trainer_service.deleteTrainer(trnr_id);
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;
	}

	@DeleteMapping("/alltrainers")
	public HttpStatus deleteAlltrainers() {
		String result = trainer_service.deleteAllTrainers();
		if (result != "Success") {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return HttpStatus.OK;

	}

	@GetMapping("/trnrCount")
	public int count_trnr() {
		return activity_service.count();
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

}
