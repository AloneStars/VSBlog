package com.violentstone.Interface;

import com.violentstone.entity.user.User;

public interface IUser {
	
	 /**
	  * 验证登录
	  * @parmar order 口令
	  * return 用户信息
	  */
     public User checkUser();
     
}
