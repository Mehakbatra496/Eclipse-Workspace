import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sss")
public class A2_SearchRequest extends HttpServlet
{
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		//request response communication by server to browser starts
		System.out.println("hello");
		PrintWriter pw= res.getWriter();
//		pw.println("I reached....");
//		String search1= req.getParameter("search1");
		
//		pw.print("<html>");
//		pw.print("<head>");
//		pw.print("</head>");
//		
//		pw.print("<body>");
//pw.print("<h2>");
//		pw.println("You searched - "+search1);
//		pw.print("</h2>");
//		pw.print("</body>");
//
//		pw.print("</html>");
		
		
//		//request response commutincaton by server to browser ends
//
//		sendError commutincaton by server to browser starts
//
//				res.sendError(404,"hello mehak, page not found"); 
		
		
		//sendError commutincaton by server to browser ends
//		
//		
//		//communication via rtedirection starts
//		pw.print("<html>");
//		pw.print("<head>");
//		pw.print("</head>");
//		
//		pw.print("<body>");
//pw.print("<h2>");
//		pw.println("You searched - "+search1);
		
//		pw.print("</h2>");
		pw.print("<a href=\"https://www.google.com\">Click me</a>");
//
//		pw.println("</body>");
//c
//		pw.print("</html>");
//
		//communication via redirection ends
//		res.setStatus(HttpServletRessps://fs.blog/newsletter/");
		
//		res.sendRedirect("New1.html");
		
		
		// forward and include method start...............................................
			String st1=req.getParameter("search1");
			if(st1.equals("Java"))
			{
					RequestDispatcher rr=req.getRequestDispatcher("New1.html");
					rr.forward(req, res);
			}
			else
			{
				res.setContentType("text/html");
				RequestDispatcher rr1=req.getRequestDispatcher("index.html");

					rr1.include(req, res);
					pw.print("<h4 style='color:red;'>Your search is invalid</h4>");
					
//					res.sendRedirect("https://www.google.com");
				
			}
		
		// forward and include method ends...............................................

	}
	
}

