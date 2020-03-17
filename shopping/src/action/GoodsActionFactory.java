package action;

public class GoodsActionFactory {
	
	private static GoodsActionFactory gaf;
	
	private GoodsActionFactory() {}
	public static GoodsActionFactory getInstance() {
		if(gaf == null) {
			gaf = new GoodsActionFactory();
		}
		return gaf;
	}
	
	Action action = null;
	
	public Action action(String cmd) {
//		System.out.print("cmd"+cmd);
		if(cmd.equals("/insert.do")) {
			action = new AdminGoodsAddAction("goodsList.do");
		}else if(cmd.equals("/goodsList.do")) {
			action = new AdminGoodsListAction("admin_goods_list.jsp");
		}
		
		
		
		return action;
	}
	
	
	
	
}
