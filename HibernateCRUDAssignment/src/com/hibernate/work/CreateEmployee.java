package com.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.annotation.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class CreateEmployee {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEmpName("Shilpa");
	e.setEmpEmail("shilpa@gmail.com");
	e.setEmpMobileNo("9876543232");
	e.setEmpAge(24);
	e.setEmpSalary(60000);
	e.setEmpState("Karnataka");
    SessionFactory sf=HibernateUtil.connection();
	Session ses=sf.openSession();
	ses.beginTransaction();
	ses.save(e);
	System.out.println("TABLE CREATED AND INSERTED RECORD SUCCESSFULLY");
	ses.close();
	sf.close();			
}
}

