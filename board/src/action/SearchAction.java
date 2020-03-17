package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BoardVO;
import domain.PageVO;
import domain.SearchVO;
import lombok.AllArgsConstructor;
import persistence.BoardDAO;
@AllArgsConstructor
public class SearchAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//검색 폼에서 넘어오는 값 가져오기
		String criteria = req.getParameter("criteria");
		String keyword = req.getParameter("keyword");

		BoardDAO dao = new BoardDAO();
		
		

		int page = 1;
		
		if(req.getParameter("page") != null) {
			page = Integer.parseInt(req.getParameter("page"));
		}
		
		int amount = 10;
		
		
		
		int totalRows = dao.getSearchRows(criteria, keyword);
		
		//총 페이지 수 
		int totalPage = totalRows%10 == 0 ? totalRows/10 : totalRows/10+1;
		
		//endPage
		int endPage = (int)(Math.ceil(page/10.0)*amount);
		
		//startPage
		int startPage = endPage-9;
		
		//실제 마지막 페이지 구하기
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		

		PageVO pageVO = new PageVO();
		pageVO.setStartPage(startPage);
		pageVO.setPage(page);
		pageVO.setEndPage(endPage);
		pageVO.setTotalPage(totalPage);
		
		
		
		
		
		
		//db작업
		List<BoardVO> list = dao.getSearchList(page, amount, criteria, keyword);
		
		req.setAttribute("list", list);
		req.setAttribute("search", new SearchVO(criteria, keyword));
		req.setAttribute("pageVO", pageVO);
		return new ActionForward(path, false);
	}

}
