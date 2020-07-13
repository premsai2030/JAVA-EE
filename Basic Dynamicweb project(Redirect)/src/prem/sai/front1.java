package prem.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class front1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String roll_number=request.getParameter("roll_number");
	String course=request.getParameter("course");
	String section=request.getParameter("section");
	//PrintWriter printWriter=response.getWriter();
	//printWriter.print(name+"   "+ roll_number +"    "+course+"   "+section);
	HttpSession session=request.getSession();
	session.setAttribute("name",name);
	session.setAttribute("roll_number",roll_number);
	session.setAttribute("course",course);
	session.setAttribute("section",section);
	response.sendRedirect("records.jsp");
		}

}
