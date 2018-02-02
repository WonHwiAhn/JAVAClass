package kr.co.ca;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", "회원 목록입니다.");
		
		return new CommandAction(false, "list.jsp");
	}

}
