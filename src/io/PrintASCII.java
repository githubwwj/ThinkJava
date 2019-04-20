package io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class PrintASCII {

	public static void main(String[] args) {

		for (int i = 33; i < 126; i++) {
			if (i % 7 == 0) {
				System.out.println((char) i + " " + i);
			} else {
				System.out.print((char) i + " " + i + "\t");
			}

		}
		System.out.println();

		// GB2312 中文码表 2个字节对应一个字符
		System.out.println(System.getProperty("file.encoding"));

		// 编码 看得懂编程看不懂
		byte[] bytes = "hello world".getBytes();
		for (byte b : bytes) {
			System.out.print(b + "  ");
		}
		System.out.println("------------");
		try {
			bytes = "hello world".getBytes("ISO-8859-1");
			bytes = "hello world".getBytes("UTF-16");
			bytes = "hello world".getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		for (byte b : bytes) {
			System.out.print(b + "  ");
		}
		
		System.out.println();
		String csn = Charset.defaultCharset().name();
		System.out.println("csn="+csn);
		//解码  把看不懂变成看得懂
		try {
//			String	str = new String(bytes,0,bytes.length,"utf-16");
			String	str = new String(bytes,0,bytes.length,"utf-8");
			System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
