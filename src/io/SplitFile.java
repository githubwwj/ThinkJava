package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class SplitFile {

	// 源文件
	private File srcFile;
	// 目标文件
	private File destFile;

	// 1 文件大小
	long length;
	// 2 每次读取的字节数
	int blockSize = 1024;
	// 3 读取几次
	int block;

	private ArrayList<FileRecord> records = new ArrayList<FileRecord>();

	SplitFile(File srcFile, File destFile) {
		this.srcFile = srcFile;
		this.destFile = destFile;
		init();
	}

	private void init() {

		if (!destFile.exists()) {
			destFile.mkdirs();
		}

		// 1 文件大小
		length = srcFile.length();

		// 3 读取几次
		block = (int) Math.ceil(length * 1.0 / blockSize);

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

			FileRecord fileRecord = new FileRecord(beginPos, actionSize);
			records.add(fileRecord);
//			System.out.println("----->beginPos=" + beginPos + "---->actionSize=" + actionSize);
		}

	}

	public void start() {
		for (int i = 0; i < records.size(); i++) {
			readFile(i, records.get(i).beginPos, records.get(i).actionSize);
		}
	}

	public void merge() {
		for (int i = 0; i < records.size(); i++) {
			mergeFile(i);
		}
	}

	private void mergeFile(int i) {
		if (!srcFile.exists()) {
			System.out.println("源文件不存在");
			return;
		}

		// 2选择输出流
		FileInputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			File destFile=new File(this.destFile,"qq.java");
			outputStream = new FileOutputStream(destFile,true);
			File srcFile=new File(this.destFile,"i"+i);
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

	private static class FileRecord {
		int beginPos = 0; // 每次从哪读取
		int actionSize = 0; // 每次读取的实际大小

		public FileRecord(int beginPos, int actionSize) {
			super();
			this.beginPos = beginPos;
			this.actionSize = actionSize;
		}
	}

	private void readFile(int i, int beginPos, int actionSize) {

		RandomAccessFile randomAccessFile = null;
		RandomAccessFile writeFile = null;
		try {
			randomAccessFile = new RandomAccessFile(srcFile, "r");
			File destFile = new File(this.destFile, "i" + i);
			writeFile = new RandomAccessFile(destFile, "rw");

			byte[] buff = new byte[1024];

			randomAccessFile.seek(beginPos);

			int len = -1;
			while ((len = randomAccessFile.read(buff)) != -1) {
				if (actionSize > len) {
					writeFile.write(buff, 0, len);
//					String str = new String(buff, 0, len, "utf-8");
//					System.out.print(str);
					actionSize -= len;
				} else {
					writeFile.write(buff, 0, actionSize);
//					String str = new String(buff, 0, actionSize, "utf-8");
//					System.out.print(str);
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
