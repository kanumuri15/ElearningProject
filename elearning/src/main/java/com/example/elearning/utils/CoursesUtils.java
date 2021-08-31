package com.example.elearning.utils;


import com.example.elearning.dto.CoursesDTO;

import com.example.elearning.entity.Courses;


public class CoursesUtils {
	public static Courses convertCoursesDtotoEntity(CoursesDTO coursesDto)
	{
		Courses courses=new Courses();
		courses.setCourseID(coursesDto.getCourseID());
		courses.setName(coursesDto.getName());
		courses.setStart_date(coursesDto.getStart_date());
		courses.setEnd_date(coursesDto.getEnd_date());
		return courses;	
	}
	public static CoursesDTO convertCoursesEntitytoDto(Courses Courses)
	{
		CoursesDTO coursesDTO=new CoursesDTO();
		coursesDTO.setCategoryID(Courses.getCategoryID().getCategoryID());
		coursesDTO.setCourseID(Courses.getCourseID());
		coursesDTO.setName(Courses.getName());
		coursesDTO.setStart_date(Courses.getStart_date());
		coursesDTO.setEnd_date(Courses.getEnd_date());
		return coursesDTO;
	}

}
