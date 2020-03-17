package action;

import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BoardVO;
import domain.SearchVO;
import lombok.AllArgsConstructor;
import persistence.BoardDAO;
import upload.UploadUtil;
@AllArgsConstructor
public class UpdateAction implements Action {
	
	private String path;
	
	
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		//qna_board_modify.jsp 넘긴 값 가져오기
		//파일첨부가 될 예정이기 때문에 WriteAction 참고해서 작성
		UploadUtil uploadUtil = new UploadUtil();
		HashMap<String, String> map = uploadUtil.getItem(req);
		
		int page = Integer.parseInt(map.get("page"));
		
		int bno = Integer.parseInt(map.get("bno"));
		String password = map.get("password");
		
		
		String criteria = "";
		String keyword = "";
		if(map.containsKey("criteria")) {
			
			criteria = map.get("criteria");
			keyword = URLEncoder.encode(map.get("keyword"), "utf-8");
		}
		
		
		
		//해당글의 비밀번호가 맞는지 확인하기
		BoardDAO dao = new BoardDAO();
		int check = dao.passwordCheck(bno, password);
		
		BoardVO vo = new BoardVO();
		
		if(check == 0) {
			path = "qModify.do?bno="+map.get("bno")+"&page="+page;
			return new ActionForward(path, true);
		}
		
		
		//map에 들어있는 정보를 vo에 담기
		vo.setBno(bno);
		vo.setName(map.get("name"));
		vo.setTitle(map.get("title"));
		vo.setContent(map.get("content"));
		vo.setPassword(password);
		if (map.containsKey("file")) {
			vo.setAttach(map.get("file"));
		}
		//수정이 완료되면 수정이 잘 되었는지 현재 게시물 보여주기
		
		int result = dao.updateArticle(vo);
		if(result != 0) {
			path += "?bno="+bno+"&page="+page+"&criteria="+criteria+"&keyword="+keyword;
		}else {
			path = "qModify.do?bno="+bno+"&page="+page+"&criteria="+criteria+"&keyword="+keyword;
		}
		
				
		return new ActionForward(path, true);
	}

}
