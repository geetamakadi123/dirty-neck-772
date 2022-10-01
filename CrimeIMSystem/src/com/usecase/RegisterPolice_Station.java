package com.usecase;

import java.rmi.StubNotFoundException;
import java.util.Scanner;
import com.bean.Criminal;
import com.bean.PoliceArea;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;

public class RegisterPolice_Station {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Police-Station name:");
		String PoliceStation_Name = sc.nextLine();

		System.out.println("Enter Police Station Area :");
		String PoliceStation_Area = sc.nextLine();

		CriminalDAO dao = new CriminalDAOImpl();

		PoliceArea police = new PoliceArea();
		
		police.setPoliceStation_Name(PoliceStation_Name);

		police.setPoliceStation_Area(PoliceStation_Area);

		String result = dao.registerPoliceStation(police);

		System.out.println(result);
	}

}

