package com.violentstone.servlet.ReplyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.DateUtil;
import com.violentstone.Util.format;

import com.violentstone.entity.reply.Reply;
import com.violentstone.entity.reply.ReplyFactory;

import com.violentstone.service.ReplyService.ReplyService;
import com.violentstone.service.ReplyService.ReplyServiceFactory;

public class UpdateReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateReplyServlet() {
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
			
		    int rlyId = Integer.valueOf(request.getParameter("rlyId"));
			String answer = request.getParameter("answer");
			String answerDate = DateUtil.getDataString();
			String answerContent = request.getParameter("answer_content");
			int comId = Integer.valueOf(request.getParameter("comId"));
			
			ReplyService RS = ReplyServiceFactory.getReplyService();
			
	        Reply reply = RS.queryReplyByRly(rlyId);
			
			if(format.checkAllString(answer,answerDate,answerContent)&&reply!=null){
								
				
				reply = ReplyFactory.getReply(answer, answerDate, answerContent, comId,rlyId);
				
				RS.updateReply(reply);
				
				pw.print("200");
				
				pw.close();
				
			}else{
				
				pw.print("参数错误");
				
				pw.close();
				
			}
	}

}
