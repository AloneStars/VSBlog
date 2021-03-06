package com.violentstone.dao.blogDao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IBlog;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.blog.Blog;
import com.violentstone.entity.comment.Comment;
import com.violentstone.entity.reply.Reply;

public class BlogImpl extends DBAccess implements IBlog {

	@Override
	public void addBlog(Blog blog) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			IBlog iblog = sqlSession.getMapper(IBlog.class);
			
			iblog.addBlog(blog);
			
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
			
			IBlog iblog = sqlSession.getMapper(IBlog.class);
			
			iblog.delBlog(blogId);
			
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
			
			IBlog iblog = sqlSession.getMapper(IBlog.class);
			
			iblog.updateBlog(blog);
			
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
			
			IBlog iblog = sqlSession.getMapper(IBlog.class);
			
			blog = iblog.queryBlog(blogId);
			
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
			
			IBlog iblog = sqlSession.getMapper(IBlog.class);
			
			blogList = iblog.queryAllBlog();
			
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
	
/*	@Override
	public List<Blog> queryDetails(int blogId) {
		// TODO Auto-generated method stub
        SqlSession sqlSession = null;
		
		List<Blog> blogList = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			blogList = sqlSession.selectList("Blog.QueryDetails",blogId);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return blogList;
				
	}*/
	
	public static void main(String[] args) {
		
		BlogImpl bi = new BlogImpl();
		
		Blog blog = new Blog();
		
		List<Blog> blogList = null;
		
/*		List<Comment> commentList = null;
		
		List<Reply> replyList = null;
		
		
		blogList = bi.queryDetails(1);
		
		for (Blog blog2 : blogList) {
			
			System.out.println(blog2.toString());
			
			System.out.println("该博客评论总数:"+blog2.getCommentList().size());
			
			commentList = blog2.getCommentList();
			
			for (Comment comment : commentList) {
				
				System.out.println(comment.toString());
				
				System.out.println("该评论回复总数:"+comment.getReplyList().size());
				
				replyList = comment.getReplyList();
				
				for (Reply reply : replyList) {
					
					System.out.println("回复类容:"+reply.toString());
									
				}
				
			}
			
		}*/
		
		/*1.添加博客*/
		blog.setBlogImg("images/blog/blog-1.jpg,images/blog/blog-2.jpg,images/blog/blog-3.jpg");
		blog.setBlogTitle("论java中“==”与equals的区别");
		blog.setPublishDate("January 31, 2014");
		blog.setAuthor("ViolentStone");
		blog.setTag("java");
		blog.setBlogContent("我咋知道吗？你又没告诉我");
		
		bi.addBlog(blog);
		
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
		/*bi.delBlog(2);*/
		
	}

	

}
