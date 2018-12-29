package com.o7planning.struts2Annotation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "userInfo",
	results = {
			@Result(name = "userInfoPage", location = "/WEB-INF/pages/userInfo.jsp")
	}
)

public class UserInfoAction extends ActionSupport{
	
	private static final long serialVersionUID = 3L;
	
	@Override
	public String execute()
	{
		return "userInfoPage";
	}
}
