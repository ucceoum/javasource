package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.BookVO;
import persistence.BookDAO;

public class SelectAction implements Action {
	
	private String path;
	
	public SelectAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		BookDAO dao = new BookDAO();
		
		ArrayList<BookVO> list = dao.getList();
		
		
		request.setAttribute("list", list);
		
		
		
		return new ActionForward(false, path);
	}

}
