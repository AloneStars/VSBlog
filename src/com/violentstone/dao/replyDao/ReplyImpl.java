package com.violentstone.dao.replyDao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IReply;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.comment.Comment;
import com.violentstone.entity.reply.Reply;

public class ReplyImpl extends DBAccess implements IReply {

	@Override
	public void addReply(Reply reply) {
        
		SqlSession sqlSession = null;
		
		try {
			sqlSession  = this.getSqlSession();
			
			sqlSession.insert("Reply.AddReply",reply);
			
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
	public void delReplyByRly(int rlyId) {

       SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.delete("Reply.DelReplyByRly", rlyId);
			
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
	public void delReplyByCom(int comId) {
        
		SqlSession sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.delete("Reply.DelReplyByCom", comId);
			
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
	public void updateReply(Reply reply) {
        
		SqlSession  sqlSession = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			sqlSession.update("Reply.UpdateReply", reply);
			
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
	public Reply queryReplyByRly(int rlyId) {
        
		SqlSession sqlSession = null;
		
		Reply reply = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			reply = sqlSession.selectOne("Reply.QueryReplyByRly", rlyId);

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return reply;
	}

	@Override
	public List<Reply> queryReplyByCom(int comId) {
        
		SqlSession sqlSession = null;
		
		List<Reply> replyList = null;
		
		try {
			
			sqlSession = this.getSqlSession();
			
			replyList = sqlSession.selectList("Reply.QueryReplyByCom", comId);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return replyList;
	}

	public static void main(String[] args) {
		
		ReplyImpl ri = new ReplyImpl();
		
		Reply reply = new Reply();
		
		List<Reply> replyList = null;
		
	    /*1.添加回复*/
		/*reply.setAnswer("ViolentSone");
		reply.setAnswerDate("January 31, 2014");
		reply.setAnswerContent("那你BB啥？");
		reply.setComId(4);
		
		ri.addReply(reply);*/
		
		/*2.修改回复*/
		/*reply.setRlyId(3);
		reply.setAnswerContent("那就别BB呗!");
		
		ri.updateReply(reply);*/
		
		/*3.查询单个回复*/
		/*reply = ri.queryReplyByRly(1);
		System.out.println(reply.toString());*/
		
	    /*4.查询多个回复通过ComID*/
		/*replyList = ri.queryReplyByCom(4);
		
		for (Reply reply2 : replyList) {
			System.out.println(reply2.toString());
		}*/
		
		/*5.删除单个回复*/
		/*ri.delReplyByRly(3);*/
		
		/*6.删除多个回复*/
		/*ri.delReplyByCom(4);*/
		
	}
}
