package com.zhenghu.demo.web.actions;

import org.apache.struts2.StrutsSpringTestCase;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class LoginActionTest extends ConfigTest {
	
	@Test
	public void test_execute_should_return_sucess_if_login_valid() throws Exception {
		// Given
		String username = "admin";
		String password = "admin";
		request.setParameter("username", username);
		request.setParameter("password", password);

		ActionProxy actionProxy = getActionProxy("jsp/login.action");
		LoginAction loginAction = (LoginAction) actionProxy.getAction();
		
		Assertions.assertThat(loginAction).isNotNull();

		// When
		String result = actionProxy.execute();

		// Then
		Assertions.assertThat(result).isEqualTo("success");

	}

	@Test
	public void test_execute_should_return_errors_if_login_invalid() throws Exception {
		// Given
		String username = "any";
		String password = "any";
		request.setParameter("username", username);
		request.setParameter("password", password);

		ActionProxy actionProxy = getActionProxy("jsp/login.action");

		LoginAction loginAction = (LoginAction) actionProxy.getAction();
		Assertions.assertThat(loginAction).isNotNull();

		// When
		String result = actionProxy.execute();

		// Then
		Assertions.assertThat(result).isEqualTo("error");
	}
}
