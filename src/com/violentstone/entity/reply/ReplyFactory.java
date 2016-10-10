package com.violentstone.entity.reply;

public class ReplyFactory {
	
	static Reply reply = null;
	
	static{
		
		reply = new Reply();
		
	}
	
	public static Reply getReply(String answer,String answerDate,String answerContent,int comId,int... rlyId){
		
		if(reply == null)
			reply = new Reply();
		
		reply.setAnswer(answer);
		reply.setAnswerContent(answerContent);
		reply.setAnswerDate(answerDate);
		reply.setComId(comId);
		
		if(rlyId.length == 1)
			reply.setRlyId(rlyId[0]);
		
		return reply;
		
	}

}
