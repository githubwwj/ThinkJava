package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestOutputStreamWrite {

	public static void main(String[] args) {

		// 1 选择数据源
		File destFile = new File("a.java");
		File srcFile = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\Person.java");

		OutputStreamWriter outWriter = null;
		InputStreamReader reader = null;

		// 2选择流
		try {
			System.out.println(destFile.getAbsolutePath());
			
			outWriter = new OutputStreamWriter(new FileOutputStream(destFile));
			reader = new InputStreamReader(new FileInputStream(srcFile));
			//少说废话,多写代码

			// 3 选择操作
			char[] cbuf = new char[1024];
			int len = -1;
			while ((len = reader.read(cbuf)) != -1) {
				outWriter.write(cbuf, 0, len);
				System.out.println("len="+len);
			}

			System.out.println("file write ok!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4释放资源
			if (null != outWriter) {
				try {
					outWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
