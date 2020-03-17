package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.LoginVO;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//loginProcess.jsp에서 했던 작업 하기
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		
		//세션작업
		HttpSession session = request.getSession();
		session.setAttribute("loginVO", new LoginVO(userid, userpwd));

		//login 페이지로 이동
		response.sendRedirect("session/login.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
