package com.example.elearning.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.dto.CategoriesDTO;
import com.example.elearning.entity.Categories;
import com.example.elearning.repository.CategoriesRepository;
import com.example.elearning.utils.CategoriesUtils;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesRepository categoriesRepository;
	
	

	@Override
	public List<CategoriesDTO> getAllCategories() {
		List<Categories> categories=this.categoriesRepository.findAll();
		return categories.stream().map((category)->CategoriesUtils.convertCategoriesEntitytoDto(category)).collect(Collectors.toList());
	}



	@Override
	public CategoriesDTO createCategories(CategoriesDTO dto) {
		if(dto!=null)
		{
			Categories categories=CategoriesUtils.convertCategoriesDtotoEntity(dto);
			Categories createdCategories=this.categoriesRepository.save(categories);
			return CategoriesUtils.convertCategoriesEntitytoDto(createdCategories);
		}
		return null;
	}

}
