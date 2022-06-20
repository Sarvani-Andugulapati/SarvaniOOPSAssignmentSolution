package com.Gl.sarvani.dept.main;

import com.Gl.sarvani.dept.admindept.AdminDepartment;
import com.Gl.sarvani.dept.hrdept.HRDepartment;

//import java.util.Scanner;

import com.Gl.sarvani.dept.model.SuperDepartment;
import com.Gl.sarvani.dept.techdept.TechDepartment;

public class deptmain {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		SuperDepartment dpt= new SuperDepartment();
		AdminDepartment adpt= new AdminDepartment();
		HRDepartment hrdpt= new HRDepartment();
		TechDepartment Tdpt= new TechDepartment();
	//	System.out.println("Please choose your department from the following:\n"+
	//	"1. Admin Department\n"+"2. HR Department\n"+"3. Technical Department\n");
		//int ch = sc.nextInt();
	//	switch(ch) {
		//case 1: 
			System.out.println("Welcome to"+" "+adpt.departmentName()+
					"\n"+adpt.getTodaysWork()+"\n"+adpt.getWorkDeadline()+
					"\n"+dpt.isTodayAHoliday()+"\n\n");
		//	break;
		//case 2: 
			System.out.println("Welcome to"+" "+hrdpt.departmentName()+
					"\n"+hrdpt.doActivity()+"\n"+hrdpt.getTodaysWork()+"\n"+hrdpt.getWorkDeadline()+
					"\n"+dpt.isTodayAHoliday()+"\n\n");
		//	break;
		//case 3: 
			System.out.println("Welcome to"+" "+Tdpt.departmentName()+
					"\n"+Tdpt.getTodaysWork()+"\n"+Tdpt.getWorkDeadline()+"\n"+Tdpt.getTechStackInformation()+
					"\n"+dpt.isTodayAHoliday()+"\n\n");
		//	break;
		//	default:
		//		System.out.println("Please enter a valid choice\n");
	//	}

	}

}
