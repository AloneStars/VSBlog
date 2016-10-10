package com.violentstone.servlet.CommentServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.DateUtil;
import com.violentstone.Util.format;
import com.violentstone.entity.comment.Comment;
import com.violentstone.entity.comment.CommentFactory;
import com.violentstone.service.CommentService.CommentService;
import com.violentstone.service.CommentService.CommentServiceFactory;

public class UpdateCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCommentServlet() {
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
		
		String questioner = request.getParameter("ques_er");
		String email = request.getParameter("email");
		String questionDate = DateUtil.getDataString();
		String questionContent = request.getParameter("ques_content");
		int blogId = Integer.valueOf(request.getParameter("blogId"));
		int comId = Integer.valueOf(request.getParameter("comId"));
		
		Comment comment = CS.queryCommentByCom(comId);
		
		if(format.checkAllString(questioner,email,questionDate,questionContent)&&(comment!=null)){			
			
			comment = CommentFactory.getComment(questioner, email, questionDate, questionContent, blogId,comId);
			
			CS.updateComment(comment);
			
			pw.print("200");
			
			pw.close();
			
		}else{
			
			pw.print("参数错误");
			
			pw.close();
			
		}
	}

}
