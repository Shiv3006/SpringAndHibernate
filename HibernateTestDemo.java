package com.bnt.entity;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.openSession();

		try {

			session.beginTransaction();
			Employee emp1 = new Employee(5, "rohini", "pune");

			System.out.println("saving employeee: ");
	      	session.save(emp1);
			session.getTransaction().commit();
			
			int id=1;
	       session.get(Employee.class, id);
			System.out.println(id);

		} finally {
			factory.close();
		}

	}

}
