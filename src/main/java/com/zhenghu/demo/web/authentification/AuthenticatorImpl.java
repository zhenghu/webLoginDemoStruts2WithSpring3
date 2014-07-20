package com.zhenghu.demo.web.authentification;

import com.zhenghu.demo.web.authentification.api.Authenticator;

public class AuthenticatorImpl implements Authenticator{

	public boolean valid(String username, String password) {
		return username.equals("admin") && password.equals("admin");
	}


}
