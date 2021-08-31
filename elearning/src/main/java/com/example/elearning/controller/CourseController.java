package com.example.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elearning.dto.CoursesDTO;
import com.example.elearning.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	@GetMapping(value = "/coursesbyid/{id}")
    public List<CoursesDTO> getCampaignOfUser(@PathVariable(value = "id") String id)
    {
    	return this.courseService.getCoursesById(id);
    }
}
