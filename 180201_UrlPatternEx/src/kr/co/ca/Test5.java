package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test5
 */
@WebServlet("*.bo")
public class Test5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String ctxPath = request.getContextPath();
		String srvPath = uri.substring(ctxPath.length());
		
		PrintWriter out = response.getWriter();
		
		Command1 com = null;
		
		System.out.println(srvPath);
		out.print("<html>");
		out.print("<body>");
		if(srvPath.equalsIgnoreCase("/select.bo")){
			//new SelectCommand1().execute(request, response);
			com = new SelectCommand1();
		}else if(srvPath.equalsIgnoreCase("/selectById.bo")){
			//out.print("selectById입니다.");
			com = new SelectByIdCommand1();
		}else if(srvPath.equalsIgnoreCase("/insert.bo")){
			//out.print("insert입니다.");
			com = new InsertCommand1();
		}else if(srvPath.equalsIgnoreCase("/update.bo")){
			//out.print("update입니다.");
			com = new UpdateCommand1();
		}else if(srvPath.equalsIgnoreCase("/delete.bo")){
			//out.print("delete입니다.");
			com = new DeleteCommand1();
		}
		
		if(com != null){
			com.execute(request, response);
		}
		
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
