package org.cn.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
	private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
	private static final String USER="root";
	private static final String PASSWORD="cxx931219";
	private static final String DBURL="jdbc:mysql://localhost:3306/mldn";
	private static Connection conn;
	public static void main(String[] args) throws SQLException{
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(DBURL, USER, PASSWORD);
		//System.out.println(conn);
	}
	public Connection getConnection(){
		return conn;
	}
	public void closeConnection(){
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
