package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;

public class TestAppointmentDao {
	
	public static void testGetAllAppointments(){
		List <Appointments> allapp=AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appItr=allapp.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			System.out.print("app_id:"+"\t"+app.getAppointment_id()+"\t"+"doc_date"+app.getAppointment_date()+"\t"+"doc_id:"+app.getDoctor_id());
			System.out.println("\t"+"Collected fees:"+app.getFees_collected());
		}
		
	}
	public static void testgetAppointmentById() {
		Appointments app=AppointmentsDao.getAppointmentsById(102);
		System.out.print("app_id:"+"\t"+app.getAppointment_id()+"\t"+"doc_date"+app.getAppointment_date()+"\t"+"doc_id:"+app.getDoctor_id());
		System.out.println("\t"+"Collected fees:"+app.getFees_collected());
	}
	public static void testInsertNewAppointments() {
		Appointments app = new Appointments();
		app.setAppointment_id(104);
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			app.setAppointment_date(appFormate.parse("30/01/2022"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		app.setDoctor_id(101);
		app.setPatient_name("Borutos ");
		app.setFees_collected(500);
		app.setFees_category("high");
		int result = AppointmentsDao.insertAppointments(app);
		System.out.println(result+"row inserted");
	}
	public static void testUpdateAppointments() {
		Appointments app = new Appointments();
		app.setAppointment_id(104);
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			app.setAppointment_date(appFormate.parse("03/02/2022"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		app.setDoctor_id(101);
		app.setPatient_name("Boruto uzumaki");
		app.setFees_collected(500);
		app.setFees_category("high");
		int result = AppointmentsDao.updateAppointments(app);
		System.out.println(result+" row updated");
		
	}


}
