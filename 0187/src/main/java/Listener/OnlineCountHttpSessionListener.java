package Listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// ������
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"������...");
		Integer count = (Integer) session.getServletContext().getAttribute("count");
		count++;
		session.getServletContext().setAttribute("count", count);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"������...");
		Integer count = (Integer) session.getServletContext().getAttribute("count");
		count--;
		session.getServletContext().setAttribute("count", count);
		
	}

}
