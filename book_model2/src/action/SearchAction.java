package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BookVO;
import persistence.BookDAO;

public class SearchAction implements Action {
	
	private String path;
	
	public SearchAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//book_search.jsp에서 넘긴 값 가져오기
		String keyword = request.getParameter("keyword");
		String criteria = request.getParameter("criteria");


		ActionForward af = new ActionForward();
		
		
		//db작업
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> list = dao.searchAll(criteria, keyword);
		if(list.isEmpty()) {	//검색결과 없음
			af.setRedirect(true);
			af.setPath("view/error.jsp?msg=search");
		}else {
			//리턴받은 검색결과를 request 속성에 담고
			request.setAttribute("bookList", list);
			af.setRedirect(false);
			af.setPath(path);
		}
		

		
		//페이지 이동 => book_searchAll.jsp
		
		//return new ActionForward(false, path);
		return af;
	}

}
