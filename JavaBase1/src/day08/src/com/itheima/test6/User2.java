package com.itheima.test6;

/**
 * 插件：PTG
 * 实现1s生成标准JavaBean
 * 代码空白处，右键/Ptg To JavaBean
 */
public class User2 {
	//	属性
	private String username;
	private String password;
	private String email;
	private char gender;
	private int age;


	public User2() {
	}

	public User2(String username, String password, String email, char gender, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	/**
	 * 获取
	 *
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置
	 *
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取
	 *
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置
	 *
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取
	 *
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取
	 *
	 * @return gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * 设置
	 *
	 * @param gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * 获取
	 *
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "User2{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
	}
}
