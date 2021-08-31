package com.example.elearning;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.elearning.controller.CategoriesController;
import com.example.elearning.controller.CourseController;
import com.example.elearning.dto.CategoriesDTO;
import com.example.elearning.entity.Categories;
import com.example.elearning.service.CourseService;
import com.example.elearning.service.CourseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class ElearningApplicationTests {

	@Autowired
	CourseService courseService;
	
	@Autowired
	private CourseController cont;
	
	@Autowired
	private CategoriesController cont1;

	@Test
	public void testGetAll()
	{
		//List<Categories> list=categoriesRepository.findAll();
		
		
		assertNotNull(this.cont.getCampaignOfUser("1"));
		CategoriesDTO cdto=new CategoriesDTO();
		cdto.setCategoryName("Woa");
		assertNotNull(this.cont1.createCategories(cdto));
		
		assertNull(this.cont1.createCategories(null));
		
		assertNotNull(this.cont1.getAllCategories());
		//\assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testGetById()
	{
		//List<Courses> byId=categoriesRepository.findById(1L).get().getCourses();
		//assertThat(byId).size().isGreaterThan(0);
	}
}
