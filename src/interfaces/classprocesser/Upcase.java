package interfaces.classprocesser;

public class Upcase extends Processor {

	//返回类型协变类型
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}

}
