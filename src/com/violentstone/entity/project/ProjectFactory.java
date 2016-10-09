package com.violentstone.entity.project;

public class ProjectFactory {
	
	static Project project = null;
	
	static{
		project = new Project();
	}
	
	public static Project getProject(String proName,String proImages,int proType,String proDec,String proSrc,int... proId){
		
		if(project == null)
			project = new Project();
		project.setProName(proName);
		project.setProImage(proImages);
		project.setProType(proType);
		project.setProDec(proDec);
		project.setProSrc(proSrc);
		
		if(proId.length == 1){
			project.setProId(proId[0]);
		}
		
		return project;
				
	}
	
	public static void main(String[] args) {
		
		//System.out.println(getProject("aa", "bb", 3, "cc", "dd").toString());
		
		//System.out.println(getProject("aa", "bb", 3, "cc", "dd",10).toString());
		
	}
	

}
