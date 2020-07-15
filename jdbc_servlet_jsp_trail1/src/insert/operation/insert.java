package insert.operation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import insert.operation.dao.Dao;
import insert.operation.modal.Modal;


@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Customer_ID=request.getParameter("Customer_ID");
		String Source_account_number=request.getParameter("Source_account_number");
		String Target_account_number=request.getParameter("Target_account_number");
		String Amount_Base_Currency=request.getParameter("Amount_Base_Currency");
		Modal modal=new Modal(Customer_ID, Source_account_number, Target_account_number, Amount_Base_Currency);
		Dao dao=new Dao();
		try {
			if (dao.ok(modal)==1) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			request.setAttribute("Customer_ID", Customer_ID);
			dispatcher.forward(request,response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
