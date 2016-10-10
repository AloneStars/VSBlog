package com.violentstone.servlet.CommentServlet;

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
import com.violentstone.entity.comment.Comment;
import com.violentstone.service.BlogService.BlogService;
import com.violentstone.service.BlogService.BlogServiceFactory;
import com.violentstone.service.CommentService.CommentService;
import com.violentstone.service.CommentService.CommentServiceFactory;


public class QueryCommentByBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryCommentByBlogServlet() {
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
        
        CommentService CS = CommentServiceFactory.getCommentService();
		
		int blogId = Integer.valueOf(request.getParameter("blogId"));
		
		BlogService BS = BlogServiceFactory.getBlogService();
		Blog blog = BS.queryBlog(blogId);
		
		if(blog!=null){			
			
			List<Comment> commentList = CS.queryCommentByBlog(blogId);
			
			JSONArray jsa = new JSONArray();
			
			for (Comment comment : commentList) {
				
				JSONObject js = JSONObject.fromObject(comment);
				
				jsa.add(js);
			}
			
			pw.print(jsa.toString());
			
			pw.close();
			
		}else{
			
			pw.print("参数错误");
			
			pw.close();
			
		}
	}

}
