package com.violentstone.Util;

import java.io.IOException;
import java.io.Reader;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 访问数据库
 * @author 耀光下的孤星
 */
public class DBAccess {
	
	public SqlSession getSqlSession() throws IOException{
		
		//通过配置文件获取数据库连接信息
		Reader reader = Resources.getResourceAsReader("com/violentstone/config/Configuration.xml");
		
		//通过配置信息构建一个SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		//通过sqlSessionFactory打开一个数据库回话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		return sqlSession;
		
	}

}
