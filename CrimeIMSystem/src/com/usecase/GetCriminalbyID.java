package com.usecase;
import java.util.Scanner;

import com.bean.Criminal;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;
import com.exception.CriminalException;

public class GetCriminalbyID {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminal ID :");
		int Criminal_Id = sc.nextInt();

		CriminalDAO dao = new CriminalDAOImpl();

		try {
			Criminal criminal = dao.getCriminalByID(Criminal_Id);

			// List<student>list = new ArrayList<>(criminal);

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}

}
