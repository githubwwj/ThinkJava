package interfaces.interfaceprocessor;

public class Upcase extends StringProcessor {

	//返回类型协变类型
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}

}
