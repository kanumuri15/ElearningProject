package com.example.elearning.utils;

import com.example.elearning.dto.CategoriesDTO;
import com.example.elearning.entity.Categories;

public class CategoriesUtils {

	public static Categories convertCategoriesDtotoEntity(CategoriesDTO categoriesDto)
	{
		Categories categories=new Categories();
		categories.setCategoryID(categoriesDto.getCategoryID());
		categories.setCategoryName(categoriesDto.getCategoryName());
		return categories;
	}
	public static CategoriesDTO convertCategoriesEntitytoDto(Categories categories)
	{
		CategoriesDTO categoriesDTO=new CategoriesDTO();
		categoriesDTO.setCategoryID(categories.getCategoryID());
		categoriesDTO.setCategoryName(categories.getCategoryName());
		return categoriesDTO;
	}
}
