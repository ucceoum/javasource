package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.MemberVO;
import persistence.MemberDAO;

public class ModifyAction implements Action{
	
	private String path;

	public ModifyAction(String path) {	//view/loginForm.jsp
		super();
		this.path = path;
	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//modifyForm.jsp에서 넘긴 값 가져오기
		String current_password = req.getParameter("current_password");
		String new_password = req.getParameter("new_password");
		String confirm_password = req.getParameter("confirm_password");
		
		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO)session.getAttribute("vo");
		
		
		//새비밀번호와 새비밀번호 확인이 같은 값인지 확인
		if(new_password.equals(confirm_password)){
			
			//현재 비밀번호가 맞는지 확인하기 => islogin
			MemberDAO dao = new MemberDAO();
			
			MemberVO vo1 = dao.isLogin(vo.getUserid(), current_password);
			if(vo1 != null){
				//맞다면 비밀번호 변경
				//세션 해제
				//로그인폼 보여주기
				int result = dao.memberUpdate(vo.getUserid(), new_password);
				
				session.removeAttribute("vo");
				
				
			}else{
				//현재 비밀번호가 맞지 않다면 modifyForm.jsp 보여주기
				path="view/modifyForm.jsp";
			}

			
		}else{
			path="view/modifyForm.jsp";
		}
		
		
		
		
		
		
		
		return new ActionForward(true, path);
	}
	
	
	
}
