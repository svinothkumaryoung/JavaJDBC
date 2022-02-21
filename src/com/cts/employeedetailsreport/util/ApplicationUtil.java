package com.cts.employeedetailsreport.util;


import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;
import com.cts.employeedetailsreport.model.EmployeeDetails;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ApplicationUtil {
	 public static List<EmployeeDetails> readFile(String filePath) throws IOException
	    {

			List<EmployeeDetails> employeeList = new ArrayList<EmployeeDetails>();



			FileReader fr = new FileReader(new File(filePath));
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null){

				String[] sp = str.split(",");
				String employeeNumber = sp[0];
				try {
					if(validate(employeeNumber)){
						EmployeeDetails emp1=new EmployeeDetails();
						emp1.setEmployeeNumber(sp[0]);
						emp1.setEmployeeName(sp[1]);
						emp1.setLevel(sp[2]);
						emp1.setExtraWorkingHours(Integer.parseInt(sp[3]));
						//emp1.setTotalSalary(99000);
						employeeList.add(emp1);
					}
					else
					{
						EmployeeDetails emp1=new EmployeeDetails();
						emp1.setEmployeeNumber(sp[0]);
						emp1.setEmployeeName(sp[1]);
						emp1.setLevel(sp[2]);
						emp1.setExtraWorkingHours(Integer.parseInt(sp[3]));
						employeeList.add(emp1);
					}

				} 
				catch (InvalidEmployeeNumberException e) {
					System.out.println(e.getMessage());
				}
			}
	    	return employeeList;
	    	
	    }
	    public static boolean validate(String employeeNumber) throws InvalidEmployeeNumberException
		{
	    	boolean val=false;
			// FILL THE CODE HERE
			if(employeeNumber.substring(0, 1).equals("PR") && employeeNumber.substring(2, 7).length() == 5){
				val = true;
			}

	    	return val;

		}


}
