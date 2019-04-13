package annotatonreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LearnClass {

	@SuppressWarnings("all")
	public static void main(String[] args) {

		try {

			Class<Person> clazz1 = (Class<Person>) Class.forName("annotatonreflection.Person");
			Class<Person> clazz2 = (Class<Person>) Class.forName("annotatonreflection.Person");

			Class clazz3 = Person.class;

			Person person = new Person();
			Class class4 = person.getClass();

			Class clazz5 = int.class;
			Class clazz6 = Integer.class;
			System.out.println("clazz5==clazz6=" + (clazz5 == clazz6));

			System.out.println("clazz1 == clazz2  =" + (clazz1 == clazz2));
			System.out.println("clazz3 == clazz2  =" + (clazz3 == clazz2));
			System.out.println("class4 == clazz1  =" + (class4 == clazz1));
			System.out.println(clazz1.hashCode() + "\t" + clazz2.hashCode());

			Person person2 = clazz1.newInstance();
			person2.setAge(25);
			person2.setName("wwj");
			System.out.println(person2.getName() + "\t" + person2.getAge());

			Constructor<Person>[] conArr = (Constructor<Person>[]) clazz1.getConstructors();
			for (Constructor<Person> c : conArr) {
				System.out.println(c);
			}

			Constructor<Person> constructor = clazz1.getConstructor(String.class, int.class);
			Person person3 = constructor.newInstance("xjy", 30);
			System.out.println(person3.getName() + "\t" + person3.getAge());

//			Field field=clazz1.getField("name"); //获取公共属性
			Field field = clazz1.getDeclaredField("name");
			field.setAccessible(true); // 关闭类型检查
			field.set(person3, "王麻子");
			System.out.println(field.get(person3) + "\tname=" + person3.getName());

			Field field2 = clazz1.getDeclaredField("age");
			field2.setAccessible(true);
			field2.set(person3, 30);
			System.out.println("name=" + person3.getName() + "\tage=" + person3.getAge());
			
			Method method=clazz1.getDeclaredMethod("getName",null);
			String name=(String) method.invoke(person2, null);
			System.out.println(name);
			
			Method setAge=clazz1.getDeclaredMethod("setAge", int.class);
			setAge.invoke(person2, 26);
			
			System.out.println(person2.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
