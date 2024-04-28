import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;

@WebServlet("/")

public class LoginVerificationPage extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello, mhk");
		
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		pw.print("<h2>Your details need to get verified </h2>");

	}
	
}