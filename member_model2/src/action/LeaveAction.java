package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.MemberVO;
import persistence.MemberDAO;

public class LeaveAction implements Action {
	
	private String path;
	
	public LeaveAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		//leaveForm에서 넘긴 값 가져오기 - userid, current_password
		String userid = req.getParameter("userid");
		String password = req.getParameter("current_password");
		
		//DB확인 - 아이디와 비밀번호 맞는지 확인
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.isLogin(userid, password);
		
		if(vo != null){
		//맞다면 회원삭제
		//회원삭제 성공 후 세션삭제
			int result = dao.leave(userid, password);
			if(result > 0){
				HttpSession session = req.getSession();
				session.removeAttribute("vo");
			}
		}else{
		//비밀번호가 맞지 않다면 
		//leaveForm.jsp로 돌려보내기
			path = "view/leaveForm.jsp";
		}
		
		
		return new ActionForward(true, path);
	}

}
