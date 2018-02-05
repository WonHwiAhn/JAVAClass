package kr.co.ca;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Function : Account
 */
@WebServlet("/as")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		if(session == null){
			response.sendRedirect("login.jsp");
		}else{
			String id = (String) session.getAttribute("id");
			String pw = (String) session.getAttribute("pw");
			
			if(id != null && pw != null){
				RequestDispatcher dis =
				request.getRequestDispatcher("afterTransfer.html");
				
				dis.forward(request, response);
			}
			
			System.out.println("Session에 들어있는 id : " + id);
			System.out.println("Session에 들어있는 pw : " + pw);
		}
	}
}
