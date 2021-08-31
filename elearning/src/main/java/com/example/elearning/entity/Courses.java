package com.example.elearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column
	 private Long courseID;
	 
	 @Column
	 private String name;
	 
	 @Column
	 private String start_date;
	 
	 @Column
	 private String end_date;
	 
	 @ManyToOne
		@JoinColumn(name="categoryID")
		private Categories categoryID;
	 
	 
	 public Long getCourseID() {
		return courseID;
	}

	public Categories getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Categories categoryID) {
		this.categoryID = categoryID;
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
		 
}
