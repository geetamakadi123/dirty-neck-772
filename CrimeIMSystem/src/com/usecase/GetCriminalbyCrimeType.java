package com.usecase;

	import java.util.ArrayList;
	import java.util.Scanner;

	import com.bean.Criminal;
	import com.dao.CriminalDAO;
	import com.dao.CriminalDAOImpl;
	import com.exception.CriminalException;

	public class GetCriminalbyCrimeType {

		public static void main(String[] args) throws CriminalException {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Criminal Crime Type :");
			String CrimeType = sc.next();
			
			System.out.println("Enter Criminal Date of Crime :");
			String CrimeDAte = sc.next();

			CriminalDAO dao = new CriminalDAOImpl();

			Criminal criminal = dao.getCriminalByCrimeType(CrimeType, CrimeDAte);

			System.out.println(criminal);
		}

	


}
