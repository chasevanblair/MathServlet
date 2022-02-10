package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddUp;

/**
 * Servlet implementation class addUpServlet
 */
@WebServlet("/addUpServlet")
public class addUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uNum1 = request.getParameter("num1");
		String uNum2 = request.getParameter("num2");
		String uNum3 = request.getParameter("num3");
		
		AddUp userData = new AddUp(uNum1, uNum2, uNum3);
		
		request.setAttribute("userData", userData);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
