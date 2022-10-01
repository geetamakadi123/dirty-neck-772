package com.usecase;

	import java.util.List;
	import java.util.Scanner;
	import com.bean.Criminal;
	import com.dao.CriminalDAO;
	import com.dao.CriminalDAOImpl;
	import com.exception.CriminalException;

	public class DeleteCriminalFromRegister {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Criminal ID :");
			int Criminal_Id = sc.nextInt();

			CriminalDAO dao = new CriminalDAOImpl();

			try {
				List<Criminal> criminal = dao.DeleteCriminalFromRegister(Criminal_Id);

				System.out.println(criminal);

			} catch (CriminalException se) {
				System.out.println(se.getMessage());
			}

		}
	


}
