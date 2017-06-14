package com.ssh.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.hibernate.HibernateSessionFactory;
import com.ssh.model.Category;
import com.ssh.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	/*Spring和Hibernate整个后*/
    private SessionFactory sessionFactory; //定义一个sessionFactory  
    
    /**
     * Hibernate没有和Spring整合的save方法
     */
    @Override //没有和Spring整合的情况 
    public void save(Category category) {  
        //通过刚刚生成的sessionFactory获取session  
        Session session = HibernateSessionFactory.getSession();  
        try {  
            //手动事务 
            session.getTransaction().begin();
            //执行业务逻辑 
            session.save(category);
            //手动提交  
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

    /**
     * @doc Hibernate和Spring整合后的方法update
     */
	@Override	//Spring和Hibernate整合后的情况
	public void update(Category category) {
		getSession().update(category);
	}
	
	/**
     * Hibernate和Spring整合后的方法Save方法
     */
	@Override
	public void saveHibernateAndSpring(Category category){
		getSession().save(category);
	}
	
    //当需要使用sessoinFactory的时候，Spring会将sessionFactory注入进来  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }
    
    protected Session getSession() {  
        return sessionFactory.getCurrentSession();
    }
	
}