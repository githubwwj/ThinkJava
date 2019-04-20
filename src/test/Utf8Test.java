package test;

public class Utf8Test {

	public static void main(String[] args) {

		int ch1 = 8;
		int ch2 = 1;
		int temp = ch1 << 8;
		int temp2 = ch2 << 0;
		System.out.println(temp + " temp2=" + temp2);
		short s = (short) ((ch1 << 8) + (ch2 << 0));
		System.out.println(s);
	}

}
