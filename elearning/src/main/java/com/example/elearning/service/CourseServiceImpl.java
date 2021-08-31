package com.example.elearning.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.dto.CoursesDTO;
import com.example.elearning.entity.Categories;
import com.example.elearning.entity.Courses;
import com.example.elearning.repository.CategoriesRepository;
import com.example.elearning.repository.CoursesRepository;
import com.example.elearning.utils.CoursesUtils;

@Service
public class CourseServiceImpl implements CourseService {


	@Autowired
	CategoriesRepository categoriesrepository;
	@Autowired
	CoursesRepository coursesrepository;
	@Override
	public List<CoursesDTO> getCoursesById(String id) {
		Optional<Categories> categories=this.categoriesrepository.findById(Long.parseLong(id));
		if(categories.isPresent())
		{
			List<Courses> byIDCourses=categories.get().getCourses();
	       		
			return byIDCourses.stream().map((courses)->CoursesUtils.convertCoursesEntitytoDto(courses)).collect(Collectors.toList());
		}
		
		return null;
	}

}
