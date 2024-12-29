package com.ganesh.service;

import java.util.List;

import com.ganesh.entity.Course;

public interface ICourcesServices {
	public String upsert(Course cources);

	public Course getById(int id);

	public List<Course> getAllCources();

	public String deleteCource(int id);
}
