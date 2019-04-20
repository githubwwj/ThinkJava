package io;

import java.io.File;

public class TestSpileFile {

	public static void main(String[] args) {
		File srcFile=new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\CopyFile.java");
		File destFile=new File("E:\\ThinkInJava\\ThinkJava\\a");
		SplitFile splitFile=new SplitFile(srcFile, destFile);
		splitFile.start();
		
		
		splitFile.merge();

	}

}
