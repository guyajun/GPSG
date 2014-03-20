package common.base.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
SessionAware, ServletResponseAware{

	/**
	 * BaseAction
	 * @author zhou bo
	 */
	private static final long serialVersionUID = 150688526687081786L;
	

	
	protected HttpServletRequest request;

	protected HttpServletResponse response;
	
	protected Map<String,Object> session;

	protected ServletContext context;
	
	protected String message;
	
	public void setServletContext(ServletContext arg0) {
		this.context = arg0;
	}

	protected ServletContext getServletContext() {
		return this.context;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}
	
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}


	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
