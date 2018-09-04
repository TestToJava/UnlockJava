package com.unlockjava.web.service;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.unlockjava.web.dao.CategoriesDao;
import com.unlockjava.web.dto.CategoriesDto;

import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class CategoryServiceTest {

	@Tested
	private static CategoryService categoryService;

	@Injectable
	private CategoriesDao catDao;

	private static EmbeddedDatabase db;

	@BeforeClass
	static public void setup() throws IOException {

		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		builder.setType(EmbeddedDatabaseType.H2);
		builder.generateUniqueName(false);

		builder.addScript("testdata/sql/create-posts.sql");
		builder.addScript("testdata/sql/create-category.sql");
		builder.addScript("testdata/sql/create-admin.sql");

		builder.addScript("testdata/sql/insert-posts.sql");
		builder.addScript("testdata/sql/insert-category.sql");
		builder.addScript("testdata/sql/insert-admin.sql");

		db = builder.build();

		categoryService = new CategoryService();

	}

	@Test
	public void testGetAllCategories() {

		List<CategoriesDto> categoriesList = categoryService.getAllCategories();
		assertNotNull(categoriesList);
	}

}
