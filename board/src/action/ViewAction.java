package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BoardVO;
import domain.SearchVO;
import lombok.AllArgsConstructor;
import persistence.BoardDAO;
@AllArgsConstructor
public class ViewAction implements Action {
	
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		BoardDAO dao = new BoardDAO();
		//조회수 업데이트
		req.setCharacterEncoding("utf-8");
		int bno = Integer.parseInt(req.getParameter("bno"));
		
		//페이지 나누기 후 추가된 정보
		int page = Integer.parseInt(req.getParameter("page"));
		
		// 
		String criteria = req.getParameter("criteria");
		String keyword = req.getParameter("keyword");
		
		
		
		//bno에 해당하는 내용 request 객체에 담기
		BoardVO vo = dao.getRow(bno);
		
		if(vo != null) {
			path += "?page="+page;
			req.setAttribute("vo", vo);
			req.setAttribute("search", new SearchVO(criteria, keyword));
		}
		
		
//		System.out.print("view - "+keyword);
		return new ActionForward(path, false);
	}

}
