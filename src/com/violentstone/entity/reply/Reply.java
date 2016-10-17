package com.violentstone.entity.reply;

public class Reply {

	//回复Id
	private int rlyId;
	
	//回复人
	private String answer;
	
	//回复日期
	private String answerDate;
	
	//回复内容
	private String answerContent;
	
	//评论id
	private int comId;


	/*******************setter and getter****************/
	
	public int getRlyId() {
		return rlyId;
	}

	public void setRlyId(int rlyId) {
		this.rlyId = rlyId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public int getComtId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	
	/*******************toString*************/
	
	@Override
	public String toString() {
		return "Reply [rlyId=" + rlyId + ", answer=" + answer + ", answerDate="
				+ answerDate + ", answerContent=" + answerContent
				+ ", commentId=" + comId + "]";
	}
	
	
	
	
}
