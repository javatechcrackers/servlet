package pkk.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class XmlServelet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Servet From XML");
	response.getWriter().print("<body>Servet From XML</body>");
	System.out.println("<body>Servet From XML</body>");
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	String username= request.getParameter("username");
	out.println("Hello" + username);
	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out= response.getWriter();
String username= request.getParameter("username");
out.println("Hello \t" + username + "\n");
String fullname= request.getParameter("fullname");		
out.println("Your full name is \t" + fullname + "\n");
String prof=request.getParameter("prof");
out.println("you are " + prof);
String[] location=request.getParameterValues("location");
out.println("Your are living \t" + location.length + " places \n");
for(int i=0; i<location.length; i++)
{
	out.println("which are " + location[i] +"\t");
}
	
	}

}
