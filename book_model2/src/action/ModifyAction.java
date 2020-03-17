package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.BookDAO;

public class ModifyAction implements Action {
	
	private String path;
	
	
	public ModifyAction(String path) {
		super();
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		//book_modify.jsp에서 넘긴 값 가져오기
		String code = request.getParameter("code");
		int price = Integer.parseInt(request.getParameter("price"));
		
		//DB 수정작업
		BookDAO dao = new BookDAO();
		int result = dao.book_update(code, price);
		//수정성공 후 리스트 보여주기
		
		if(result == 0){
			path = "view/error.jsp?msg=modify";
		}
		return new ActionForward(true, path);
	}

}
