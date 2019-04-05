package strings;

import static com.wwj.util.Print.*;

public class StringLearn {

	public static void main(String[] args) {

		String str = "abc";
		String str2 = "abc";
		print(str.charAt(0));

		char c = "abc".charAt(0); // "abc" 代表字符串对象
		print(c);

		// 放入5个字符到字符序列中
		char data[] = { 'a', 'b', 'c', 'd', 'e' };
		String str3 = new String(data);
		print("str3="+str3);

		String str4 = new String("abcde");
		print("str4="+str4);

		String str5 = str4.concat("hello");
		print("str5="+str5);
		int c1 = str5.codePointAt(0);
		print(c1);

		char c2 = (char) c1;
		print(c2);

		byte[] bArr1 = str.getBytes();
		for (int i = 0; i < bArr1.length; i++) {
			printnb(bArr1[i], " ");
		}
		System.out.println();

		System.out.println(str3.equals(str4));
		String str6 = "ABC";
		print("str6=" + str.equalsIgnoreCase(str6));
		print(str5.startsWith(str)); // 测试此字符串是否以指定的前缀开始。

		print(str5.indexOf('e'));

//		abcdehello
		print(str5.indexOf("bc")); // 返回指定子字符串在此字符串中第一次出现处的索引。

		print("unhappy".substring(2)); // happy

		print("unhappy".replace("un", "**")); // happy

		print(str.valueOf(10));
		print(str);

		print("ABCDE".toLowerCase());
		print("happy".toUpperCase());

		String[] str7 = "howdy,wow,good".split(",");
		for (String s : str7) {
			print(s);
		}

		for (int i = 0; i < 100; i++) {
			str2 = str2 + i; //abc0 2   abc01
		}
		print(str2);
		
	}

}
