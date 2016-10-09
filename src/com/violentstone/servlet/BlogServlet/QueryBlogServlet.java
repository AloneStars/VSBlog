package com.violentstone.servlet.BlogServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.violentstone.entity.blog.Blog;
import com.violentstone.service.BlogService.BlogService;
import com.violentstone.service.BlogService.BlogServiceFactory;


public class QueryBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryBlogServlet() {
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
		
		BlogService BS = BlogServiceFactory.getBlogService();
		
		Blog blog = BS.queryBlog(blogId);
		
		JSONObject js = JSONObject.fromObject(blog);
		
		pw.print(js.toString());
		
	}

}
