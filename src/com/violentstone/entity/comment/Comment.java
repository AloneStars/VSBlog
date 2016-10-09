package com.violentstone.entity.comment;

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

	public void setEamil(String email) {
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
	
	/*****************toString************************/
    
	@Override
	public String toString() {
		return "Comment [comId=" + comId + ", questioner=" + questioner
				+ ", email=" + email + ", questionDate=" + questionDate
				+ ", questionContent=" + questionContent + ", blogId=" + blogId
				+ "]";
	}
	
	
}
