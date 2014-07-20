package com.zhenghu.demo.web.actions;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.zhenghu.demo.web.authentification.api.Authenticator;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7511493676593240023L;

	private static final Logger logger = Logger.getLogger(LoginAction.class);

	private String username;
	private String password;

	//ID via Spring
	@Autowired
	Authenticator authenticator;

	public String execute() {

		if (!authenticator.valid(username, password)) {
			addActionError(getText("error.login"));
			return ActionSupport.ERROR;
		}
		
		logger.debug("Utilisateur '" + username + "' est login.");
        return ActionSupport.SUCCESS;

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