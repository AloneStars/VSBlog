package com.violentstone.entity.comment;

import java.util.List;

import com.violentstone.entity.reply.Reply;

public class Comment {
	
	//评论id
	private int comId;
	
	//评论人
	private String questioner;
	
	//邮件
	private String email;
	
	//评论日期
	private String questionDate;
	
	//评论内容
	private String questionContent;
	
	//博文id
	private int blogId;
	
	//回复列表
	private List<Reply> replyList;
	
	/*******************setter and getter****************/

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public String getQuestioner() {
		return questioner;
	}

	public void setQuestioner(String questioner) {
		this.questioner = questioner;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
		
	public List<Reply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}

	/*****************toString************************/
    
	@Override
	public String toString() {
		return "Comment [comId=" + comId + ", questioner=" + questioner
				+ ", email=" + email + ", questionDate=" + questionDate
				+ ", questionContent=" + questionContent + ", blogId=" + blogId
				+ "]";
	}
	
	
}
