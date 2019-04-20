package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestBufferedWrite {

	public static void main(String[] args) {
		File srcFile = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\PrintASCII.java");
		File destFile = new File("a.java");

		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(srcFile)));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFile)));
			
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			
			System.out.println("fiel write ok!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4ÊÍ·Å×ÊÔ´
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (null != bufferedWriter) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
