package ca.sheridancollege.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.Feedback;
import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("feedBackPage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		
		//date object formatted then stored? I HOPE SO 
		Date cDate = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd :ss");
		String cDateString = dateFormat.format(cDate);
		System.out.println(cDateString);
				
		//creating POJO from servlet with date dept and feedback, trying to add the date so i can store it below, 
		//also i must instantiate my dao, and call my method to dave data to my db
		
		Feedback feedback = new Feedback(
				request.getParameter("depatmentSelect"),
				request.getParameter("fbArea"),
				cDateString);
		
		//here is dao saving 
		dao.saveOrUpdate(feedback);
		
		List<Feedback> feedbackList = dao.queryMonth(feedback.getDate(), feedback.getDepartment());
		
		request.setAttribute("feedbackList", feedbackList);
		request.getRequestDispatcher("/displayResult.jsp").forward(request, response);
		
	
	}

}
