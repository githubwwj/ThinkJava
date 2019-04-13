package annotatonreflection;

import java.lang.reflect.Method;

public class ReflectionSpeed {

	static long LOOP = 2000000000L;

	public static void main(String[] args) throws Exception {
		test1();
//		test2();
//		test3();
	}

	static void test1() {
		Person person = new Person();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < LOOP; i++) {
			person.getName();
		}
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
	}

	@SuppressWarnings("all")
	static void test2() throws Exception {  //11 
		Person person = new Person();
		Class<Person> clazz = (Class<Person>) person.getClass();
		long startTime = System.currentTimeMillis();
		Method method = clazz.getDeclaredMethod("getName");

		for (int i = 0; i < LOOP; i++) {
			method.invoke(person);
		}

		long endTime = System.currentTimeMillis();

		long duration = (endTime - startTime);
		System.out.println(duration);

	}

	@SuppressWarnings("all")
	static void test3() throws Exception { //7
		Person person = new Person();
		Class<Person> clazz = (Class<Person>) person.getClass();
		long startTime = System.currentTimeMillis();
		Method method = clazz.getDeclaredMethod("getName");
		method.setAccessible(true); //禁止类型安全检查
		for (int i = 0; i < LOOP; i++) {
			method.invoke(person);
		}
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);

	}
}
