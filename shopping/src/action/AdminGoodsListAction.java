package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.GoodsVO;
import lombok.AllArgsConstructor;
import persistence.GoodsDAO;
@AllArgsConstructor
public class AdminGoodsListAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		GoodsDAO dao = new GoodsDAO();
		List<GoodsVO> list = dao.getGoodsList();
		
		
		
		if(list.isEmpty()) {
			
		}else{
			req.setAttribute("list", list);
		}
		
		return new ActionForward(path, false);
	}

}
