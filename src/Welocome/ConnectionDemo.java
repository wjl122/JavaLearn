package Welocome;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
public class ConnectionDemo {
	// 定义MYSQL数据库驱动
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";;
	// 连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/Datacenter";
	// 用户
	public static final String DBUSER = "root";

	// 密码
	public static final String DBPWD = "123456";
	Connection con = null;
	public String sql="";
	public ConnectionDemo(String sql) {
      this.sql=sql;
	}
	
	public ConnectionDemo(){
		
	}
     /*
      * 打开链接
      */
	public void Connection() {		
		try {
			Class.forName(DBDRIVER);// 加载驱动
		} catch (Exception e) {
			// TODO: handle exceptio
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public ResultSet ExecSql(){
		ResultSet resultSet=null;
		try {
			Connection();
			Statement stm=(Statement)con.createStatement();
			resultSet=stm.executeQuery(this.sql);
			//stm.close();
			//this.Close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultSet;		
	}
	
	/*
	 * 关闭连接
	 */
	public void Close(){
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
