package ca.sheridancollege.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ca.sheridancollege.beans.Feedback;


public class DAO {

	SessionFactory sessionFactory = new Configuration().configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();
	
	//save feedback to DB
public void saveOrUpdate(Feedback feedback){
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(feedback);

		session.getTransaction().commit();
		session.close();
		
	}

public List<Feedback> queryMonth(String date, String department) {
	Session session = sessionFactory.openSession();
	session.beginTransaction();
		
	//SimpleDateFormat dateFormat = new SimpleDateFormat("MMM");
	date = date.substring(0,3);
	department = department.trim();
		
	System.out.println("Inside DAO value " + date);

	Query query = session.getNamedQuery("Feedback.month");
	query.setParameter("date", "%" + date + "%");
	query.setParameter("department", "%"+department+"%");
	//query.setString("feedback", feedback);
	
	List<Feedback> feedbackList = (List<Feedback>) query.list();
	session.getTransaction().commit();
	session.close();
	
	//System.out.println("Size of list returned is: " + feedbackList.size());
	
	return feedbackList;
}


	
}
