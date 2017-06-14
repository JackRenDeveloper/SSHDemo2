package com.ssh.service;

import com.ssh.model.Category;

public interface CategoryService {
	/**
     * @Description Hibernate和Spring没有整合后的方法save
     */
    public void save(Category category); //用来测试Hibernate环境
    /**
     * @Description Hibernate和Spring整合后的方法update
     */
    public void update(Category category); //用来测试Spring和Hibernate整合后 
    /**
     * @Description Hibernate和Spring整合后的方法save方法
     */
    public void saveHibernateAndSpring(Category category);
}  