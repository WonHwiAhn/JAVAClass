package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello implements Command1 {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("HEEEEELLLLLLLLOOOOOOOOOOO");
		out.print("</body>");
		out.print("</html>");
	}

}
