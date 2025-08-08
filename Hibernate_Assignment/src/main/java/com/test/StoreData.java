package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData 
{
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Employee obj = new Employee();
		
		obj.setEmp_name("Rohit");
		obj.setEmp_cmp("Mumbai");
		obj.setEmp_salary("10000");
		
//		session.persist(obj);
		
		Employee emp1 = session.get(Employee.class, 3);
		emp1.setEmp_salary("2000");
		session.merge(emp1);
		
		Employee emp2 = session.get(Employee.class, 5);
		session.delete(emp2);
		
		t.commit();
		
		System.out.println("done");
		session.close();
		sf.close();
	}
}
