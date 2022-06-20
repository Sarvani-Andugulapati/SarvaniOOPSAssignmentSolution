package com.Gl.sarvani.dept.admindept;

import com.Gl.sarvani.dept.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		return "Admin Department";
	}
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
