package com.violentstone.entity.blog;

import java.util.List;

import com.violentstone.entity.comment.Comment;

public class Blog {
	
	//博文Id
	private int blogId;
	
	//博文图片(多个图片使用,分割)
	private String blogImg;
	
	//博文标题
	private String blogTitle;
	
	//博文日期(日期:January 31, 2014)
	private String publishDate;
	
	//博文作者
	private String author;
	
	//博文标签(多个标签,分割)
	private String tag;
	
	//博文内容
	private String blogContent;
	
	//评论列表
	private List<Comment>  CommentList;

	
	/***************************setter and getter*******************/
	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogImg() {
		return blogImg;
	}

	public void setBlogImg(String blogImg) {
		this.blogImg = blogImg;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}	
	
	public List<Comment> getCommentList() {
		return CommentList;
	}

	public void setCommentList(List<Comment> commentList) {
		CommentList = commentList;
	}

	/****************************toString**********************/
	
	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogImg=" + blogImg
				+ ", blogTitle=" + blogTitle + ", publishDate=" + publishDate
				+ ", author=" + author + ", tag=" + tag + ", blogContent="
				+ blogContent + "]";
	}
	
}
