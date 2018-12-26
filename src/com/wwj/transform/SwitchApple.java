package com.wwj.transform;

public class SwitchApple {

	/**
	 * 1 超高品质 
	 * 2 高品质 
	 * 3 中等品质 
	 * 4 一般品质 
	 * 5 差品质
	 * 
	 * switch(integer-select){
	 * 		case integer-value0:
	 * 			break;
	 * 		case integer-value1:
	 * 			break;
	 * 		default:
	 * 			break;
	 * }
	 */
	public static void main(String[] args) {

		int appleLevel=3;
		
		switch(appleLevel){
		case 1:
			System.out.println("超高品质 ");
			break;
		case 2:
			System.out.println("高品质 ");
			break;
		case 3:
			System.out.println("中等品质 ");
			break;
		case 4:
			System.out.println("一般品质  ");
		case 5:
			System.out.println("差品质");
			break;
			
		}
		System.out.println("main");
	}
}
