package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Function : Login
 */
@WebServlet("/bs")
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String test = request.getParameter("test");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(test);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String test = request.getParameter("test");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(test);
		
		if(id.equals("admin") && pw.equals("1234")){
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30);
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			
			System.out.println("로그인 성공");
			
			response.sendRedirect("as");
		}else{
			System.out.println("로그인 실패");
			response.sendRedirect("login.jsp");
		}
	}

}
