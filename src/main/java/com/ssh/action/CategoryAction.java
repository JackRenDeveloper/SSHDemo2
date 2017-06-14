package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.Category;
import com.ssh.service.CategoryService;

public class CategoryAction extends ActionSupport {  

	private static final long serialVersionUID = 7720044063135790108L;

	private Category category;//设置一个私有成员变量接收url带过来的参数，注意下面要写好get和set方法，这是struts2的解决的 
	
	private CategoryService categoryService; //设置categoryService是为了很直观的看出与Spring整合前后的不同  
    
    public String update() {
        System.out.println("----update----");
        System.out.println(categoryService); //整合前后输出不同 ,整合前NULL，整合后不是NULL
        categoryService.update(category);
        return "index";  
    }
      
    public String save() {
        System.out.println("----save----");
        System.out.println(categoryService);
        categoryService.saveHibernateAndSpring(category);
        return "index";
    }

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}  