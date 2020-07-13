package prem.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/front_end")
public class front_end extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String roll_number=request.getParameter("roll_number");
      RequestDispatcher requestDispatcher=request.getRequestDispatcher("printing.jsp");
	request.setAttribute("name",name);
	request.setAttribute("roll_number",roll_number);
	requestDispatcher.forward(request, response);
			
	}

}
