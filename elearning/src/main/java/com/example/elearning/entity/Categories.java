package com.example.elearning.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long categoryID;
	
	@Column
	private String categoryName;
	
	
	@OneToMany(mappedBy = "categoryID",fetch = FetchType.EAGER)
    List<Courses> courses;

	public Long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	
	
}
