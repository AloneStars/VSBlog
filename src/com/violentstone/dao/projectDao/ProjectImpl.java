package com.violentstone.dao.projectDao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IComment;
import com.violentstone.Interface.IProject;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.project.Project;

public class ProjectImpl extends DBAccess implements IProject {

	/**
	 * 添加项目
	 */
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
        SqlSession sqlSession = null;
        try {
			sqlSession = this.getSqlSession();
			
			IProject iproject = sqlSession.getMapper(IProject.class);
			
			iproject.addProject(project);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
	}

	/**
	 * 删出项目
	 */
	@Override
	public void delProject(int proId) {
		// TODO Auto-generated method stub
        SqlSession sqlSession = null;
        
        try {
			sqlSession = this.getSqlSession();
			
			IProject iproject = sqlSession.getMapper(IProject.class);
			
			iproject.delProject(proId);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
	}

	/**
	 * 修改项目
	 */
	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
        SqlSession sqlSession = null;
        
        try {
			sqlSession = this.getSqlSession();
			
			IProject iproject = sqlSession.getMapper(IProject.class);
			
			iproject.updateProject(project);
			
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
	}

	/**
	 * 查询单个项目
	 */
	@Override
	public Project queryProject(int proId) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = null;
		
		Project project = null;
		
		try {
			sqlSession = this.getSqlSession();
			
			IProject iproject = sqlSession.getMapper(IProject.class);
			
			project = iproject.queryProject(proId);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return project;
		
	}

	/**
	 * 查询所有项目
	 */
	@Override
	public List<Project> queryAllProject() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = null;
		List<Project> projectList = null;
		try {
			sqlSession = this.getSqlSession();
			
			IProject iproject = sqlSession.getMapper(IProject.class);
			
			projectList = iproject.queryAllProject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession !=  null){
				sqlSession.close();
			}
		}
		
		return projectList;
	}
	
	public static void main(String[] args) {
		
		ProjectImpl pi = new ProjectImpl();
		
		/*Project project = pi.queryProject(1);
		System.out.println(project.toString());*/
		
		/*List<Project> projectList = pi.queryAllProject();
		
		for (Project project : projectList) {
			System.out.println(project.toString());
		}*/
		
		Project project = new Project();
		project.setProName("校园团体展示平台");
		project.setProImage("gdp.jpg");
		project.setProType(2);
		project.setProDec("introduce");
		project.setProSrc("www.violentstone.com/gdp");
		
		pi.addProject(project);
		project.setProId(6);
		project.setProDec("这是一个校园展示的平台，可以加强校园团体之间的交流，目前搁置，但迟早会完成。");
		pi.updateProject(project);
		
		/*pi.delProject(3);*/
	}

}
