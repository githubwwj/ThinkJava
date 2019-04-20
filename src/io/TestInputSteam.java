package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TestInputSteam {

	public static void main(String[] args) {
		File srcFile = new File("a.txt"); // ÊäÈëÎÄ¼þ
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(srcFile);
			int l = inputStream.available();
			System.out.println(l);
			System.out.println(srcFile.length());

			int b = -1;
			while ((b = inputStream.read()) != -1) {
				System.out.print((char) b + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
