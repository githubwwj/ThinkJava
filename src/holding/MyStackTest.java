package holding;

public class MyStackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Hello World");
		stack.push("Hello JAVA");
		stack.push("Hello CHANG_CHENG");
		stack.push("Hello ShenZhen");
		stack.push("Hello HangZhou");

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
