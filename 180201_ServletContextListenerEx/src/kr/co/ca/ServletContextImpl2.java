package kr.co.ca;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextImpl2 implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("���ø����̼� ����");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("���ø����̼� ����");
	}

}
