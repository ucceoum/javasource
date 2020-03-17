package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.MemberVO;
import persistence.MemberDAO;

public class JoinAction implements Action {
	
	private String path;
	
	public JoinAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		req.setCharacterEncoding("utf-8");
		//joinForm.jsp에서 사용자 입력값 가져오기
		String userId = req.getParameter("userid");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		MemberVO vo = new MemberVO(userId, password, name, gender, email);
		//DB작업
		MemberDAO dao = new MemberDAO();
		
		int result = dao.joinMember(vo);
		//입력성공시 로그인페이지로 이동
		//입력실패시 회원가입 페이지로 이동
		if(result==0) {
			path = "view/joinForm.jsp";
		}
		
		
		
		return new ActionForward(true, path);
	}

}
