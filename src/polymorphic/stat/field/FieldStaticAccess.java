package polymorphic.stat.field;

public class FieldStaticAccess {

	public static void main(String[] args) {
		
		Super sup=new Sub();
		
		System.out.println("sup.field="+sup.field
				+ "  sup.getField()="+sup.getField());
		//sup.field=1    sup.getField()=2
		
		System.out.println("sup.getStaticMethod()="+sup.getStaticMethod()
		+ "  sup.getDynamicMethod()="+sup.getDynamicMethod()
				);
		
		//Super getStaticMethod()    Sub getDynamicMethod()

	}

}
