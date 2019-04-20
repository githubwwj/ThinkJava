package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class TestByteArrayStream {

	public static void main(String[] args) {

		// 1 选择数据源 文件 数据库 内存 网络 服务器
		byte[] srcBuff = "hello I'm a good programer!\r是的!".getBytes();
		

		// 字节数组输出流为null
		byte[] destBuff = null; // 数据输出流

		// 2 选择流
		ByteArrayInputStream inputStream = new ByteArrayInputStream(srcBuff);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		// 3 选择操作
		int len = -1;
		int count = 0;
		byte[] srcReadBuff = new byte[10];
		while ((len = inputStream.read(srcReadBuff, 0, srcReadBuff.length)) != -1) {
			count++;
			outputStream.write(srcReadBuff, 0, len);
			System.out.println(count + " len=" + len);
		}
		
		try {
			System.out.println(outputStream.toString("GB2312"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
