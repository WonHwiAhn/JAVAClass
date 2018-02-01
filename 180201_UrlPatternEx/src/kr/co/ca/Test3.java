package kr.co.ca;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test3
 */
@WebServlet("*.ca")
public class Test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String fullPath = request.getContextPath();
		String servletPath = uri.substring(fullPath.length());
		System.out.println(servletPath);
		
		Command1 com = null;
		
		if(servletPath.equals("/hello.ca")){
			com = new Hello();
		}else if(servletPath.equals("/nice.ca")){
			com = new Nice();
		}else if(servletPath.equals("/stir.ca")){
			com = new Stir();
		}else if(servletPath.equals("/meet.ca")){
			com = new Meet();
		}
		
		if(com != null)
			com.execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
