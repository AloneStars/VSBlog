package com.violentstone.servlet.ReplyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.entity.comment.Comment;
import com.violentstone.service.CommentService.CommentService;
import com.violentstone.service.CommentService.CommentServiceFactory;
import com.violentstone.service.ReplyService.ReplyService;
import com.violentstone.service.ReplyService.ReplyServiceFactory;

public class DelReplyByComServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelReplyByComServlet() {
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
		
		int comId = Integer.valueOf(request.getParameter("comId"));
		
		CommentService CS = CommentServiceFactory.getCommentService();
		
		Comment comment  = CS.queryCommentByCom(comId);
		
		if(comment != null){
			
			ReplyService RS = ReplyServiceFactory.getReplyService();
			
			RS.delReplyByCom(comId);
			
            pw.print("200");
			
			pw.close();
			
		}else{
			
			pw.print("参数错误");
			
			pw.close();
		}
		
	}

}
