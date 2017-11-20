package com.company.abstractfactory.model;

/**
 * Created by arpine on 11/19/17.
 */
public class User {
	private String email;
	private Integer age;
	private Integer id;
	private String username;

	public User(String username, String email, Integer age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
