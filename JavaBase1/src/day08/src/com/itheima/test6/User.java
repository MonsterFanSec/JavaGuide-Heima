package com.itheima.test6;

public class User {
	//	属性
	private String username;
	private String password;
	private String email;
	private char gender;
	private int age;


	//	空参
	public User() {
	}

	//	带全部参数的构造
	public User(String username, String password, String email, char gender, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	//	get和set方法（手写）
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
