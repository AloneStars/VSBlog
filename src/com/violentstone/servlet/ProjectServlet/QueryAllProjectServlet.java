package com.violentstone.servlet.ProjectServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.groovy.JsonSlurper;

import com.violentstone.entity.project.Project;
import com.violentstone.service.ProjectService.ProjectService;
import com.violentstone.service.ProjectService.ProjectServiceFactory;

/**
 * Servlet implementation class QueryAllProjectServlet
 */
@WebServlet("/QueryAllProjectServlet")
public class QueryAllProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryAllProjectServlet() {
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
		
		List<Project> projectList = ps.queryAllProject();
		
		JSONArray jsa = new JSONArray();
		
		for (Project project : projectList) {
			
			JSONObject js = JSONObject.fromObject(project);
			jsa.add(js);
		}
		
		pw.print(jsa.toString());
		
	}

}
