package _01.configservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		
		String name = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		
		PrintWriter pw = resp.getWriter();
		pw.print(name + " " + password);
	}
}
