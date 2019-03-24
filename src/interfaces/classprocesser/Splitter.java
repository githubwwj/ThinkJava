package interfaces.classprocesser;

import java.util.Arrays;

public class Splitter extends Processor {

	// 返回类型协变类型
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}

}
