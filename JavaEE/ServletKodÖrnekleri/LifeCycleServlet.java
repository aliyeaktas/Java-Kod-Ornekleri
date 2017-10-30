package _01.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycleservlet")
public class LifeCycleServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException{
		
		//konfigurasyon
		
		System.out.println("lifecycleservlet#init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("lifecycledoGet");
		
		System.out.println("lifecycleservletdoGet is called");
		System.out.println("test");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroying...");
	}
}
