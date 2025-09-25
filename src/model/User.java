package model;

import java.security.PrivateKey;

public class User {
	public String name = "Alejandro";
	private String email;
	private String password;
	private boolean isVIP;
//Los atributos de ...
	private long id;

	public User(long id, String name) {
		this.name = name;
	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User() {
	}

}
