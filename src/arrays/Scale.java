package arrays;

public class Scale {
	

	static char[] table= {
			'0','1','2','3',
			'4','5','6','7',
			'8','9','A','B',
			'C','D','E','F'
	};

	public static void main(String[] args) {
		int num = 100;
		
		toBinary(num);
		toOct(num);
		toHex(num);
	}
	
	private static void toBinary(int num) {
		toScale(num,1,1);
	}
	
	private static void toOct(int num) {
		toScale(num,7,3);
	}

	private static void toHex(int num) {
		toScale(num,15,4);
	}
	
	/**
	 * @param num  要转换的数字
	 * @param base  那种进制    16进制  15            八进制  7             二进制  1
	 * @param offset  左移几位           16进制 左移4   8进制 左移3位     二进制 左移 1位
	 */
	public static void toScale(int num,int base, int offset) {
		//int 32位 4个字节     十六进制 代表一个字节,4位
		char[] arr = new char[32];
		int pos = arr.length;

		while (num != 0) {
			int temp = num & base;
			arr[--pos] = table[temp];
			num = num >>> offset;
		}

		for (int i = pos; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

//		int temp = num & 15; // 取出里面的值
//		System.out.println(temp);
//
//		num = num >>> 4;
//		temp = num & 15;
//		System.out.println(temp);
//
//		num = num >>> 4;
//		temp = num & 15;
//		System.out.println(temp);

	}

}
