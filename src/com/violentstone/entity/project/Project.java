package com.violentstone.entity.project;

public class Project {
	
	//项目Id
	private int proId;
	
	//项目名
	private String proName;
	
	//项目图片
	private String proImage;
	
	//项目类型(0~3)
	private int proType;
	
	//项目描述
	private String proDec;
	
	//项目链接
	private String proSrc;
	
	/***********************setter and getter**************/
	
	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProImage() {
		return proImage;
	}

	public void setProImage(String proImage) {
		this.proImage = proImage;
	}

	public int getProType() {
		return proType;
	}

	public void setProType(int proType) {
		this.proType = proType;
	}

	public String getProDec() {
		return proDec;
	}

	public void setProDec(String proDec) {
		this.proDec = proDec;
	}

	public String getProSrc() {
		return proSrc;
	}

	public void setProSrc(String proSrc) {
		this.proSrc = proSrc;
	}
	
	/********************toString**********************/
	
	@Override
	public String toString() {
		return "Project [proId=" + proId + ", proName=" + proName
				+ ", proImage=" + proImage + ", proType=" + proType
				+ ", proDec=" + proDec + ", proSrc=" + proSrc + "]";
	}
	
}
