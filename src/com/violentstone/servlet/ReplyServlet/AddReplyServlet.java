package com.violentstone.servlet.ReplyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.DateUtil;
import com.violentstone.Util.format;
import com.violentstone.entity.comment.Comment;
import com.violentstone.entity.reply.Reply;
import com.violentstone.entity.reply.ReplyFactory;
import com.violentstone.service.CommentService.CommentService;
import com.violentstone.service.CommentService.CommentServiceFactory;
import com.violentstone.service.ReplyService.ReplyService;
import com.violentstone.service.ReplyService.ReplyServiceFactory;

public class AddReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReplyServlet() {
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
		
		String answer = request.getParameter("answer");
		String answerDate = DateUtil.getDataString();
		String answerContent = request.getParameter("answer_content");
		int comId = Integer.valueOf(request.getParameter("comId"));
		
		CommentService CS = CommentServiceFactory.getCommentService();
		
        Comment comment = CS.queryCommentByCom(comId);
		
		if(format.checkAllString(answer,answerDate,answerContent)&&comment!=null){
			
			ReplyService RS = ReplyServiceFactory.getReplyService();
			
			Reply reply = ReplyFactory.getReply(answer, answerDate, answerContent, comId);
			
			RS.addReply(reply);
			
			pw.print("200");
			
			pw.close();
			
		}else{
			
			pw.print("参数错误");
			
			pw.close();
			
		}
	}

}
