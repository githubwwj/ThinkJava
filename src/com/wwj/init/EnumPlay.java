package com.wwj.init;

public class EnumPlay {

//	public enum STATUS {
//		GOOD, BAD, VERY_GODD, NICE, JUST_SO_SO
//	}

	public static void main(String[] args) {

		STATUS status = STATUS.BAD;

		print(status);
		print(STATUS.VERY_GODD);

		for (STATUS s : STATUS.values()) {
			System.out.println(s + "----" + s.ordinal());
		}

	}

	static void print(STATUS status) {
		// switch(常量表达式){
		// case:常量因子
		// break;
		// }

		switch (status) {
		case GOOD:
			System.out.println("挺好的");
			break;
		case BAD:
			System.out.println("----坏的---");
			break;
		case VERY_GODD:
			System.out.println("---好极了----");
			break;
		default:
			break;
		}
	}

}
