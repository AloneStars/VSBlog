package com.violentstone.service.CommentService;

import java.util.List;

import com.violentstone.Interface.IComment;
import com.violentstone.dao.commentDao.CommentImpl;
import com.violentstone.entity.comment.Comment;

public class CommentService implements IComment {

	CommentImpl CI = new CommentImpl();
	
	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		CI.addComment(comment);
	}

	@Override
	public void delCommentByCom(int comId) {
		// TODO Auto-generated method stub
		CI.delCommentByCom(comId);
	}

	@Override
	public void delCommentByBlog(int blogId) {
		// TODO Auto-generated method stub
		CI.delCommentByBlog(blogId);
	}

	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		CI.updateComment(comment);
	}

	@Override
	public Comment queryCommentByCom(int comId) {
		// TODO Auto-generated method stub
		return CI.queryCommentByCom(comId);
	}

	@Override
	public List<Comment> queryCommentByBlog(int blogId) {
		// TODO Auto-generated method stub
		return CI.queryCommentByBlog(blogId);
	}

}
