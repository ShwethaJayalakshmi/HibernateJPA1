package com.deeptech.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class CreateStudent {
   public static void main(String[] args) {
		Student s=new Student();
		s.setStudentName("Shwetha");
		s.setRollNumber(1003);
		s.setCourse("BE");
        SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("TABLE CREATED AND INSERTED RECORD SUCCESSFULLY");
		ses.close();
		sf.close();
     }
}
