package com.niit.portalbackend;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.portalbackend.dao.BlogDao;
import com.niit.portalbackend.dao.PortalUserDao;


public class BlogTestCase {
	
	AnnotationConfigApplicationContext context;
	PortalUserDao portalUserDao;
	portal_user user;
	BlogDao blogDao;
	Blog blog;

	@Before
	public void init() {
		context =  new AnnotationConfigApplicationContext();;
		context.scan("com.niit");
		context.refresh();
		portalUserDao = (PortalUserDao) context.getBean("portalUserDao");
		blogDao = (BlogDao) context.getBean("blogDao");
		blog = new Blog();
	}
	
	/*@Test
	public void addBlogTest()
	{
		blog.setBlogName("JavaScript");
		blog.setBlogDescription("JavaScript is used to develop frontend");
		blog.setApproved(false);
		blog.setBlogDate(new Date());
		blog.setLikes(0);
		blog.setUser(portalUserDao.getUserByUsername("hansh"));
		
		Assert.assertEquals("Blog added",true, blogDao.addBlog(blog));
		
	}*/
	
	/*@Test
	public void updateBlogTest()
	{
		blog = blogDao.getblogById(1);
		blog.setApproved(true);
		
		Assert.assertEquals("Blog updated",true, blogDao.updateBlog(blog));
		
	}*/
	
	@Test
	public void getAllBlogsTest()
	{
		List<Blog> blogs = blogDao.getAllBlogs();
		for(int i =0; i<blogs.size();i++)
		{
			Blog singleBlog = blogs.get(i);
			System.out.println(singleBlog.getBlogName()+ "  "+singleBlog.getBlogDescription());
		}
	}

}

