package com.hibernate.work;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.annotation.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class ReadEmployee {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction(); //Perform operation(insert,select,update,delete)
		//collection framework
		Query q=ses.createQuery("from Employee");
		List<Employee>st=q.list();
		for(Employee e:st)
		{
			System.out.println(e.getEmpName()+"\t"+e.getEmpEmail()+"\t"+e.getEmpMobileNo()+"\t"+e.getEmpAge()+"\t"
		+e.getEmpSalary()+"\t"+e.getEmpState());
		}
		ses.beginTransaction().commit();
}
}
