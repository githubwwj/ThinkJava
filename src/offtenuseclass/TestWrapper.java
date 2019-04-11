package offtenuseclass;

public class TestWrapper {

	public static void main(String[] args) {

		Byte b = new Byte((byte) 120);
		Byte b1 = 120;
		System.out.println(b.equals(b1));

		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1.equals(i2));

		System.out.println("maxValue=" + Integer.MAX_VALUE + "\t minValue=" + Integer.MIN_VALUE);

		System.out.println(Integer.toHexString(60));
		int i3 = Integer.parseInt("12345");
		System.out.println(i3+"--=="+Integer.toString(-60));
		
		//-127,128
	}

}
