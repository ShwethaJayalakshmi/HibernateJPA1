package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.annotation.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class DeleteEmployee {
   public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		Employee s=s=ses.load(Employee.class,2);
		ses.delete(s);
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("delete Successful");
		

	}

}