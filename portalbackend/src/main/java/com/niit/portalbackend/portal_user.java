package com.niit.portalbackend;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class portal_user {

	@Id
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String Mobile;
	private String user_role;
	private boolean status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user", fetch=FetchType.EAGER)
	private List<Blog> blogs;
	
	
	public List<Blog> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return this.firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return this.Mobile;
	}
	public void setMobile(String mobile) {
		this.Mobile = mobile;
	}
	public String getUser_role() {
		return this.user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public boolean isStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
