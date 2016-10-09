package com.violentstone.entity.project;

public class ProjectFactory {
	
	static Project project = null;
	
	static{
		if(project == null)
		project = new Project();
	}
	
	public static Project getProject(String proName,String proImages,int proType,String proDec,String proSrc){
		
		project.setProName(proName);
		project.setProImage(proImages);
		project.setProType(proType);
		project.setProDec(proDec);
		project.setProSrc(proSrc);
		
		return project;
	}

}
