package com.usecase;

	import java.util.Scanner;
	import com.dao.CriminalDAO;
	import com.dao.CriminalDAOImpl;

	public class AllocateCriminalToPolice_Station {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Police_Station_id :");
			int StationId = sc.nextInt();

			System.out.println("Enter the Criminal Id:");
			int Criminal_Id = sc.nextInt();


			CriminalDAO dao = new CriminalDAOImpl();

			try {
				String result = dao.registerCriminalInsideAStation(StationId, Criminal_Id);

				System.out.println(result);
			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

		}

	


}
