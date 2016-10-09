package com.violentstone.dao.userDao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.violentstone.Interface.IUser;
import com.violentstone.Util.DBAccess;
import com.violentstone.entity.user.User;

public class UserImpl extends DBAccess implements IUser {

	
	/**
	 * 验证用户
	 */
	@Override
	public User checkUser() {
	    
		SqlSession sqlSession = null;
		
		User user = new User();
		
		try {
			sqlSession = this.getSqlSession();
			 
			user = sqlSession.selectOne("User.CheckUser");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return user;
				
	}
	
	public static void main(String[] args) {
		UserImpl ui = new UserImpl();
		User user =  ui.checkUser();
		if(user != null)
		System.out.println(user.toString());
	}
	
}
