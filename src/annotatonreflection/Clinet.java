package annotatonreflection;

import java.lang.reflect.Field;

public class Clinet {

	public static void main(String[] args) {

		// select * from person where age =25 and name='wwj';
		try {
			Class<Person> clazz = (Class<Person>) Class.forName("annotatonreflection.Person");

//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());

			boolean b = clazz.isAnnotationPresent(Table.class);
			System.out.println(b);
			if (!b) {
				return;
			}

			StringBuilder stringBuilder = new StringBuilder();

			Table table = clazz.getAnnotation(Table.class);
			System.out.println(table.value());
			stringBuilder.append("select * from " + table.value() + " where ");

//			Field[] fields = clazz.getDeclaredFields();
//			for (Field f : fields) {
//				
//			}
			Field field = clazz.getDeclaredField("name");
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				stringBuilder.append(column.name() + "=" + column.res());
			}

			stringBuilder.append(" and ");
			
			field = clazz.getDeclaredField("age");
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				System.out.println(column.name());
				stringBuilder.append(column.name() + "=" + column.res());
			}
			System.out.println(stringBuilder.toString());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		

	}

}
