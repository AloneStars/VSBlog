package com.violentstone.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.format;
import com.violentstone.entity.project.Project;
import com.violentstone.entity.project.ProjectFactory;
import com.violentstone.service.ProjectService.ProjectService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProjectServlet() {
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
		
		String proName = request.getParameter("proName");
		String proImages = request.getParameter("proImages");
		int proType = Integer.valueOf(""+request.getParameter("proType"));
		String proDec = request.getParameter("proDec");
		String proSrc =  request.getParameter("proSrc");
		
		if(format.checkAllString(proName,proImages,proDec,proSrc)&&(proType>=0&&proType<=3)){
			
			Project project = ProjectFactory.getProject(proName, proImages, proType, proDec, proSrc);
			
			ProjectService ps = new ProjectService();
			
			ps.addProject(project);
			
			//System.out.println(project.toString());
			
		}else{
			
			pw.print("参数不正确");
			pw.close();
			
		}
	}

}
