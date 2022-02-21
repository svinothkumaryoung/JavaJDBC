package com.cts.employeedetailsreport.service;

import com.cts.employeedetailsreport.dao.DetailsDAO;
import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;
import com.cts.employeedetailsreport.model.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
	
	
public static ArrayList <EmployeeDetails> buildEmployeeList(List <String> employeeRecords) {
		
		
		final String COMMADELIMITER = ",";
		ArrayList <EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
		
    	//fill the code here

		return empList;
	}
	
	
	
	public boolean addEmployeeList(String inputFeed) throws InvalidEmployeeNumberException
	{


		return false;
	}
	
	

	public static double calculateTotalSalary(String level,int extraWorkingHours)
    {
		double sal=0.0;
    	//fill the code here
		if(level.equals("level1")){
			sal = 75000 + (extraWorkingHours * 1000);
		}
		if(level.equals("level2")){
			sal = 50000 + (extraWorkingHours * 1000);
		}
		if(level.equals("level3")){
			sal = 35000 + (extraWorkingHours * 1000);
		}
		if(level.equals("level4")){
			sal = 25000 + (extraWorkingHours * 1000);
		}

		return sal;
    }
    

}
 