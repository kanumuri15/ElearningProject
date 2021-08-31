package com.example.elearning.service;

import java.util.List;


import com.example.elearning.dto.CoursesDTO;

public interface CourseService {

	public List<CoursesDTO> getCoursesById(String id);
}
