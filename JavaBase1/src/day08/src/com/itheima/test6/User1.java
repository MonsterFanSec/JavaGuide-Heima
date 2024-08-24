package com.itheima.test6;

public class User1 {
	//	属性
	private String username;
	private String password;
	private String email;
	private char gender;
	private int age;

	//command + n，选择construct，再选择select_none
	public User1() {
	}

	//command + n,，选择construct,再通过shift第一项和最后一项全选
	public User1(String username, String password, String email, char gender, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	//command + n,选择Getter and Setter，,再通过shift第一项和最后一项全选
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
