package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InValidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;

public class AppointmentUi {

	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		app.setAppointment_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setAppointment_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Doctor id:");
		String doc_Id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_Id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setDoctor_id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		float fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_category(fees_cat);
		int result = AppointmentsDao.insertAppointments(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Appointments doc = AppointmentsDao.getAppointmentsById(app_id);
		System.out.println("Appointment id:" + doc.getAppointment_id());
		System.out.println("Appointment date:" + doc.getAppointment_date());
		System.out.println("Doctor id:" + doc.getDoctor_id());
		System.out.println("fees collected:" + doc.getFees_collected());
		System.out.println("fees catagery:" + doc.getFees_category());
		sc.close();
	}
	public static void ViewAllAppointmentDetails() {
		List<Appointments> applist =AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			System.out.println("app id:"+app.getAppointment_id());
		}
	}
	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setAppointment_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setAppointment_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_name);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_name);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setDoctor_id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		float fees=Integer.parseInt(fees_collected);
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_category(fees_cat);
		int result = AppointmentsDao.updateAppointments(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = AppointmentsDao.deleteAppointments(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updatePatientName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patient Name:");
		String patient=sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result=AppointmentsDao.updatePatientName(app_id,patient);
		System.out.println(result+" row updated");
		sc.close();
		
	}
	public static void updateCollectedfees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter collected fees:");
		float colleted_fees=sc.nextFloat();
		try {
			Validator.CheckNumberForGreaterThanZero(colleted_fees);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InValidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result=AppointmentsDao.updateCollectedFees(app_id, colleted_fees);
		System.out.println(result+" row updated");
		sc.close();
	}

	}

