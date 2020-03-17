package action;

public class ActionForward {
	//이동 경로 및 이동 방식 
	private String path;
	private boolean Redirect;
	
	
	
	public ActionForward() {
		super();
	}
	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		Redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return Redirect;
	}
	public void setRedirect(boolean redirect) {
		Redirect = redirect;
	}
	
	
	
	
}
