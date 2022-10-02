package com.dao;

import java.util.List;

import com.bean.Criminal;
import com.bean.Crime;
import com.bean.PoliceArea;
import com.bean.StationCrimeArea;
import com.exception.PoliceAreaException;
import com.exception.CriminalException;


public interface CriminalDAO {
		public String registerCriminal(Criminal criminal);

		public String registerPoliceStation(PoliceArea police);

		public Criminal getCriminalByID(int Criminal_Id) throws CriminalException;

		public Criminal loginCriminal(String username, String password) throws CriminalException;

		public List<Criminal> getAllCriminalDetails() throws CriminalException;

		public String registerCriminalInsideAStation(int StationId, int Criminal_Id)
				throws CriminalException, PoliceAreaException;

		public List<Crime> getAllCriminalsByPolice_Station_name(String PoliceStation_Area)
				throws PoliceAreaException;

		public List<Criminal> DeleteCriminalFromRegister(int Criminal_Id) throws CriminalException;

		public boolean PoliceOfficer(String username, String password);

		boolean SPOfficer(String username, String password);

		public Criminal getCriminalByCrimeType(String crimeType, String crimeDAte);

		public List<StationCrimeArea> getSuspectsfromCrimeRegister(String suspects_Name);

		public String GetNumberOfCases_Month();

	


}
