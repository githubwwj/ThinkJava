package offtenuseclass;

import java.io.File;

public class GetAllFile {

	public static void main(String[] args) {

		File file = new File("E:\\Java编程思想");

		printFile(file, 1);
	}

	/**
	 * @param file  要打印的文件
	 * @param level 要打印的层级
	 */
	static void printFile(File file, int level) {
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}

		for (int i = 0; i < level; i++) {
			System.out.print("=");
		}
		
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			File[]  files=file.listFiles();
			for(File f:files) {
				printFile(f, level+1);
			}
		}
	}

}
