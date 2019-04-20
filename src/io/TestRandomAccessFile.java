package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

	public static void main(String[] args) {

		File file = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\CopyFile.java");

		// 1 文件大小
		long length = file.length();

		// 2 每次读取的字节
		int blockSize = 1024;

		// 3 读取几次
		int block = (int) Math.ceil(length * 1.0 / blockSize);

		int beginPos = 0; // 每次从哪读取
		int actionSize = 0; // 每次读取的实际大小

		for (int i = 0; i < block; i++) {
			beginPos = i * blockSize;
			if (i + 1 == block) {
				actionSize = (int) length;
			} else {
				actionSize = blockSize;
				length -= actionSize;
			}

//			System.out.println("----->beginPos=" + beginPos + "---->actionSize=" + actionSize);
			readFile(i,file, beginPos, actionSize);

		}

	}

	private static void readFile(int i, File file, int beginPos, int actionSize) {

		RandomAccessFile randomAccessFile = null;
		RandomAccessFile writeFile=null;
		try {
			randomAccessFile = new RandomAccessFile(file, "r");
			writeFile=new RandomAccessFile("i"+i, "rw");
			
			byte[] buff = new byte[1024];

			randomAccessFile.seek(beginPos);

			int len = -1;
			while ((len = randomAccessFile.read(buff)) != -1) {
				if (actionSize > len) {
					String str = new String(buff, 0, len, "utf-8");
					writeFile.write(buff,0,len);
					System.out.print(str);
					actionSize -= len;
				} else {
					writeFile.write(buff,0,actionSize);
					String str = new String(buff, 0, actionSize, "utf-8");
					System.out.print(str);
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 释放资源
			if (randomAccessFile != null) {
				try {
					randomAccessFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writeFile != null) {
				try {
					randomAccessFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
