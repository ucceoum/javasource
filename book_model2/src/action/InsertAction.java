package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BookVO;
import persistence.BookDAO;

public class InsertAction implements Action {
	
	private String path;
	
	
	public InsertAction(String path) {
		super();
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//book_insert.jsp에서 넘긴 값 가져오기
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookVO vo = new BookVO();
		
		vo.setCode(code);
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setPrice(price);
		
		BookDAO dao = new BookDAO();
		
		int result = dao.book_insert(vo);
		
		
		if(result == 0){		//도서 입력 실패
			path = "view/error.jsp?msg=insert";
		}
		
		
		return new ActionForward(true, path);
	}

}
