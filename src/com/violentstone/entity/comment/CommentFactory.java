package com.violentstone.entity.comment;

import java.util.ArrayList;

import com.violentstone.entity.reply.Reply;

public class CommentFactory {
	
	static Comment comment = null;
	
	static{
		comment = new Comment();
	}
	
	public static Comment getComment(String questioner,String email,String questionDate,String questionContent,int blogId,int... comId){
		
		if(comment == null)			
			comment = new Comment();

		comment.setQuestioner(questioner);
		comment.setEmail(email);
		comment.setQuestionDate(questionDate);
		comment.setQuestionContent(questionContent);
		comment.setReplyList(new ArrayList<Reply>());
		comment.setBlogId(blogId);
				
		if(comId.length == 1)
			comment.setComId(comId[0]);
				
		return comment;		
	}

}
