package annotatonreflection;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 自定义网络类加载器
 * @author wwj
 *
 */
public class NetworkClassLoader extends ClassLoader {

	private String filePath;
	private String fileExtention = ".class";

	public NetworkClassLoader(String filePath) {
		this.filePath = filePath;
	}

	public Class findClass(String name) {
		System.out.println("findClass name=" + name);
		byte[] bArr = null;
		try {
			bArr = loadClassData(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defineClass(name, bArr, 0, bArr.length);
	}

	private byte[] loadClassData(String name) throws IOException {
//    	name = "annotatonreflection.NetworkClassLoader";
		name = name.replace(".", "/");
		name += fileExtention;
		File file = new File(filePath, name);
		FileInputStream fileInputStream = new FileInputStream(file);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		int len = -1;
		while ((len = fileInputStream.read()) != -1) {
			byteArrayOutputStream.write(len);
		}
		return byteArrayOutputStream.toByteArray();
	}

	public static void main(String[] args) {
		NetworkClassLoader classLoader = new NetworkClassLoader("C:\\Users\\wwj\\Desktop");
		try {
			Class clazz = classLoader.loadClass("annotatonreflection.Person");
			Object obj = clazz.newInstance();
			System.out.println(obj);
//			System.out.println(clazz.getClassLoader());
			ClassLoader classLoader2 = clazz.getClassLoader();
			while (classLoader2 != null) {
				System.out.println(classLoader2);
				classLoader2 = classLoader2.getParent();
			}
			System.out.println("引导类加载器"+classLoader2); //引导类加载器是null
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
