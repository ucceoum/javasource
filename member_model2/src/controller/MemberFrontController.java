package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import action.MemberActionFactory;

/**
 * Servlet implementation class MemberFrontController
 */
@WebServlet("*.do")
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//가져오는 데이터에 대한 한글처리
		request.setCharacterEncoding("utf-8");
		//URI 분리 => http://localhost:8080/컨텍스트명/상대경로명
		String requestURI = request.getRequestURI();	// /컨텍스트명/상대경로명
		String contextPath = request.getContextPath();	// /컨텍스트명
		String cmd = requestURI.substring(contextPath.length());	// /상대경로명
		
		//cmd에 따라 Action 생성하기
		MemberActionFactory maf = MemberActionFactory.getInstance();
		Action action = maf.action(cmd);
		
		
		//생성된 action에 일 시키기
		ActionForward af = null;
		try {
			af = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		doGet(request, response);
	}

}
