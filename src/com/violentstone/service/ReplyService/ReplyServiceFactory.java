package com.violentstone.service.ReplyService;

public class ReplyServiceFactory {

	static ReplyService replyService = null;
	
	static{
		replyService = new ReplyService();
	}
	
	public static ReplyService getReplyService(){
		
		if(replyService == null)
			replyService = new ReplyService();
		
		return replyService;
		
	}
	
}
