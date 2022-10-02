package com.usecase;

import com.dao.CriminalDAO;
import com.dao.CriminalDAOImpl;
import com.exception.CriminalException;

public class GetNumberOfCases_Month {

	public static void main(String[] args) throws Exception {

		CriminalDAO dao = new CriminalDAOImpl();

		String criminal = dao.GetNumberOfCases_Month();

		System.out.println(criminal);

	}

}
