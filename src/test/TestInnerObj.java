package test;

public class TestInnerObj {

	static TestInnerObj testInnerObj=new TestInnerObj() {
		
		public void add(int a,int b) {
			System.out.println(a+b);
		}
	};
	
	public void add(int a,int b) {
		System.out.println("add");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(TestInnerObj.testInnerObj);
	}

}
