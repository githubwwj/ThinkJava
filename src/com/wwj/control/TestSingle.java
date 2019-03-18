package com.wwj.control;

public class TestSingle {

	public static void main(String[] args) {
		
		SingleInstance singleInstance = SingleInstance.getSingleInstance();
		singleInstance.print();
		

	}

}
