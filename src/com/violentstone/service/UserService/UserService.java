package com.violentstone.service.UserService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.violentstone.Util.SHA1;
import com.violentstone.dao.userDao.UserImpl;
import com.violentstone.entity.user.User;

public class UserService{
       
	public User LoginService(String order){
		
		Properties prop = new Properties();
		
		InputStream  in = null;
		
		User user = null;
		
		String config = "";
		
		try {
			
			in =getClass().getResourceAsStream("/Order.properties");
			
			prop.load(in);
			
			config  = SHA1.encryptSHA(prop.getProperty("order"));
			
			if(config.equals(order)){
				
				System.out.println("success");
				
				UserImpl UI = new UserImpl();
				
				user = new User();
				
				user = UI.checkUser();
				
				user.setStatue(1);
			}			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return user;
		
	}
	
	public static void main(String[] args) {
		
		UserService us = new UserService();
		
		us.LoginService("d933b39f1a5fd850091fc2f7b1793406d68542e9");
		
	}
	
}
