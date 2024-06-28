package com.pmb.CompanyProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreateAccount {

	private String name;
	
	@Id
	private String email;
	
	private long mobile;
	
	private String password;
	
	private String repassword;
	
	public CreateAccount() {
		// TODO Auto-generated constructor stub
	}

	public CreateAccount(String name, String email, long mobile, String password, String repassword) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.repassword = repassword;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	@Override
	public String toString() {
		return "CreateAccount [name=" + name + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ ", repassword=" + repassword + "]";
	}
	
	
	
}
