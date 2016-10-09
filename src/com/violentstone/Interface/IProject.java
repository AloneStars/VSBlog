package com.violentstone.Interface;

import java.util.List;

import com.violentstone.entity.project.Project;

public interface IProject {

	/**
	 * 添加项目
	 * @param project
	 */
	public void addProject(Project project);
	
    /**
     * 删除项目
     * @param proId
     */
	public void delProject(int proId);
	
	/**
	 * 更新项目
	 * @param project
	 */
	public void updateProject(Project project);
	
	/**
	 * 查询项目
	 * @param proId
	 * @return Project
	 */
	public Project queryProject(int proId);
	
	/**
	 * 查询所有项目
	 * @return List<Project>
	 */
	public List<Project> queryAllProject();
	
}
