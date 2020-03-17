package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자로부터 가져오는 정보에 대한 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		//index.html에서 사용자가 입력한 아이디와 비밀번호 가져오기
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		String useraddr = request.getParameter("useraddr");
		//사용자에게 보여줄 페이지 작성
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>사용자입력정보</title></head>");
		out.print("<body>");
		out.print("<ul><li>아이디 : "+userid+"</li>");
		out.print("<li>비밀번호 : "+userpwd+"</li>");
		out.print("<li>주소 : "+useraddr+"</li></ul>");
		out.print("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
