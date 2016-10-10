package com.violentstone.service.ReplyService;

import java.util.List;

import com.violentstone.Interface.IReply;
import com.violentstone.dao.replyDao.ReplyImpl;
import com.violentstone.entity.reply.Reply;

public class ReplyService implements IReply{

	ReplyImpl RI = new ReplyImpl();
	
	@Override
	public void addReply(Reply reply) {
		// TODO Auto-generated method stub
		RI.addReply(reply);
	}

	@Override
	public void delReplyByRly(int rlyId) {
		// TODO Auto-generated method stub
		RI.delReplyByRly(rlyId);
	}

	@Override
	public void delReplyByCom(int comId) {
		// TODO Auto-generated method stub
		RI.delReplyByCom(comId);
	}

	@Override
	public void updateReply(Reply reply) {
		// TODO Auto-generated method stub
		RI.updateReply(reply);
	}

	@Override
	public Reply queryReplyByRly(int rlyId) {
		// TODO Auto-generated method stub
		return RI.queryReplyByRly(rlyId);
	}

	@Override
	public List<Reply> queryReplyByCom(int comId) {
		// TODO Auto-generated method stub
		return RI.queryReplyByCom(comId);
	}

}
