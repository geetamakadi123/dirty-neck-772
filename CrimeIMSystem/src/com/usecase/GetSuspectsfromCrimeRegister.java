package com.usecase;


import java.util.List;
import java.util.Scanner;
import com.bean.Crime;
import com.bean.StationCrimeArea;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;

public class GetSuspectsfromCrimeRegister {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Suspect Registered in  Police Station  :");

		String Suspects_Name = sc.nextLine();

		CriminalDAO dao = new CriminalDAOImpl();

		try {
			List<StationCrimeArea> dtos = dao.getSuspectsfromCrimeRegister(Suspects_Name);

			dtos.forEach(dto -> System.out.println(dto));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}

