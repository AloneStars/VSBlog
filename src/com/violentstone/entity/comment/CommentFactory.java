package com.violentstone.entity.comment;

public class CommentFactory {
	
	static Comment comment = null;
	
	static{
		comment = new Comment();
	}
	
	public static Comment getComment(String questioner,String email,String questionDate,String questionContent,int blogId,int... comId){
		
		if(comment == null)			
			comment = new Comment();

		comment.setQuestioner(questioner);
		comment.setEamil(email);
		comment.setQuestionDate(questionDate);
		comment.setQuestionContent(questionContent);
		comment.setBlogId(blogId);
		
		if(comId.length == 1)
			comment.setComId(comId[0]);
		
		
		return comment;		
	}

}
