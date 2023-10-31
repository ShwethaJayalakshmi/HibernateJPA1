package com.deeptech.hibernate.work;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class ReadStudent {

	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction(); //Perform operation(insert,select,update,delete)
		//collection framework
		Query q=ses.createQuery("from Student");
		List<Student>st=q.list();
		for(Student s:st)
		{
			System.out.println(s.getStudentName()+"\t"+s.getRollNumber()+"\t"+s.getCourse());
		}
		ses.beginTransaction().commit();
		}
}
