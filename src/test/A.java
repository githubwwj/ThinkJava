package test;

public class A {
	
	class B{
		 C c;
	}
	
	class C{
		
	}

	public static void main(String[] args) {
//		A.B b=new B();
		A a=new A();
		A.B b=a.new B();
	}
}
