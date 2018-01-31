package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class RegistServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String userName = request.getParameter("userName");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("���� ������ ������ ID�� " + id + "�Դϴ�.<br>");
		out.print("���� ������ ������ PW�� " + pw + "�Դϴ�.<br>");
		out.print("���� ������ ������ �̸��� " + userName + "�Դϴ�.<br>");
		out.print("���� ������ ������ ������ " + sex + "�Դϴ�.<br>");
		out.print("���� ������ ������ ��̴� ");
		for(String x : hobby){
			out.print(x+" ");
		}
		out.print("�Դϴ�<br>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		//getParameterNames�� �̿��ؼ� �Ѱܹ��� name���� ��� �о���� �� �ִ�
		//�׷��� get��Ŀ��� ����� ��� ���������� ������ url�� ���̸� ���� �̻����� �� ����.
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			
			String[] val = request.getParameterValues(name);
			for(String x:val){
				System.out.println(x);
			}
		}
	}

}