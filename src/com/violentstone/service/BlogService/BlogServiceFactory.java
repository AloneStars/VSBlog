package com.violentstone.service.BlogService;

public class BlogServiceFactory {
	
	static BlogService blogService = null;
	
	static{
		
		blogService = new BlogService();
		
	}
	
	public static BlogService getBlogService(){
		
		if(blogService == null)
			blogService = new BlogService();
		
		return blogService;
		
	}

}
