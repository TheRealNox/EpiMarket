package eu.epitech.epimarket.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;

	public String authenticate() {
		if ("Nox".equals(login) && "Nox".equals(password))
			return "success";
		return "failure";
	}
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
