package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.model.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo admin_repo;
	
	//get single activity
	public Optional<Admin> getSingleActivity(Integer act_Id) {
		Optional<Admin> Admin = admin_repo.findById(act_Id);
		return Admin;
	}

	//get all activities
	public List<Admin> getAllAdmin() {
		return admin_repo.findAll();
	}

	//add activity
	public Admin saveActivity(Admin admin) {
		return admin_repo.save(admin);
	}

	//delete one activity
	public String deleteAdmin(Integer ad_id) {
		admin_repo.deleteById(ad_id);
		return "Success";
	}
	

}
