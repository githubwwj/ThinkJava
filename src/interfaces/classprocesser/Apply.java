package interfaces.classprocesser;

public class Apply {

	//策略设计模式 ==>方法中传递的参数对象不同行为不同
	public static void process(Processor p, Object input) {
		System.out.println(p.process(input));
	}

	public static void main(String[] args) {

		String input= "A E i o u";
		process(new Upcase(), input);
		process(new Downcase(), input);
		process(new Splitter(), input);
		
	}
	//A E I O U
//	a e i o u
//	[A, E, i, o, u]


}
