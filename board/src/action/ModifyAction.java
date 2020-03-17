package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BoardVO;
import domain.SearchVO;
import lombok.AllArgsConstructor;
import persistence.BoardDAO;
@AllArgsConstructor
public class ModifyAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		int page = Integer.parseInt(req.getParameter("page"));
		//bno 가져오기
		int bno = Integer.parseInt(req.getParameter("bno"));
		
		//검색정보 가져오기
		String criteria = req.getParameter("criteria");
		String keyword = req.getParameter("keyword");
		
		
		
		//db작업(bno에 해당하는 내용 가져오기)
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.getRow(bno);
		//내용 담고 페이지 이동
		if(vo!=null) {
			req.setAttribute("vo", vo);
			req.setAttribute("search", new SearchVO(criteria, keyword));
			path += "?page="+page;
		}
		
		return new ActionForward(path, false);
	}

}
