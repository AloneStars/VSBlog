package com.violentstone.service.CommentService;

public class CommentServiceFactory {
	
	static CommentService commentService = null;
	
	static{
		
		commentService = new CommentService();
		
	}
	
	public static CommentService getCommentService(){
		
        if(commentService == null){
			
			commentService = new CommentService();
			
		}
		
		return commentService;
		
	}

}
