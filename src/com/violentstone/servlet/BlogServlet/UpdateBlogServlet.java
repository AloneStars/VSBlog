package com.violentstone.servlet.BlogServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.DateUtil;
import com.violentstone.Util.format;
import com.violentstone.entity.blog.Blog;
import com.violentstone.entity.blog.BlogFactory;
import com.violentstone.service.BlogService.BlogService;
import com.violentstone.service.BlogService.BlogServiceFactory;


public class UpdateBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBlogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter pw = response.getWriter();
		
        int blogId = Integer.valueOf(request.getParameter("blogId"));
		String blogImg = request.getParameter("blogImg");
		String blogTitle = request.getParameter("blogTitle");
		String publishDate = DateUtil.getDataString();
		String author = request.getParameter("author");
		String tag = request.getParameter("tag");
		String blogContent = request.getParameter("BC");
		
		if(format.checkAllString(blogImg,blogTitle,publishDate,author,tag,blogContent)){
			
			Blog blog = BlogFactory.getBlog(blogImg, blogTitle, publishDate, author, tag, blogContent, blogId);
			
			BlogService BS = BlogServiceFactory.getBlogService();
			
			BS.updateBlog(blog);
			
			pw.print("200");
			pw.close();
			
		}else{
			
			pw.print("参数错误");
			pw.close();
		
		}
		
	}

}
