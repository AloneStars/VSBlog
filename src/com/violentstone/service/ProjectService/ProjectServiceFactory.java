package com.violentstone.service.ProjectService;

public class ProjectServiceFactory {

	static ProjectService projectService = null;
	
	static{
		projectService = new ProjectService();
	}
	
	public static ProjectService getProjectService(){
		
		if(projectService == null)
			projectService = new ProjectService();
		
		return projectService;
	}
}
