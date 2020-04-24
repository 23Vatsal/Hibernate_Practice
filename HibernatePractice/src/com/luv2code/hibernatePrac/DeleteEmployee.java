package com.luv2code.hibernatePrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		
		
		//create session
		Session session=factory.getCurrentSession();	
		
		try {
			
			
			session.beginTransaction();
			
			//Method-1
			int employeeId=5;
			
			Employee emp=session.get(Employee.class, employeeId);
			
			System.out.println("deleting student=> "+emp);
			
			session.delete(emp);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		

	}

}
