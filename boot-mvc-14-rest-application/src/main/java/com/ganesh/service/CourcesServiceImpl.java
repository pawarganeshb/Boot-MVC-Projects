package com.ganesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.entity.Course;
import com.ganesh.repo.ICourceRepo;

@Service("courceService")
public class CourcesServiceImpl implements ICourcesServices {

	@Autowired
	private ICourceRepo courceRepo;

	@Override
	public String upsert(Course cources) {
		courceRepo.save(cources);
		return "success";
	}

	@Override
	public Course getById(int id) {
		Optional<Course> cource = courceRepo.findById(id);
		if (cource.isPresent()) {
			return cource.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCources() {
		return courceRepo.findAll();
	}

	@Override
	public String deleteCource(int id) {
		if (courceRepo.existsById(id)) {
			courceRepo.deleteById(id);
		} else {
			return "No Record Found";
		}
		return "success";
	}

}
