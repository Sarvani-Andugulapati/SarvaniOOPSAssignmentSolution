package com.Gl.sarvani.dept.techdept;

import com.Gl.sarvani.dept.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Department ";
	}
    public String getTodaysWork() {
    	return "Complete coding of module 1";
    }
    public String getWorkDeadline() {
    	return "Complete by EOD ";
    }
   public String getTechStackInformation() {
	   return "core Java";
   }

}
