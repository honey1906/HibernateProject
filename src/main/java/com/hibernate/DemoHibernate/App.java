package com.hibernate.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentName sn = new StudentName();
    	sn.setFname("Jon");
    	sn.setLname("Snow");
    	
        Student student = new Student();
        student.setSid(101);
        student.setStudentName(sn);
        student.setSmarks("204");
        
        Configuration con =new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(student); // if you want to save the values in the table
        
        student = (Student) session.get(Student.class, 101); //if you want to fetch the value from table
        
        tx.commit();
        
        System.out.println(student);
    }
}
