package com.violentstone.servlet.ReplyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import net.sf.json.JSONObject;

import com.violentstone.entity.reply.Reply;
import com.violentstone.service.ReplyService.ReplyService;
import com.violentstone.service.ReplyService.ReplyServiceFactory;


public class QueryReplyByRlyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryReplyByRlyServlet() {
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
        
        ReplyService RS = ReplyServiceFactory.getReplyService();
        
        
        int rlyId = Integer.valueOf(request.getParameter("rlyId"));
		
		Reply reply  = RS.queryReplyByRly(rlyId);
			
		JSONObject js = JSONObject.fromObject(reply);
						
		pw.print(js.toString());
			
		pw.close();
			
	}

}
