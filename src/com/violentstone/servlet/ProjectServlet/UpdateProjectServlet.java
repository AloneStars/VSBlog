package com.violentstone.servlet.ProjectServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.violentstone.Util.format;
import com.violentstone.entity.project.Project;
import com.violentstone.entity.project.ProjectFactory;
import com.violentstone.service.ProjectService.ProjectService;
import com.violentstone.service.ProjectService.ProjectServiceFactory;

public class UpdateProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProjectServlet() {
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
        
        ProjectService ps = ProjectServiceFactory.getProjectService();
		
        int proId = Integer.valueOf(request.getParameter("proId"));
		String proName = request.getParameter("proName");
		String proImages = request.getParameter("proImages");
		int proType = Integer.valueOf(request.getParameter("proType"));
		String proDec = request.getParameter("proDec");
		String proSrc =  request.getParameter("proSrc");
		
		Project project = ps.queryProject(proId);
		
		if(format.checkAllString(proName,proImages,proDec,proSrc)&&(proType>=0&&proType<=3)&&(project!=null)){
			
			project = ProjectFactory.getProject(proName, proImages, proType, proDec, proSrc, proId);		
			
			ps.updateProject(project);
			
			pw.print("200");
			
			pw.close();
			
			//System.out.println(project.toString());
			
		}else{
			
			pw.print("参数不正确");
			pw.close();
			
		}
	    
	}

}
