package action;

public class ActionForward {
	
	//이동방식과 이동경로 setting
	private boolean redirect;	//이동방식 true => sendRedirect
	private String path;		//이동경로

	
	public ActionForward() {
		super();
	}
	public ActionForward(boolean redirect, String path) {
		super();
		this.redirect = redirect;
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
