package test;

public class LocalInnerClass {

	private int count  = 0;
	
			
	/**
	 * @param name
	 * @return
	 */
	public Counter getCount(final String name) {
		class MyCount implements Counter {
			MyCount(){
				System.out.println("Hello MyCount");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		return new MyCount();
	}
	
	
	public static void main(String[] args) {
		LocalInnerClass innerClass=new LocalInnerClass();
		Counter count =innerClass.getCount("’≈æ≤");
		System.out.println(count.next());

	}

}
