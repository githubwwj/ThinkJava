package com.wwj.init;

public class InitValues2 {

	boolean bool = true;
	byte b = 10;
	char c = 'A';
	short s = 0XFF;
	int i = 666;
	long l = 999;
	float f = 10.3F;
	double d = 33.33;
	InitValues initValue = new InitValues();

	public static void main(String[] args) {

		InitValues2 initValue = new InitValues2();
		initValue.print();
	}

	void print() {
		System.out.println("bool=" + bool);
		System.out.println("byte=" + b);
		System.out.println("char=" + c);
		System.out.println("short=" + s);
		System.out.println("int=" + i);
		System.out.println("long=" + l);
		System.out.println("float=" + f);
		System.out.println("double=" + d);
		System.out.println("InitValues=" + initValue);
	}

}
