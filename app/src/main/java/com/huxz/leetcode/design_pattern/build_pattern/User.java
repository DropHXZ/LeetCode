package com.huxz.leetcode.design_pattern.build_pattern;

/**
 * create by huxz on 2019/3/18
 * 功能：构建者模式
 */
public class User {

	private String name;
	private String phone;
	private String email;
	private String address;

	private User() {

	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}

	public static class Builder{
		private String name;
		private String phone;
		private String email;
		private String address;

		public Builder(){

		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		public String getEmail() {
			return email;
		}

		public String getAddress() {
			return address;
		}

		public User build(){
			User user = new User();
			user.name = name;
			user.phone = phone;
			user.email = email;
			user.address = address;
			return user;
		}
	}
}
