package com.usecase;

	import java.util.List;
	import com.bean.Criminal;
	import com.dao.CriminalDAO;
	import com.dao.CriminalDAOImpl;
	import com.exception.CriminalException;

	public class GetAllCriminalUseCase {

		public static void main(String[] args) {

			CriminalDAO dao = new CriminalDAOImpl();

			try {
				List<Criminal> criminal = dao.getAllCriminalDetails();

				criminal.forEach(Crime -> {

					System.out.println("Criminal Name :" + Crime.getCriminal_Name());
					System.out.println("Criminal Address: " + Crime.getCriminal_Address());
					System.out.println("Criminal Arrest Date: " + Crime.getArrest_Date());
					System.out.println("Criminal Crime Place: " + Crime.getPlace_Crime());
					System.out.println("Criminal Age: " + Crime.getAge());
					System.out.println("Criminal Crime Type: " + Crime.getCrimeType());
					System.out.println("Criminal Crime Status: " + Crime.getCrimeType());

					System.out.println("===============================================");
				});

			} catch (CriminalException se) {
				System.out.println(se.getMessage());
			}

		}

	


}
