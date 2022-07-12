package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
//import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
//import com.chainsys.miniproject.pojo.Employee;
import com.chainsys.miniproject.pojo.Employee;

public class TestDoctorDao {
	public static void testInsertDoctor() {
		Doctor doc = new Doctor();
		doc .setDoctor_id(101);
		doc .setDoctor_name("dinesh");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		doc .setdate(newDate);
		doc .setDoctor_speciality("neuro");
		doc .setPhone_no(979177234);
		doc .setStandard_fees(564);
		doc .setCity("chennai");
		int result = DoctorDao.insertDoctor(doc);
		System.out.println(result);
		
	}
	
	public static void testGetDoctorById() {
		Doctor emp = DoctorDao.getDoctorById(101);
		System.out.println(emp.getDoctor_id()+" "+emp.getDoctor_name()+" "+emp.getdate());
	}
	public static void testUpdateDoctor() {
		Doctor oldEmployee = DoctorDao.getDoctorById(101);
		System.out.println(oldEmployee.getDoctor_id()+" "+oldEmployee.getDoctor_name()+" "+oldEmployee.getdate());
		oldEmployee.setDoctor_id(101);
		oldEmployee.setDoctor_name("naresh");
		//oldEmployee.setEmail("Jeolil@mail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		oldEmployee.setdate(newDate);
		oldEmployee.setDoctor_speciality("dental");
		oldEmployee.setPhone_no(638237520);
		oldEmployee .setStandard_fees(568);
		oldEmployee .setCity("noida");
		int result = DoctorDao.updateDoctor(oldEmployee);
		System.out.println(result);
		
	}
	
	public static void testGetAllDoctor() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> empIterator = allDoctor.iterator();
		while(empIterator.hasNext()) {
			Doctor emp = empIterator.next();
			System.out.println(emp.getDoctor_id()+" "+emp.getDoctor_name()+" "+emp.getdate());
		}}
	
	public static void testDeleteDoctor() {
		int result = DoctorDao.deleteDoctor(101);
		System.out.println(result);
	}

}
