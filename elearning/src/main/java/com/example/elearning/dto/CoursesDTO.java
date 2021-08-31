package com.example.elearning.dto;



public class CoursesDTO {

	private Long courseID;
	 private String name;
	 private String start_date;
	 private String end_date;
	 private Long categoryID;
	public Long getCourseID() {
		return courseID;
	}
	public void setCourseID(Long courseID) {
		this.courseID = courseID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categories) {
		this.categoryID = categories;
	}
}
