package com.violentstone.Interface;

import java.util.List;

import com.violentstone.entity.comment.Comment;

public interface IComment {
    
   /**
    * 添加评论
    * @param blogId
    * @param comment
    */
	public void addComment(Comment comment);
	
	/**
	 * 删除博文通过ComId
	 * @param comId
	 */
	public void delCommentByCom(int comId);
	
	/**
	 * 删除博文通过BlogId
	 * @param blogId
	 */
	public void delCommentByBlog(int blogId);
	
	
	/**
	 * 修改博文
	 * @param comment
	 */
	public void updateComment(Comment comment);
	
	/**
	 * 查询博文通过ComId
	 * @param ComId
	 * @return Comment
	 */
	public Comment queryCommentByCom(int comId);
	
	/**
	 * 查询博文通过BlogId
	 * @param BlogId
	 * @return LIst<Comment>
	 */
	public List<Comment> queryCommentByBlog(int blogId);
	
}
