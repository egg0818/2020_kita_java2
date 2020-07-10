package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {

//	public static void main(String[] args) {
//		OracleDAO o = new OracleDAO();
//		try {
//			o.getConn();
//		} catch (Exception e) {
//			System.out.println("오류");
//		}
//
//	}
	
	
	// 싱들톤 패턴! - 스프링땐 안적어도 자동으로 해줌
	private static OracleDAO dao = null;
	
	private OracleDAO() {} // 기본 생성자. private 때문에 바깥에서 생성 불가능.
	
	public static OracleDAO getInstance() { 
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao; 
	}

	public Connection getConn() throws Exception { // 주의하고 외우셈
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Connection con = null;
		
		con = DriverManager.getConnection(url, userName, password); // 이거 외워야함 DrvierManger 외우셈!!!

		System.out.println("접속 성공");

		return con;

	}
	
	public void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {} 
		}
	}
}
