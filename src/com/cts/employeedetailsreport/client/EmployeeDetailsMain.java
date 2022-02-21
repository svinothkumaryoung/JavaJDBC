package com.cts.employeedetailsreport.client;
import com.cts.employeedetailsreport.SkeletonValidator;
import com.cts.employeedetailsreport.dao.DetailsDAO;
import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;
import com.cts.employeedetailsreport.util.ApplicationUtil;

import java.io.IOException;

public class EmployeeDetailsMain {

	public static void main(String[] args) throws IOException, InvalidEmployeeNumberException {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();
		 
		// CODE SKELETON - VALIDATION ENDS;


		DetailsDAO.insertEmployeeList(ApplicationUtil.readFile("inputfeed.txt"));



	}

	} 

