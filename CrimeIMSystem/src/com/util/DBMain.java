package com.util;



import java.sql.Connection;




public class DBMain {
	
		public static void main(String[] args) {

			Connection conn = DBUtil.provideConnection();

			System.out.println(conn);

		}

	


}
