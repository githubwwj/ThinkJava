package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	static String fileName = "D:\\办公软件\\08_IO流技术\\169_IO_File_文件夹创建_遍历.mp4";
	static final int BUFFER_SIZE = 1024 * 2;

	public static void main(String[] args) {
		try {
			fun1();
			fun3();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fun1() throws IOException {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream("IO_File_API.mp4");
		int len = 0;
		byte[] bytes = new byte[BUFFER_SIZE];
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
			fos.flush();
		}
		fis.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	// 1024字节数组复制并用了缓冲流 耗时7毫秒
	public static void fun3() throws IOException {
		long startTime = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO_File_API1.mp4"));
		int len = 0;
		byte[] bytes = new byte[BUFFER_SIZE];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
			bos.flush();
		}
		bos.close();
		bis.close();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
