package strings;

import java.util.ArrayList;

import com.wwj.util.Print;

public class StringBuilderLearn {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("abcdef");
		Print.print(stringBuilder.length());
		
		stringBuilder.append(true);
		stringBuilder.append('q');
		stringBuilder.append(10.8f);
		stringBuilder.append(new Human("ÕÅÂé×Ó"));
		stringBuilder.append(new StringBuilder("hello java"));
		
		Print.print(stringBuilder.toString());
		
		stringBuilder.deleteCharAt(6);
		
		Print.print(stringBuilder.toString());
		
		stringBuilder.delete(6, 9);
		Print.print(stringBuilder.toString());
		
		stringBuilder.insert(3, "hhs");
		Print.print(stringBuilder.toString());
		
		int result=stringBuilder.indexOf("sdess");
		Print.print(result);
		
	}

}
