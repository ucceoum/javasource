package action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import persistence.BoardDAO;
@AllArgsConstructor
public class DeleteAction implements Action {

	private String path;
	
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		//qna_board_pwdCheck.jsp 에서 넘긴 값 가져오기
		int bno = Integer.parseInt(req.getParameter("bno"));
		String password = req.getParameter("password");
		int page = Integer.parseInt(req.getParameter("page"));
		BoardDAO dao = new BoardDAO();
		
		
		//검색정보 가져오기
		String criteria = req.getParameter("criteria");
		String keyword = URLEncoder.encode(req.getParameter("keyword"), "utf-8");
		
		
		
		//DB작업 - 비밀번호 확인
		int check = dao.passwordCheck(bno, password);
		
		//비밀번호가 맞지 않으면 원래 페이지로 돌려보내기
		if(check == 0) {
			path = "view/qna_board_pwdCheck.jsp?bno="+bno+"&page="+page+"&criteria="+criteria+"&keyword="+keyword;
			return new ActionForward(path, true);
		}
		//비밀번호가 맞으면 삭제작업 진행 후 리스트 보여주기
		
		int result = dao.deleteArticle(bno);
		
		if(result == 0) {
			path = "view/qna_board_pwdCheck.jsp?bno="+bno+"&page="+page+"&criteria="+criteria+"&keyword="+keyword;
		}
		
		//검색에서 온 경우 path 재설정
		
		if(!criteria.isEmpty()) {
			path = "qSearch.do?page="+page+"&criteria="+criteria+"&keyword="+keyword;
			
		}else {
			path += "?page="+page;
		}
		
		
		
		return new ActionForward(path, true);
	}

}
