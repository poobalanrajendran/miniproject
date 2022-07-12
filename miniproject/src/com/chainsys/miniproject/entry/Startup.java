package com.chainsys.miniproject.entry;
//import com.chainsys.miniproject.test.TestEmployeeDao;
//import com.chainsys.miniproject.ui.EmployeeUi;
//import com.chainsys.miniproject.dao;
//import com.chainsys.miniproject.pojo;
//import com.chainsys.miniproject.ui;
//import com.chainsys.miniproject.ui.EmployeeUi;
import com.chainsys.miniproject.test.TestDoctorDao;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

import java.util.Scanner;

import com.chainsys.miniproject.test.TestAppointmentDao;


public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestDoctorDao.testGetDoctorById() ;
		//DoctorUi.addNewDoctor() ;
		//TestAppointmentDao.testgetAppointmentById();
		loadMenu();
	}
	private static void loadMenu()
	{
		System.out.println("Enter the value for Employee for 1,doctor for 2, appointment for3");
		Scanner sc=new Scanner(System.in);
		try
		{
			int call=sc.nextInt();
			switch (call)
			{
			case 1:
				loadEmployeeMenu();
				break;
				
			case 2:
				loadDoctorMenu();
				break;
				
			case 3:
				loadAppointmentMenu();
				break;
			}
		}finally {
			sc.close();
		}
	}
	
	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctor ,2=deleteDoctordetails ,3=updateDocDetails "
				+ ",4=updateDoctorName(), 5=updateDoctorName(), 6=ViewAllEmployeeDetails(), 7=viewEmployeeDetails() ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
		int call = sc.nextInt();
		switch (call) {
		case 1:
			DoctorUi.addNewDoctor();
			break;
		case 2:
			DoctorUi.deleteDoctordetails();
			break;
		case 3:
			DoctorUi.updateDocDetails();
			break;
		case 4:
			DoctorUi.updateDoctorName();
			break;
		case 5:
			DoctorUi.updateStandardFees();;
			break;
		case 6:
			DoctorUi.ViewAllDoctorDetails();
			break;
		case 7:
			DoctorUi.viewDoctorDetails();
			break;
			}
		}finally {
			sc.close();
		}
	}
private static void loadEmployeeMenu()
{System.out.println("to know employees details press 1 for addNewEmployee()"
		+ "  "+ "2 for deleteEmployee(), "+ "3 getAllEmployeesDetails(),"
		+ "4 getEmployeeById();"+ " 5 updateEmployee()"
+"6 updateEmployeeFirstName()"+"6 updateEmployeeSalary()");
	Scanner sc=new Scanner((System.in));
	int emp=sc.nextInt();
	try {
		switch(emp)
		{
		case 1:
			EmployeeUi.addNewEmployee();
          break;
          
          case 2:
			EmployeeUi.deleteEmployee();
			break;
			
		case 3:
			EmployeeUi.getAllEmployeesDetails();
         break;
         
		case 4:
			EmployeeUi.getEmployeeById();
			break;
			
		case 5:
			EmployeeUi.updateEmployee();
			break;
			
		case 6:
			EmployeeUi.updateEmployeeFirstName();
			break;
			
		case 7:
			EmployeeUi.updateEmployeeSalary();
			break;
		}
		
		defalut:
		{
			System.out.println("enter the valid value");
			
		}
	}finally {
		sc.close();
	}
	
			
}

private static void loadAppointmentMenu()
{
	 System.out.println(
             "Enter Method : 1.addNewAppointments() ,2.deleteAppointmentDetails() ,3.updateAppDetails() "
             + "\n 4.updateCollectedfees() ,5.updatePatientName() ,6.ViewAllAppointmentDetails() "
             + "\n 7.viewAppointmentDetailsById() ");
     java.util.Scanner sc = new java.util.Scanner(System.in);
     try {
     int call = sc.nextInt();
     switch (call) {
     case 1:
         AppointmentUi.addNewAppointments();
         break;
     case 2:
         AppointmentUi.deleteAppointmentDetails();
         break;
     case 3:
         AppointmentUi.updateAppDetails();
         break;
     case 4:
         AppointmentUi.updateCollectedfees();
         break;
     case 5:
         AppointmentUi.updatePatientName();
         break;
     case 6:
         AppointmentUi.ViewAllAppointmentDetails();
         break;
     case 7:
         AppointmentUi.viewAppointmentDetails();
         break;
     }
     }
     finally {
         sc.close();
     }
 }
}
