package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {

	public static void main(String[] args) {
		OracleDAO o = new OracleDAO();
		try {
			o.getConn();
		} catch (Exception e) {
			System.out.println("오류");
		}

	}

	public Connection getConn() throws Exception { // 주의하고 외우셈
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password); // 이거 외워야함 DrvierManger 외우셈!!!

		System.out.println("접속 성공");

		return con;

	}
}
