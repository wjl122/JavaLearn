package Welocome;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
public class ConnectionDemo {
	// ����MYSQL���ݿ�����
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";;
	// ���ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/Datacenter";
	// �û�
	public static final String DBUSER = "root";

	// ����
	public static final String DBPWD = "123456";
	Connection con = null;
	public String sql="";
	public ConnectionDemo(String sql) {
      this.sql=sql;
	}
	
	public ConnectionDemo(){
		
	}
     /*
      * ������
      */
	public void Connection() {		
		try {
			Class.forName(DBDRIVER);// ��������
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
	 * �ر�����
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
