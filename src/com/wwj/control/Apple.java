package com.wwj.control;

class Apple { //包访问权限的类

	String name; // 成员是包访问权限

	// 方法是包访问权限
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

}
