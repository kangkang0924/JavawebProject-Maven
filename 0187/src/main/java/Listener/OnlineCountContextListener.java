package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OnlineCountContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sc2) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext����������...");
	}

	@Override
	public void contextInitialized(ServletContextEvent sc1) {
		//�ڷ�������ʼ��ʱ���ʼ��һ��ֵ0
		//д�뵽servletContext��
		sc1.getServletContext().setAttribute("count", 0);
		
	}

}
