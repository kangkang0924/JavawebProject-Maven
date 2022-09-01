package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InfoModel;
import model.UserModel;
import domain.Information;

public class InfoAddServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		Information information = new Information();
		information.setDetail(request.getParameter("detail"));
		information.setInformation(request.getParameter("information"));
		information.setItype(request.getParameter("itype"));
		information.setPhone(request.getParameter("phone"));
		information.setPubtime(request.getParameter("pubtime"));
		
		UserModel userModel = new UserModel();
		try {
			
			String username = request.getParameter("username");
			Object[] userId = userModel.UserId(username);
			information.setUid((int) userId[0]);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InfoModel infoModel = new InfoModel();
		try {
			
			boolean infoAdd = infoModel.InfoAdd(information);
			if(infoAdd)
			{
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
