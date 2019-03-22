package polymorphic.stat.field;

public class Super {
	
	public int field =1;
	
	public static String getStaticMethod() {
		return "Super getStaticMethod()";
	}
	
	public String getDynamicMethod() {
		return "Super getDynamicMethod()";
	}
	
	public int getField() {
		return field;
	}

}
