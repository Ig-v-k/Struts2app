package com.o7planning.struts2Annotation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Action(value = "login",
	results = {
		@Result(name = "showForm", location = "/WEB-INF/pages/login.jsp"),
		@Result(name = "loginError", location = "/WEB-INF/pages/login.jsp"),
		@Result(name = "loginSuccess", type = "redirect", location = "/userInfo")
	}
)
public class LoginAction extends ActionSupport
{
	private static final long serialVersionUID = 2L;
	private String username;
	private String password;
	
	@Override
	public String execute()
	{
		if(this.username == null && this.password == null)
		{
			return "showForm";
		}
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if("admin".equals(username) && "password".equals(password))
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("loginedUsername", this.username);
			
			return "loginSuccess";
		}
		
		else
		{
			String message = getText("error.login");
			
			addActionError(message);
			
			return "loginError";
		}
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
