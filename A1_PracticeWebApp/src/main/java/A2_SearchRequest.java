import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sss")
public class A2_SearchRequest extends HttpServlet
{
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("hello");
		PrintWriter pw= res.getWriter();
		pw.println("I reached....");
		
		String search1= req.getParameter("search1");
		
		pw.println("You searched - "+search1);
				
	}
	
}

