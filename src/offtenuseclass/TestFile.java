package offtenuseclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File file = new File("E:\\Java编程思想\\15常用类\\aa.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("File是否存在：" + file.exists());
		System.out.println("File是否是目录：" + file.isDirectory());
		System.out.println("File是否是文件：" + file.isFile());
		System.out.println("File最后修改时间：" + new Date(file.lastModified()));
		System.out.println("File的大小：" + file.length());
		System.out.println("File的文件名：" + file.getName());
		System.out.println("File的目录路径：" + file.getPath());
		
//		File f2 = new File("d:/电影/华语/大陆");
//        boolean flag = f2.mkdirs(); //目录结构中有一个不存在，则不会创建整个目录树
//        System.out.println(flag);//创建失败
		System.out.println("File能读："+file.canRead());
		System.out.println("File能写："+file.canWrite());
		System.out.println("File的父目录："+file.getParentFile());
		File[] files=file.getParentFile().listFiles();
		for(File f:files) {
			System.out.println(f);
		}

	}

}
