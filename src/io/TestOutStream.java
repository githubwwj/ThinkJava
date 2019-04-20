package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutStream {

	public static void main(String[] args) {

		// 1 选择数据源 磁盘的一个文件
		File file = new File("E:\\ThinkInJava\\ThinkJava\\a.txt");

		// 2选择输出流
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);

			// 3 选择那种操作
			outputStream.write('e');
			outputStream.write('l');
			outputStream.write('\r');
			
			byte[] buff= new String("I'm a good program! 是的").getBytes();
			outputStream.write(buff);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 释放资源
			if (null != outputStream) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
