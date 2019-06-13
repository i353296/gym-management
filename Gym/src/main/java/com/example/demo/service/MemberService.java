package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Member;
import com.example.demo.model.MemberRepo;

@Service
public class MemberService {
	
	@Autowired
	MemberRepo member_repo;
	
	//get single Member
	public Optional<Member> getSingleMember(Integer mem_Id) {
		Optional<Member> Member = member_repo.findById(mem_Id);
		return Member;
	}

	//get all members
	public List<Member> getAllMembers() {
		return member_repo.findAll();
	}

	//add Member
	public Member saveMember(Member mem) {
		return member_repo.save(mem);
	}

	//delete one Member
	public String deleteMember(Integer mem_id) {
		member_repo.deleteById(mem_id);
		return "Success";
	}
	
	//delete all members
	public String deleteAllMembers() {
		member_repo.deleteAll();
		return "Success";
	}
	
	//number of members
	public int count() {
		return (int) member_repo.count();
	}


}
