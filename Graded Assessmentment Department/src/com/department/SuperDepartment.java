package com.department;
import java.util.Scanner;

class SuperDepartment{
	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No work as of Now";
	}
	public String getTodaysDeadline() {
		return "Nil";
	}
	public String isTodayaHoliday() {
		return "Today is not a Holiday";
	}
}

class Admindepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "complete your documents submission";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
}
class HR_department extends SuperDepartment{
	public String departmentName() {
		return "Welcome to HR Department";
	}
	public String getTodaysWork() {
		return "Fill todays's timesheet and mark your attendance";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team lunch";
	}
}
class techDepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	public String getTodaysDeadline() {
		return "Complete by EOD";
	}
	public String techStackInformation() {
		return "core java";
	}
}

 class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HR_department hr = new HR_department();
		techDepartment td = new techDepartment();
		Admindepartment ad= new Admindepartment();
		
	
	
	    System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getTodaysDeadline());
		System.out.println(ad.isTodayaHoliday());
		System.out.println();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getTodaysDeadline());
		System.out.println(hr.isTodayaHoliday());
		System.out.println();
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getTodaysDeadline());
		System.out.println(td.techStackInformation());
		System.out.println(td.isTodayaHoliday());
		
	
		
		
	}

}

