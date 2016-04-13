package ca.sheridancollege.dao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Before("execution(* ca.sheridancollege.dao.DAO.saveStudent(..))")
	public void saveStudentLog (){
		System.out.println("Save Student Log");
	}
	
	@After("execution(* ca.sheridancollege.dao.DAO.getStudentList())")
	public void getStudentListLog(){
		System.out.println("get student list log");
	}
	
}
