package com.wwj.init;

public class InitValues {

	boolean bool;
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitValues initValue;

	public static void main(String[] args) {

		InitValues initValue = new InitValues();
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
