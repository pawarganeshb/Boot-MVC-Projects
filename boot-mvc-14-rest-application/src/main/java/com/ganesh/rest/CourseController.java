package com.ganesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.Course;
import com.ganesh.service.ICourcesServices;

@RestController
public class CourseController {
	@Autowired
	private ICourcesServices courcesServices;

	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course cources) {
		String status = courcesServices.upsert(cources);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}

	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer id) {
		Course cources = courcesServices.getById(id);
		return new ResponseEntity<Course>(cources, HttpStatus.OK);
	}

	@GetMapping("courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> allCourses = courcesServices.getAllCources();
		return new ResponseEntity<List<Course>>(allCourses, HttpStatus.OK);
	}

	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course cources) {
		String status = courcesServices.upsert(cources);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id) {
		String status = courcesServices.deleteCource(id);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
