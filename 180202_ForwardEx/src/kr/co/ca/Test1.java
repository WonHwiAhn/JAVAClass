package kr.co.ca;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("*.do")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String ctp = request.getContextPath();
		String srvp = uri.substring(ctp.length());
		
		Command com = null;
		
		if(srvp.equalsIgnoreCase("/webtoon.do")){
			
		}else if(srvp.equalsIgnoreCase("/email.do")){
			
		}else if(srvp.equalsIgnoreCase("/list.do")){
			com = new ListCommand();
		}else if(srvp.equalsIgnoreCase("/retrieve.do")){
			com = new Retrieve();
		}else if(srvp.equalsIgnoreCase("/insertui.do")){
			com = new InsertUICommand();
		}else if(srvp.equalsIgnoreCase("/insert.do")){
			com = new InsertCommand();
		}
		
		if(com != null){
			CommandAction action = com.execute(request, response);
			
			if(action.isRedirect()){
				response.sendRedirect(action.getPath());
			}else{
				RequestDispatcher dp = request.getRequestDispatcher(action.getPath());
				dp.forward(request, response);			
			}
		}
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
