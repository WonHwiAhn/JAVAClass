package kr.co.ca;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new CommandAction(true, "list.do");
	}

}
