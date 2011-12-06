package eu.epitech.epimarket.entities;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String name;
	private String password;
	private String email;
	private String adress;
	private String phone;
	
	public Account(Account that) {
		this(that.login, that.name, that.password, that.email, that.adress, that.phone);
	}

	public Account(String login, String name, String password, String email, String adress, String phone) {
		super();
		this.setLogin(login);
		this.setName(name);
		this.setPassword(password);
		this.setEmail(email);
		this.setAdress(adress);
		this.setPhone(phone);
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "";
	}
}
