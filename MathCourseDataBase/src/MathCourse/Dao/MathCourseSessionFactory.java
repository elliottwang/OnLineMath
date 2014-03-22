package MathCourse.Dao;

import java.io.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class MathCourseSessionFactory {
	
	private MathCourseSessionFactory(){
	}
	
	private static SessionFactory sessionFactory;
	
	static{
		File configFile = null;
		Configuration cfg = null;
		configFile = new File("../conf/hibernate.cfg.xml");
		if(!configFile.exists()){
			configFile = new File("conf/hibernate.cfg.xml");
		}
		
		if(configFile.exists()){
			cfg = new Configuration().configure(configFile);		
		}
		else{
			cfg = new Configuration().configure();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Session getSession() throws HibernateException{
		return sessionFactory.openSession();
	}
	
}
