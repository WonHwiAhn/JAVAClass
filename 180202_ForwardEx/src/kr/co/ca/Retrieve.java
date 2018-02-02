package kr.co.ca;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Retrieve implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("retrieve", "를 자세히 보기");
		
		return new CommandAction(false, "retrieve.jsp");
	}

}
