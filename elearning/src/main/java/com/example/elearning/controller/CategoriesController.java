package com.example.elearning.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.elearning.dto.CategoriesDTO;
import com.example.elearning.service.CategoriesService;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	@Autowired
	private CategoriesService categoriesService;
	@PostMapping(value="/create")
    public @ResponseBody CategoriesDTO createCategories(@RequestBody CategoriesDTO categoriesDTO)
    {
    	return this.categoriesService.createCategories(categoriesDTO);
    }
	@GetMapping(value="/allcategories")
    public List<CategoriesDTO> getAllCategories()
    {
    	return this.categoriesService.getAllCategories();
    }
}
