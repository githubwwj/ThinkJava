package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutStream {

	public static void main(String[] args) {

		// 1 选择数据源
		File file = new File("ios.java");

		// 2 选择流
		DataOutputStream dataOutputStream = null;
		DataInputStream dataInputStream = null;
		try {

			dataOutputStream = new DataOutputStream(new FileOutputStream(file));
			dataInputStream=new DataInputStream(new FileInputStream(file));
			
			// 3 选择操作
			dataOutputStream.writeInt(10);
			dataOutputStream.writeByte(127);
			dataOutputStream.writeUTF("今天下暴雨了");
			
			
			int q=dataInputStream.readInt();
			System.out.println(q);
			
			int b=dataInputStream.readByte();
			System.out.println(b);
			
			String str=dataInputStream.readUTF();
			System.out.println(str);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != dataOutputStream) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
