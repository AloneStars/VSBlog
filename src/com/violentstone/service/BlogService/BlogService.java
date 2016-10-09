package com.violentstone.service.BlogService;

import java.util.List;

import com.violentstone.Interface.IBlog;
import com.violentstone.dao.blogDao.BlogImpl;
import com.violentstone.entity.blog.Blog;

public class BlogService implements IBlog{

	BlogImpl BI = new BlogImpl();
	
	@Override
	public void addBlog(Blog blog) {
		// TODO Auto-generated method stub
		BI.addBlog(blog);
	}

	@Override
	public void delBlog(int blogId) {
		// TODO Auto-generated method stub
		BI.delBlog(blogId);
	}

	@Override
	public void updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		BI.updateBlog(blog);
	}

	@Override
	public Blog queryBlog(int blogId) {
		// TODO Auto-generated method stub
		return BI.queryBlog(blogId);
	}

	@Override
	public List<Blog> queryAllBlog() {
		// TODO Auto-generated method stub
		return BI.queryAllBlog();
	}

}
