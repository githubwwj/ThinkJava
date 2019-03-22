package polymorphic.stat.field;

public class Sub extends Super {
	
	public int field = 2;
	
	public int getField() {
		return field;
	}
	
	public static String getStaticMethod() {
		return "Sub getStaticMethod()";
	}
	
	public String getDynamicMethod() {
		return "Sub getDynamicMethod()";
	}

}
