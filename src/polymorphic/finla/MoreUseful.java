package polymorphic.finla;

public class MoreUseful extends Useful {

	public void f() {
		System.out.println("MoreUseful f()");
	}

	public void g() {
		System.out.println("MoreUseful g()");
	}
	
	public void u() {
		System.out.println("MoreUseful u()");
	}
	
	public void v() {
		System.out.println("MoreUseful v()");
	}
	
	public void w() {
		System.out.println("MoreUseful w()");
	}
	
	public static void main(String[] args) {
		Useful useful=new MoreUseful();
		useful.f();
		
		((MoreUseful) useful).v();
		((MoreUseful)useful).w();
		
	}

}
