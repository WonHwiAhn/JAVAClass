package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test4
 */
@WebServlet("*.do")
public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		///180201_UrlPatternEx/webtoon.do
		//    contextPath    || servletPath         
		String uri = request.getRequestURI();
		System.out.println(uri);
		String ctxPath = request.getContextPath();
		System.out.println(ctxPath);
		System.out.println(uri.replace(ctxPath, ""));
		String what = uri.substring(ctxPath.length());
		
		Command1 com = null;
		
		if(what.equals("/webtoon.do")){
			com = new Webtoon();
		}else if(what.equals("/hello.do")){
			com = new Hello();
		}else if(what.equals("/email.do")){
			com = new Email();
		}
		
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
