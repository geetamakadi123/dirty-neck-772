package com.usecase;



import java.util.Scanner;
import com.bean.Criminal;
import com.bean.SPOfficer;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;
import com.exception.CriminalException;

public class LoginUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String uname = sc.next();

		System.out.println("Enter Password:");
		String pass = sc.next();

		CriminalDAO dao = new CriminalDAOImpl();

		try {
			Criminal criminal = dao.loginCriminal(uname, pass);

			System.out.println("Welcome Officer :" + criminal.getCriminal_Name());

		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}
	}

}

