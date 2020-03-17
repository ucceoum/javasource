package action;

public class ActionFactory {
	private static ActionFactory action = null;
	private ActionFactory() {}
	public static ActionFactory getInstance() {
		if(action == null) {
			action = new ActionFactory();
		}
		return action;
	}
	
	public Action action(String command) {
		Action action = null;
		if(command.equals("/select.do")){
			action = new SelectAction();
		}else if(command.equals("/insert.do")) {
			action = new InsertAction("response.jsp");
		}else if(command.equals("/remove.do")) {
			action = new RemoveAction();
		}else if(command.equals("/update.do")) {
			action = new UpdateAction();
		}
		return action;
	}
	
	
}
