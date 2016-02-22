package ca.sheridancollege.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.Users;
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
		
		response.sendRedirect("votingAndResults.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		
		//put users pojo data in DB
		Users users = new Users(
				request.getParameter("email"),
				request.getParameter("selectSong1"),
				request.getParameter("selectSong2"),
				request.getParameter("selectSong3")
				);
		
		dao.saveOrUpdate(users);
		
		
		//ranking operations
		int rankTSwift,rankTheWeeknd, rankEllieG, rankWKhalifa, rankJBieber;

		int totalUV = dao.queryTotalUniqueVotes().size();
		int totaltswift1 = dao.querySong1("tSwift").size();
		int totalttheWeeknd1 = dao.querySong1("theWeeknd").size();
		int totaltellieG1 = dao.querySong1("ellieG").size();
		int totaltwKhalifa1 = dao.querySong1("wKhalifa").size();
		int totaltjBieber1 = dao.querySong1("jBieber").size();

		int totaltswift2 = dao.querySong2("tSwift").size();
		int totalttheWeeknd2 = dao.querySong2("theWeeknd").size();
		int totaltellieG2= dao.querySong2("ellieG").size();
		int totaltwKhalifa2 = dao.querySong2("wKhalifa").size();
		int totaltjBieber2 = dao.querySong2("jBieber").size();
		
		int totaltswift3 = dao.querySong3("tSwift").size();
		int totalttheWeeknd3 = dao.querySong3("theWeeknd").size();
		int totaltellieG3 = dao.querySong3("ellieG").size();
		int totaltwKhalifa3 = dao.querySong3("wKhalifa").size();
		int totaltjBieber3 = dao.querySong3("jBieber").size();
		
		rankTSwift = (totaltswift1 * 5) + (totaltswift2 * 3) + (totaltswift3 * 1);
		rankTheWeeknd = (totalttheWeeknd1 * 5) + (totalttheWeeknd2 * 3) + (totalttheWeeknd3 * 1);
		rankWKhalifa = (totaltwKhalifa1 * 5) + (totaltwKhalifa2 * 3) + (totaltwKhalifa3 * 1);
		rankJBieber = (totaltjBieber1 * 5) + (totaltjBieber2 * 3) + (totaltjBieber3 * 1);
		// they end here
		
		//set attributes
		request.setAttribute("totalUniqueVotes", totalUV);
		request.setAttribute("RANKtswift", rankTSwift);
		request.setAttribute("RANKtheweeknd", rankTheWeeknd);
		request.setAttribute("RANKwkhalifa", rankWKhalifa);
		request.setAttribute("RANKjbieber", rankJBieber);
		
		request.getRequestDispatcher("/votingAndResults.jsp").forward(request, response);
		
		
	}

}
