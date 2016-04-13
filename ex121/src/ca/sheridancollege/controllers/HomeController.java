package ca.sheridancollege.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.sheridancollege.beans.Student;
import ca.sheridancollege.dao.DAO;

@Controller
public class HomeController {

	//private DAO dao = new DAO();
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ca/sheridancollege/config/beans.xml");
	private DAO dao = (DAO) context.getBean("DAO");
	
	//root entry point for application
	@RequestMapping("/")
	public String home(Model model){
		
		model.addAttribute("student", new Student());
		
		return "addStudent";
		//dispatch to /webinf/jsps/****.jsp (**** is home)
	}
	
	@RequestMapping("saveStudent")
	public String saveStudent(Model model, @ModelAttribute Student student){
		
		dao.saveStudent(student);
				
		model.addAttribute("studentList", dao.getStudentList());
				
		return "displayStudents";
	}
	
	@RequestMapping(value="editStudent/{id}")
	public String editStudent(Model model, @ModelAttribute Student student, @PathVariable int id){
		
		dao.editStudent(id);
		
		model.addAttribute("student", dao.editStudent(id).get(0));
		
		return "addStudent";
		
	}
	
	@RequestMapping(value="deleteStudent/{id}")
	public String deleteStudent(Model model, @PathVariable int id){
		
		dao.deleteStudent(id);
		
		model.addAttribute("studentList", dao.getStudentList());
		
		return "addStudent";
		
	}
	
	@RequestMapping(value="/getStudent/{id}", produces="application/json")
	@ResponseBody
	public Map<String, Object> getStudent(@PathVariable int id) {
		
		
		Map<String, Object> data = new HashMap<String, Object>();
		Student student = dao.getStudent(id);
		data.put("student", student);
		
		return data;
		
		
	}
	
	@RequestMapping(value="/getStudent", produces="application/json")
	@ResponseBody
	public Map<String, Object> getStudent() {
		
		
		Map<String, Object> data = new HashMap<String, Object>();
		Student student = dao.getStudent();
		data.put("student", student);
		
		return data;
		
		
	}
	
	
}
