package com.violentstone.service.ProjectService;

import java.util.List;

import com.violentstone.Interface.IProject;
import com.violentstone.dao.projectDao.ProjectImpl;
import com.violentstone.entity.project.Project;

public class ProjectService implements IProject{

	ProjectImpl PI = new ProjectImpl();
	
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		PI.addProject(project);
	}

	@Override
	public void delProject(int proId) {
		// TODO Auto-generated method stub
		PI.delProject(proId);
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		PI.updateProject(project);
	}

	@Override
	public Project queryProject(int proId) {
		// TODO Auto-generated method stub		
		return PI.queryProject(proId);
	}

	@Override
	public List<Project> queryAllProject() {
		// TODO Auto-generated method stub
		return PI.queryAllProject();
	}
	
	

}
