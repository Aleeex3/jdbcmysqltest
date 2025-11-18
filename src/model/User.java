package model;

import java.security.PrivateKey;

public class User {
	public String name = "Alejandro";
	private String email;
	private String password;
	private boolean isVIP;
//Los atributos de ...
	private long id;

	public User(long id, String string) {
		this.name = string;
	}

    public User(String name, int age, String email, String password, int id, boolean vip, float balance) {
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

	public User(String name2, int age, String email2, String password2, int id2, boolean vip) {
	}

    public int getAge() {
        return 0;
    }

    public boolean isVip() {
        return false;
    }

    public float getBalance() {
        return 0;
    }
}
