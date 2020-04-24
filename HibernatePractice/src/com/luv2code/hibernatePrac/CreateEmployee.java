package com.luv2code.hibernatePrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		
		
		//create session
		Session session=factory.getCurrentSession();	
		
		try {
			System.out.println("Creating new employees");
			Employee temp=new Employee("V","B","tcs");
			Employee temp1=new Employee("T","B","apple");
			Employee temp2=new Employee("S","Bhatnagar","facebook");
			
			session.beginTransaction();
			
			session.save(temp);
			session.save(temp1);
			session.save(temp2);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		

	}

}
