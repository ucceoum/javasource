package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.MemberVO;
import persistence.MemberDAO;

public class LoginAction implements Action {
	
	private String path;
	
	
	public LoginAction(String path) {	//view/loginForm.jsp
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//loginFrom.jsp 에서 넘긴 값 가져오기
		String userid = req.getParameter("userid");
		String password = req.getParameter("current_password");

		//DB작업
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.isLogin(userid, password);
		
		//받은 vo를 세션에 담기
		//loginForm 페이지로 이동
		HttpSession session = req.getSession();
		session.setAttribute("vo", vo);		
		
		
		
		
		return new ActionForward(true, path);
	}

}
