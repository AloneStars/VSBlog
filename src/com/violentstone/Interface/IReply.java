package com.violentstone.Interface;

import java.util.List;

import com.violentstone.entity.reply.Reply;

public interface IReply {
	
    /**
     * 添加回复
     * @param comId
     * @param reply
     */
	public void addReply( Reply reply);
	
	/**
	 * 删除回复通过回复Id
	 * @param rlyId 回复Id
	 */
	public void delReplyByRly(int rlyId);
	
	/**
	 * 删除回复通过平论Id
	 * @param comId 评论Id
	 */
	public void delReplyByCom(int comId);
	
	/**
	 * 修改回复
	 * @param reply
	 */
	public void updateReply(Reply reply);
	
	/**
	 * 查询回复By RlyId
	 * @param rlyId 回复Id
	 * @return Reply
	 */
	public Reply queryReplyByRly(int rlyId);
	
	/**
	 * 查询所有回复By ComId
	 * @param comId 评论Id
	 * @return Reply
	 */
	public List<Reply> queryReplyByCom(int comId);

}
