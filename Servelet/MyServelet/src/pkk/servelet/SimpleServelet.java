package pkk.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServelet
 */
@WebServlet(description = "A Simple Servelet", urlPatterns = { "/SimpleServelet" })
public class SimpleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println("Hello From GET Method.....");
		PrintWriter writer= response.getWriter();
		writer.println("<h3> Welcome to HTML</h3>");*/
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String username=request.getParameter("name");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if(username!= "" && username!= null)
		{
			session.setAttribute("saveUserName", username);
			context.setAttribute("saveUserName", username);
			
		}
		writer.println("Request parameter has username" + username);
		writer.println("sessiom parameter has username" + (String)session.getAttribute("saveUserName"));
		writer.println("Context parameter has username" + (String)context.getAttribute("saveUserName"));
		writer.println(request.getLocalAddr());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

