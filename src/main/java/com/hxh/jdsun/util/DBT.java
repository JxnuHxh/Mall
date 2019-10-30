package com.hxh.jdsun.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

//测试连数据库
public class DBT {
  static SqlSessionFactory sessionFactory;
  //通过cfg连接数据库
  static{
	  try {
		Reader r=
			  Resources.getResourceAsReader("mybatis.cfg.xml");
	   sessionFactory=new SqlSessionFactoryBuilder().build(r);
	  } catch (IOException e) {
		e.printStackTrace();
	}
  }
  public static SqlSession getSession(){
  	return sessionFactory.openSession();
  }
 public static void main(String[] args) {
  	System.out.println(getSession());
}
}
