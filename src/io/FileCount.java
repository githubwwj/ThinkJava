package io;

import java.io.File;

public class FileCount {

	public static void main(String[] args) {
		String path = "E:\\Java编程思想\\9接口";
		File file = new File(path);
		printFileCont(file);

		System.out.println("文件数量=" + fileCount);
		System.out.println("文件夹数量=" + dirCount);

	}

	static int fileCount; // 文件数量
	static int dirCount; // 文件夹数量

	private static void printFileCont(File file) {
		if (file == null || !file.exists()) {
			return;
		}

		if (file.isDirectory()) {
			dirCount++;
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					fileCount++;
				} else {
					printFileCont(f);
				}
			}
		} else {
			fileCount++;
		}

	}

}
