package com.violentstone.dao.commentDao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IComment;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.comment.Comment;

public class CommentImpl extends DBAccess implements IComment {

	@Override
	public void addComment(Comment comment) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession  = this.getSqlSession();
			
			sqlSession.insert("Comment.AddComment",comment);
			
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
	public void delCommentByCom(int comId) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.delete("Comment.DelCommentByCom", comId);
			
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
	public void delCommentByBlog(int blogId) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.delete("Comment.DelCommentByBlog", blogId);
			
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
	public void updateComment(Comment comment) {
		
		SqlSession  sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.update("Comment.UpdateComment", comment);
			
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
	public Comment queryCommentByCom(int comId) {
		
		SqlSession sqlSession = null;
		
		Comment comment = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			comment = sqlSession.selectOne("Comment.QueryCommentByCom", comId);

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return comment;
	}

	@Override
	public List<Comment> queryCommentByBlog(int blogId) {

		SqlSession sqlSession = null;
		
		List<Comment> commentList = null;
		
		try {
			
			sqlSession = this.getSqlSession();
			
			commentList = sqlSession.selectList("Comment.QueryCommentByBlog", blogId);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return commentList;
	}
	
	public static void main(String[] args) {
		
		CommentImpl  ci = new CommentImpl();
		
		Comment comment = new Comment();
		
		/*1.添加评论*/
		/*comment.setQuestioner("耀光下的孤星");
		comment.setQuestionDate("January 31, 2014");
		comment.setQuestionContent("该说点啥了");
		comment.setEamil("1138494584@qq.com");
		comment.setBlogId(1);
		
		ci.addComment(comment);*/
		
		/*2.查询评论*/
		/*comment = ci.queryCommentByCom(1);
		System.out.println(comment);*/
		
		//3.修改平论
		/*comment.setQuestioner("耀光下的孤星");
		comment.setQuestionDate("January 31, 2014");
		comment.setQuestionContent("该说点啥了");
		comment.setEamil("1138494584@qq.com");
		comment.setBlogId(1);
		
		ci.addComment(comment);
		
		comment.setComId(7);
		comment.setQuestionContent("随便说点啥吧!");
		ci.updateComment(comment);*/
		
		/*4.查询评论通过BlogId*/
		/*List<Comment> commentList = ci.queryCommentByBlog(1);
		
		for (Comment comment2 : commentList) {
			System.out.println(comment2.toString());
		}*/
		
		/*5.删除一个评论*/
		/*ci.delCommentByCom(6);*/
		
		/*6.删除博客的所有评论*/
		/*ci.delCommentByBlog(1);*/
		
	}

}
