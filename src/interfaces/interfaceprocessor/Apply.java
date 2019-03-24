package interfaces.interfaceprocessor;

public class Apply {

	// 策略设计模式 ==>方法中传递的参数对象不同行为不同
	public static void process(Processor p, Object input) {
		System.out.println("Using  processor " + p.getProcessorName());
		System.out.println(p.process(input));
	}

	public static void main(String[] args) {

		String input = "A E i o u";
		process(new Upcase(), input);
		process(new Downcase(), input);
		process(new Splitter(), input);
	}
//	Using  processor Upcase
//	A E I O U
//	Using  processor Downcase
//	a e i o u
//	Using  processor Splitter
//	[A, E, i, o, u]


}
