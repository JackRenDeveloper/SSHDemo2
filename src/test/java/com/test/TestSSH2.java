package com.test;
import javax.annotation.Resource;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.hibernate.HibernateSessionFactory;
import com.ssh.model.Category;
import com.ssh.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml") 
public class TestSSH2 {
	
	@Resource  
    private CategoryService categoryService;
	
//	@Test
//	public void hibernateTest(){
//		Category cate = new Category("Tom", false);
//		//通过刚刚生成的sessionFactory获取session  
//        Session session = HibernateSessionFactory.getSession();  
//        try {
//            //手动事务
//            session.getTransaction().begin();
//            //执行业务逻辑  
//            session.save(cate);
//            //手动提交  
//            session.getTransaction().commit();
//        } catch(Exception e) {
//            session.getTransaction().rollback();
//            throw new RuntimeException(e);
//        } finally {
//            HibernateSessionFactory.closeSession();
//        }
//	}
	
	@Test //测试Hibernate和Spring整合后  
    public void hibernateAndSpring() {
		categoryService.update(new Category(4, "123123abcdddd", true)); //categoryService通过Spring从上面注入进来的  
    }
	
	@Test
	public void saveHibernateAndSpring(){
		categoryService.saveHibernateAndSpring(new Category("bcdd14dd", true));
	}
	
}
