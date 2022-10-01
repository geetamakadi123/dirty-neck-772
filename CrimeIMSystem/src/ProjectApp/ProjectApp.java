package ProjectApp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.bean.Criminal;
import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;
import com.exception.CriminalException;
import com.exception.PoliceAreaException;
import com.usecase.DeleteCriminalFromRegister;
import com.usecase.GetAllCriminalUseCase;
import com.usecase.GetCriminalbyCrimeType;
import com.usecase.GetCriminalbyID;
import com.usecase.GetCriminalsFromPolice_StationUseCase;
import com.usecase.GetSuspectsfromCrimeRegister;
import com.usecase.RegisterCriminal;



public class ProjectApp {

	

		public static void main(String[] args) throws SQLException, CriminalException, PoliceAreaException {

			try {
				System.out.println("                          *****Welcome to Crime Management System Application*****");
				System.out.println(
						"==================================================================================================================");
				System.out.println("                               Please Login as Assistant Police Inspector  ");
				System.out.println("                            ");
				Scanner in = new Scanner(System.in);

				System.out.println("Enter UserName");
				String username = in.next();

				System.out.println("Enter Password");

				String password = in.next();
				CriminalDAO edao = new CriminalDAOImpl();

				if (edao.PoliceOfficer(username, password)) {
					System.out.println("   Sucessfully Logged-In  : " + username);
					System.out.println("   Please Select Queries which you want to Apply ");

				} else {

					System.out.println("Please Check Credentials");
				}

				while (true) {

					System.out.println(" \n   1. View All Criminals Data  : "
							+ " \n   2. Please enter Criminal Id to search to Criminal data : "
							+ " \n   3. Please enter For Update of Criminal data  : "
							+ " \n   4. Show all Criminals Details from Crime Types OR Crime Date : "
							+ " \n   5. Information of all Criminals get from Police station Area : "
							+ " \n   6. Information of Victims : " + " \n   7. Information of main Suspects : "
							+ " \n   8. Please enter criminalId to delete  : "
							+ " \n   9.  Number of solved and unsolved crime   : "
							+ " \n  10.  Number of crimes recorded in the current month." + " \n  11.  Exit the App");

					int choice = in.nextInt();
					switch (choice) {

					case 1:
						GetAllCriminalUseCase.main(args);
						break;

					case 2:
						GetCriminalbyID.main(args);

						break;

					case 3:
						RegisterCriminal.main(args);
						break;

					case 4:
						GetCriminalbyCrimeType.main(args);
						break;

					case 5:
						GetCriminalsFromPolice_StationUseCase.main(args);
						break;

					case 6:
//						GetVictimsfromCrimeRegister.main(args);

						break;

					case 7:
						GetSuspectsfromCrimeRegister.main(args);

						break;

					case 8:
						DeleteCriminalFromRegister.main(args);
						break;

					case 9:
						// DeleteCriminalFromRegister.main(args);
						break;

					case 10:
						// DeleteCriminalFromRegister.main(args);
						break;
					case 11:
						ProjectApp.exitApp();
						break;

					default:

						System.out.println("Wrong Credentials..!!");
						break;

					}
				}
			} catch (Exception e) {
				ProjectApp.error(e.getMessage());

			}

		}

		public static void error(String message) {
			System.out.println("Wrong Credentials..!!");

		}

		public static void exitApp() {

			System.out.println("Thanks for using this App !");
			System.exit(0);
		}

	

}
