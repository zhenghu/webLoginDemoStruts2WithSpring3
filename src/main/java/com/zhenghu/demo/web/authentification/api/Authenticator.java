package com.zhenghu.demo.web.authentification.api;

public interface Authenticator {

	boolean valid(String username, String password);
}
