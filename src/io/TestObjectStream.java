package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectStream {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		try {
			File file = new File("t.txt");
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ois = new ObjectInputStream(new FileInputStream(file));

			oos.writeInt(12345);
			oos.writeObject("Today");
			oos.writeObject(new Date());
			oos.writeObject(new Person("wwj", 25));

			int i = ois.readInt();
			String today = (String) ois.readObject();
			Date date = (Date) ois.readObject();
			Person person = (Person) ois.readObject();

			System.out.println(i + " " + today + " " + date);
			System.out.println(person.getName() + " " + person.getAge());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
