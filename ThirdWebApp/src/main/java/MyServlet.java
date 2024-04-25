
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/mhkserver2")   //For- http://localhost:8081/ThirdWebApp/mhkserver2
@WebServlet(name = "ms", urlPatterns={"abc","xyz"})
//@WebServlet(name = "ms", urlPatterns = {"/abc", "/xyz"})

public class MyServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
//		System.out.println("Hello, this is my first servlet program");
		PrintWriter out = resp.getWriter();
		out.println("Hello, this is my seventh servlet program");
	}
}


