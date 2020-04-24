package com.luv2code.hibernatePrac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Employee;

import jdk.nashorn.api.tree.ForInLoopTree;

public class RetrieveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		
		
		//create session
		Session session=factory.getCurrentSession();	
		
		try {
			
			session.beginTransaction();
			
			List<Employee> allEmp= session.createQuery("from Employee e where e.lastName='B'").getResultList();
			
			display(allEmp);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		

	}

	private static void display(List<Employee> allEmp) {
		
		for(int i=0;i<allEmp.size();i++) {
			System.out.println(allEmp.get(i));
		}
		
	}

}
