package annotatonreflection;

public class TestClassLoader {

	public static void main(String[] args) {

		Class clazz = TestClassLoader.class;
		ClassLoader classLoader = clazz.getClassLoader();

		while (classLoader != null) {
			System.out.println(classLoader);
			classLoader = classLoader.getParent();
		}
		System.out.println("引导类加载器"+classLoader); //引导类加载器是null

//		AppClassLoader 系统的类加载器,也就是应用程序类加载器
//		数组类的 Class 对象不是由类加载器创建的,由JVM自动创建的
//		除了数组类都是ClassLoader加载的

		String[] strs = new String[1];
		strs[0] = new String();

		System.out.println(strs.getClass());
		System.out.println(strs.getClass().getClassLoader());
		System.out.println(strs[0].getClass().getClassLoader());

		int[] arr = new int[3];
		System.out.println(arr.getClass());
		System.out.println(arr.getClass().getClassLoader());

	}

}
