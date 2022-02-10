package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddUp;

/**
 * Servlet implementation class powerServlet
 */
@WebServlet("/powerServlet")
public class powerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public powerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String base = request.getParameter("base");
		String power = request.getParameter("power");
		
		AddUp userData = new AddUp(base, power);
		
		request.setAttribute("userData", userData);
		getServletContext().getRequestDispatcher("/resultPow.jsp").forward(request, response);
	}

}
