package com.project.model;

import java.sql.Date;

public class User {
	private Long id;
	private String name;
	private String phone;
	private String email;
	private String userName;
	private String password;
	private String address;
	private String proffesion;
	private Date birthDate;
	private boolean premium;

	public User(String name, String phone, String email, String userName, String password, String address,
			String proffesion, Date birthDate, boolean premium) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.proffesion = proffesion;
		this.birthDate = birthDate;
		this.premium = premium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

}
