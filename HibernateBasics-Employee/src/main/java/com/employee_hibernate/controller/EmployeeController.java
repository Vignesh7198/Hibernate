package com.employee_hibernate.controller;

import com.employee_hibernate.dao.EmployeeTest;
import com.employee_hibernate.dto.Employee;

public class EmployeeController {
      public static void main(String[] args) {
		EmployeeTest employeeData=new EmployeeTest();
        
		// save employeee data
		
		
//		Employee employee=new Employee();
//        employee.setEmpname("vishnu");
//        employee.setEmprole("test engineer");
//        employee.setSalary(40000);
//        
//        employeeData.saveEmployee(employee);
//        
		
		//Retrive Employee data
		
//		Employee employee=employeeData.getEmployee(1);
//		if(employee!=null) {
//			System.out.println("Employee name : "+ employee.getEmpname());
//			System.out.println("Employee Role : "+ employee.getEmprole());
//			System.out.println("Employee Salary : "+ employee.getSalary());
//	    }else {
//	    	System.out.println("no employee data found by given id");
//	    }
	    
		// update employee data 
		employeeData.updatEmployee(1);
		
		//delete employee data
	//	employeeData.deleteEmployee(4);
	}
	
		
}
