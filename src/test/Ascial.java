package test;

import java.nio.charset.Charset;

public class Ascial {

	public static void main(String[] args) {
		
		for (int i = 33; i <= 126; i++) {
			char c = (char) i;
			if (i % 7 == 0) {
				System.out.println(c + " " + i);
			} else {
				System.out.print(c + " " + i + "\t");
			}

		}
		String defaultEncode=System.getProperty("file.encoding");
		
		System.out.println(defaultEncode);
		
		Charset ch=Charset.defaultCharset();
		System.out.println(ch);
	}

}
