package action;

import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BoardVO;
import lombok.AllArgsConstructor;
import persistence.BoardDAO;
import upload.UploadUtil;
@AllArgsConstructor
public class ReplyAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		
		BoardDAO dao = new BoardDAO();
		UploadUtil util = new UploadUtil();
		BoardVO vo = new BoardVO();
		//qna_board_reply 값 가져오기
		HashMap<String, String> map = util.getItem(req);
		
		int page = Integer.parseInt(map.get("page"));
		
		vo.setName(map.get("name"));
		vo.setTitle(map.get("title"));
		vo.setContent(map.get("content"));
		vo.setPassword(map.get("password"));
		if(map.containsKey("file")) {
			vo.setAttach(map.get("file"));
		}
		vo.setRe_ref(Integer.parseInt(map.get("re_ref")));
		vo.setRe_lev(Integer.parseInt(map.get("re_lev")));
		vo.setRe_seq(Integer.parseInt(map.get("re_seq")));
		
		String criteria = "";
		String keyword = "";
		if(map.containsKey("criteria")) {
			criteria = map.get("criteria");
			keyword = URLEncoder.encode(map.get("keyword"), "utf-8");
		}
		
		
		
		
		int result = dao.replyArticle(vo);
		
		if(result==0) {
			path="";
		}else {
			
			if(!criteria.isEmpty()) {
			
				path = "qSearch.do?page="+page+"&criteria="+criteria+"&keyword="+keyword;
			}else {
				path += "?page="+page;
			}
		}
		
		
		
		return new ActionForward(path, true);
	}

}
