package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.BookDAO;

public class RemoveAction implements Action {
	
	private String path;
	
	
	public RemoveAction(String path) {
		super();
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//book_delete.jsp에서 넘긴 값 가져오기
		String code = request.getParameter("code");

		//DB에서 삭제작업
		BookDAO dao = new BookDAO();
		int result = dao.book_delete(code);
		//삭제후 리스트 보여주기
		if(result == 0) {
			path="view/error.jsp?msg=delete";
		}
		
		
		
		return new ActionForward(true, path);
	}

}
