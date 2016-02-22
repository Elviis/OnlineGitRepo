package ca.sheridancollege.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ca.sheridancollege.beans.Users;

public class DAO {

	SessionFactory sessionFactory = new Configuration().configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();

	//I usually comment more things in here however the names of the queries are pretty much giveaways
	
public void saveOrUpdate(Users user){
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(user);

		session.getTransaction().commit();
		session.close();
		
	}
	

public List<Users> queryTotalUniqueVotes(){
	
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();

	Query query = session.getNamedQuery("Users.totalUsers");
	
	List<Users> totalUniqueVotesList = (List<Users>) query.list();
	
	
	session.getTransaction().commit();
	session.close();
	
	
	return totalUniqueVotesList;
}

public List<Users> querySong1(String nameOfArtist) {
	Session session = sessionFactory.openSession();
	session.beginTransaction();

	System.out.println("Inside DAO value " + nameOfArtist);

	Query query = session.getNamedQuery("Users.votesSong1");
	query.setParameter("song1", "%" + nameOfArtist + "%");
	
	List<Users> song1List = (List<Users>) query.list();
	
	session.getTransaction().commit();
	session.close();
	
	return song1List;
}

public List<Users> querySong2(String nameOfArtist) {
	Session session = sessionFactory.openSession();
	session.beginTransaction();

	System.out.println("Inside DAO value " + nameOfArtist);

	Query query = session.getNamedQuery("Users.votesSong2");
	query.setParameter("song2", "%" + nameOfArtist + "%");
	
	List<Users> song2List = (List<Users>) query.list();
	
	session.getTransaction().commit();
	session.close();
	
	return song2List;
}

public List<Users> querySong3(String nameOfArtist) {
	Session session = sessionFactory.openSession();
	session.beginTransaction();

	System.out.println("Inside DAO value " + nameOfArtist);

	Query query = session.getNamedQuery("Users.votesSong3");
	query.setParameter("song3", "%" + nameOfArtist + "%");
	
	List<Users> song3List = (List<Users>) query.list();
	
	session.getTransaction().commit();
	session.close();
	
	return song3List;
}

	
}
