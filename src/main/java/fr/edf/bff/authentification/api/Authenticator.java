package fr.edf.bff.authentification.api;

public interface Authenticator {

	boolean valid(String username, String password);
}
