package com.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.model.Category;
import com.ssh.service.CategoryService;

public class TestSSH3 {
	
	@Test
	public void fun(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CategoryService categoryService = (CategoryService) context.getBean("categoryService");
		categoryService.update(new Category(6,"iiiihhhg", false));
		context.close();
	}
}
