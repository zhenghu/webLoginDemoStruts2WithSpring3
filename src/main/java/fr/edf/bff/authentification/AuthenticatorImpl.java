package fr.edf.bff.authentification;

import fr.edf.bff.authentification.api.Authenticator;

public class AuthenticatorImpl implements Authenticator{

	public boolean valid(String username, String password) {
		return username.equals("admin") && password.equals("admin");
	}


}
