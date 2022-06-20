package com.Gl.sarvani.dept.hrdept;

import com.Gl.sarvani.dept.model.SuperDepartment;

public class HRDepartment extends SuperDepartment{
	public String departmentName() {
		return "Hr Department";
	}
    public String getTodaysWork() {
    	return "Fill today’s worksheet and mark your attendance";
    }
    public String getWorkDeadline() {
    	return " Complete by EOD ";
    }
    public String  doActivity() {
    	return "team Lunch";
    }

}
