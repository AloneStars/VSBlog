package com.violentstone.dao.blogDao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IBlog;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.blog.Blog;

public class BlogImpl extends DBAccess implements IBlog {

	@Override
	public void addBlog(Blog blog) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.insert("Blog.AddBlog", blog);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}

	}

	@Override
	public void delBlog(int blogId) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.delete("Blog.DelBlog", blogId);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
      
	}

	@Override
	public void updateBlog(Blog blog) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.update("Blog.UpdateBlog", blog);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		

	}

	@Override
	public Blog queryBlog(int blogId) {
		
		SqlSession sqlSession = null;
		
		Blog blog = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			blog = sqlSession.selectOne("Blog.QueryBlog", blogId);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return blog;
	}

	@Override
	public List<Blog> queryAllBlog() {
		
		SqlSession sqlSession = null;
		
		List<Blog> blogList = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			blogList = sqlSession.selectList("Blog.QueryAllBlog");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
				
		return blogList;
	}
	
	public static void main(String[] args) {
		
		BlogImpl bi = new BlogImpl();
		
		Blog blog = new Blog();
		
		List<Blog> blogList = null;
		
		/*1.添加博客*/
		/*blog.setBlogImg("images/blog/blog-1.jpg,images/blog/blog-2.jpg,images/blog/blog-3.jpg");
		blog.setBlogTitle("论java中“==”与equals的区别");
		blog.setPublishDate("January 31, 2014");
		blog.setAuthor("ViolentStone");
		blog.setTag("java");
		blog.setBlogContent("我咋知道吗？你又没告诉我");
		
		bi.addBlog(blog);*/
		
		/*2.查询单个博文*/
		/*blog = bi.queryBlog(1);
		System.out.println(blog.toString());*/
		
		/*3.修改博文信息*/
		/*blog.setBlogId(2);
		blog.setBlogImg("images/blog/blog-1.jpg,images/blog/blog-2.jpg,images/blog/blog-3.jpg");
		blog.setBlogTitle("论java中“==”与equals的区别");
		blog.setPublishDate("January 31, 2014");
		blog.setAuthor("ViolentStone");
		blog.setTag("java web");
		blog.setBlogContent("java中的equals方法和“==”的功能十分的相似，但是二者有很明显的不同。");
		
		bi.updateBlog(blog);*/
		
		/*4.查询所有的博文信息*/
		/*blogList = bi.queryAllBlog();
		
		for (Blog blog2 : blogList) {
			System.out.println(blog2.toString());
		}*/
		
		/*5.删除博文*/
		bi.delBlog(2);
		
	}

}
