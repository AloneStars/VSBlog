package com.violentstone.servlet.ProjectServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.service.ProjectService.ProjectService;
import com.violentstone.service.ProjectService.ProjectServiceFactory;

/**
 * Servlet implementation class DelProjectServlet
 */
@WebServlet("/DelProjectServlet")
public class DelProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelProjectServlet() {
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
		
		int proId = Integer.valueOf(request.getParameter("proId"));
		
		ProjectService ps = ProjectServiceFactory.getProjectService();
		
		ps.delProject(proId);
		
		pw.print("200");
	}

}
