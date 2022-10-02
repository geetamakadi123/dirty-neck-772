package com.usecase;



import java.util.Scanner;
import com.bean.Criminal;
import com.bean.SPOfficer;
import com.dao.CriminalDAOImpl;
import com.exception.CriminalException;
import com.bean.SPOfficer;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;

public class LoginUseCase {

	
		public static void main(String[] args) throws CriminalException {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Username:");
			String uname = sc.next();

			System.out.println("Enter Password:");
			String pass = sc.next();

			// CriminalDao dao = new CriminalDaoImpl();
			CriminalDAO dao = new CriminalDAOImpl();

			boolean officer = dao.SPOfficer(uname, pass);

			
		}

}

