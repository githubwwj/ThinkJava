package interfaces.interfaceprocessor;

import java.util.Arrays;

public class Splitter extends StringProcessor {

	// 返回类型协变类型
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}

}
