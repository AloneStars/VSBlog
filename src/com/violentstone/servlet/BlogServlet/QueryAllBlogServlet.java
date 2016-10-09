package com.violentstone.servlet.BlogServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.violentstone.entity.blog.Blog;
import com.violentstone.service.BlogService.BlogService;
import com.violentstone.service.BlogService.BlogServiceFactory;

public class QueryAllBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryAllBlogServlet() {
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
		
		BlogService BS = BlogServiceFactory.getBlogService();
		
		List<Blog> blogList = BS.queryAllBlog();
		
		JSONArray jsa = new JSONArray();
		
		for (Blog blog : blogList) {
			
			JSONObject js = JSONObject.fromObject(blog);
			
			jsa.add(js);
			
		}
	
		pw.print(jsa.toString());
		
	}

}
