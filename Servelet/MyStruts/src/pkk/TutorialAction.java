package pkk;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction extends ActionSupport {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String execute(){
	System.out.println("hello from execute");
	return "failure";
	
}
}
