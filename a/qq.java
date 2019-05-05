package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
//		File srcFile = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\CopyFile.java"); 
//		File destFile = new File("ios.java");
//		copyFile(srcFile,destFile);

		File srcDir = new File("E:\\Java编程思想\\9接口");
		File destDir = new File("E:\\test");
		copyDir(srcDir, destDir);
	}

	private static void copyDir(File srcDir, File destDir) {
		
		if (!srcDir.exists()) {
			System.out.println("源文件不存在...!");
			return;
		}
		
		if (!destDir.exists()) {
			destDir=new File(destDir,srcDir.getName());
			destDir.mkdirs();
		}

		if (srcDir.isFile()) {
			File destFile = new File(destDir, srcDir.getName());
			copyFile(srcDir, destFile);
		} else {
			File[] files = srcDir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					// 拷贝文件
					File destFile = new File(destDir, f.getName());
					copyFile(f, destFile);
				} else {
					// 新目录
					File newDir = new File(destDir, f.getName());
					newDir.mkdirs();
					copyDir(f, newDir);
				}
			}

		}

	}

	/**
	 * // 1 选择数据源 磁盘的一个文件
	 * 
	 * @param srcFile  源文件
	 * @param destFile 目标文件
	 */
	public static void copyFile(File srcFile, File destFile) {

		if (!srcFile.exists()) {
			System.out.println("源文件不存在");
			return;
		}

		// 2选择输出流
		FileInputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(destFile);
			inputStream = new FileInputStream(srcFile);

			// 3 选择那种操作
			int len = -1;
			byte[] buff = new byte[1024 * 10];
			while ((len = inputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, len);
			}
			System.out.println("copy file successed!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 释放资源
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

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
