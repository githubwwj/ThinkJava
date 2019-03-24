package interfaces.interfaceprocessor;

public class Downcase extends StringProcessor {
	
	// 返回类型协变类型
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}

}
