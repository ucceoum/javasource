package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.GoodsVO;
import lombok.AllArgsConstructor;
import persistence.GoodsDAO;
@AllArgsConstructor
public class AdminGoodsAddAction implements Action {
	
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		GoodsDAO dao = new GoodsDAO();
		GoodsVO vo = new GoodsVO();
		
		
		
		
		vo.setCategory(req.getParameter("category"));
		vo.setName(req.getParameter("name"));
		vo.setPrice(Integer.parseInt(req.getParameter("price")));
		vo.setColor(req.getParameter("color"));
		vo.setAmount(Integer.parseInt(req.getParameter("amount")));
		vo.setGoodssize(req.getParameter("goodssize"));
		vo.setContent(req.getParameter("content"));
		
		
		
		
		int result = dao.insertGoods(vo);
		
		if(result == 0) {
			path = "admin_goods_write.jsp";
		}
		
		
		
		
		return new ActionForward(path, true);
	}

}
