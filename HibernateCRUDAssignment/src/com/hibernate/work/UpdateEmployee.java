package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.annotation.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class UpdateEmployee {
  public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		Employee e=ses.get(Employee.class, 3);
		e.setEmpEmail("ss@gmail.com");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Update Success");
		}

}


