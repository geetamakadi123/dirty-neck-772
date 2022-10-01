package com.usecase;

import java.util.List;
import java.util.Scanner;
import com.bean.Crime;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;

public class GetCriminalsFromPolice_StationUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Police Station Area :");

		String Station_Area = sc.nextLine();

		CriminalDAO dao = new CriminalDAOImpl();

		try {
			List<Crime> dtos = dao.getAllCriminalsByPolice_Station_name(Station_Area);

			dtos.forEach(dto -> System.out.println(dto));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

