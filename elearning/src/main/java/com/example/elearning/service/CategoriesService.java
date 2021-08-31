package com.example.elearning.service;

import java.util.List;

import com.example.elearning.dto.CategoriesDTO;

public interface CategoriesService {

	public CategoriesDTO createCategories(CategoriesDTO dto);
	public List<CategoriesDTO> getAllCategories();
}
