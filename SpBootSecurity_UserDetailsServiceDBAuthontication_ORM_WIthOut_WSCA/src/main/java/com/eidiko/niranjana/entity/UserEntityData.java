package com.eidiko.niranjana.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntityData
{
	@Id
	private String name;
	private String password;
	private String email;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserModelData [name=" + name + ", password=" + password + ", email=" + email + ", role=" + role + "]";
	}
	
	
}
