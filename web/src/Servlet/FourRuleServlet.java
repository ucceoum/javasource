package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourRuleServlet
 */
@WebServlet("/FourRuleServlet")
public class FourRuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//사용자가 입력한 데이터 가져오기
		int num1 = Integer.parseInt(req.getParameter("num1"));
		String op = req.getParameter("op");
		int num2 = Integer.parseInt(req.getParameter("num2"));
		System.out.println(num1+op+num2);
		
		int result = calc(num1,num2,op);
		
		
		//사용자에게 결과를 보여줄 페이지 작성
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		out.print("<html><head><title>사칙연산 결과</title></head>");
		out.print("<body><h1>사칙연산결과</h1>");
		out.printf("<h2>%d %s %d = %d</h2>",num1,op,num2,result);
		out.print("</body></html>");
		
	}

	
	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private int calc(int num1, int num2, String op) {
		int result = 0;
		//사칙연산을 한 후 결과 리턴
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break; 
		case "/":
			result = num1 / num2;
			break;
		default:
			break;
		}
		return result;
	}
}
