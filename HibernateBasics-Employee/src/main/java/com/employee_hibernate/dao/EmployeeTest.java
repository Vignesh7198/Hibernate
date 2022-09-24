package com.employee_hibernate.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.employee_hibernate.dto.Employee;

public class EmployeeTest {
	
	
	public void saveEmployee(Employee employee) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
	}
	public Employee getEmployee(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		Employee employee=em.find(Employee.class, id);
		return employee;
     }
	public void updatEmployee(int id) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee employee=em.find(Employee.class, id);
		if(employee!=null) {
			System.out.println("update employee data: ");
			System.out.print("Enter employee name");
			employee.setEmpname(sc.nextLine());
			System.out.print("Enter employee role: ");
			employee.setEmprole(sc.nextLine());
			System.out.print("Enter employee Salary: ");
			employee.setSalary(sc.nextDouble());
			sc.close();
		}else {
			System.out.println("can not update with given id because id is not found");
		}
		et.commit();
	  }
	public void deleteEmployee(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("simha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Employee employee=em.find(Employee.class, id);
		if(employee!=null) {
			em.remove(employee);
		}else {
			System.out.println("their is no employee with given id");
		}
		et.commit();
	}
}
