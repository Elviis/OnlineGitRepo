package ca.sheridancollege.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import ca.sheridancollege.beans.Student;

@Component
public class DAO {

	SessionFactory sessionFactory= new Configuration()
			.configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();
	
	public void template(){
		
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
			
	}
	
public void saveStudent(Student student){
		
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		
		//System.out.println(student);
	session.saveOrUpdate(student);
		
		session.getTransaction().commit();
		session.close();
			
	}

public List<Student> getStudentList(){
	
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	
	Query query = session.createQuery("from Student");
	List<Student> studentList = (List<Student>) query.list();
	
	session.getTransaction().commit();
	session.close();
	
	return studentList;
}

public List<Student> editStudent(int id){
	
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	
	Query queryForEdit = session.getNamedQuery("Student.editStudent");
	//queryForEdit.setParameter("id", "%" + id + "%");
	
	queryForEdit.setInteger("id", id);
	
	List<Student> studentList = (List<Student>) queryForEdit.list();
	
	session.getTransaction().commit();
	session.close();
	
	return studentList;
}

public List<Student> deleteStudent(int id){
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	
	
	Query queryForEdit = session.getNamedQuery("Student.editStudent");
	queryForEdit.setInteger("id", id);
	
	List<Student> studentList = (List<Student>) queryForEdit.list();
	Student toDelete = null;
	
	for(Student student : studentList) {
		if (student.getId() == id) {
			
			toDelete = student;
			break;
		}
	}
	
	studentList.remove(toDelete);
	
	//System.out.println(student);

	session.getTransaction().commit();
	session.close();
	return studentList;
		
}


public Student getStudent(int id) {
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	
	Query query = session.getNamedQuery("Student.byId").setInteger("id", id);
	Student student = (Student) query.list().get(0);
	
	session.getTransaction().commit();
	session.close();
	
	return student;
	}

public Student getStudent() {
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	
	Query query = session.getNamedQuery("Student.all");
	Student student = (Student) query.list();
	
	session.getTransaction().commit();
	session.close();
	
	return student;
	}


}
