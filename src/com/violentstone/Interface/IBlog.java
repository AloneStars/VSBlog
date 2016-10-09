package com.violentstone.Interface;

import java.util.List;

import com.violentstone.entity.blog.Blog;

public interface IBlog {

	/**
	 * 添加博文
	 * @param blog
	 */
	public void addBlog(Blog blog);
	
	/**
	 * 删除博文
	 * @param blogId
	 */
	public void delBlog(int blogId);
	
	/**
	 * 更新博文
	 * @param blog
	 */
	public void updateBlog(Blog blog);
	
	/**
	 * 查询博文ById
	 * @param blogId
	 * @return
	 */
	public Blog queryBlog(int blogId);
	
	/**
	 * 查询所有博文
	 * @return List<Blog>
	 */	
	public List<Blog> queryAllBlog();
	
}
