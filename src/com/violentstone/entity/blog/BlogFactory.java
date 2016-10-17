package com.violentstone.entity.blog;

import java.util.ArrayList;

import com.violentstone.entity.comment.Comment;

public class BlogFactory {

	static Blog blog = null;
	
	static{
		blog = new Blog();
	}
	
	public static Blog getBlog(String blogImg,String blogTitle,String publishDate,String author,String tag,String blogContent,int... blogId){
		
		
		if(blog == null)
			blog = new Blog();
		blog.setBlogImg(blogImg);
		blog.setBlogTitle(blogTitle);
		blog.setPublishDate(publishDate);
		blog.setAuthor(author);
		blog.setTag(tag);
		blog.setBlogContent(blogContent);
		blog.setCommentList(new ArrayList<Comment>());
		
		if(blogId.length == 1)
			blog.setBlogId(blogId[0]);
		
		return blog;
	}
}
