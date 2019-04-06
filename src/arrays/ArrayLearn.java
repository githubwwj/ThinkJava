package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArrayLearn {

	public static void main(String[] args) {

		int[] arr = null; // 声明一个数组
		arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			printnb(arr[i] + "	"); // 通过索引 或者 下表访问数组中的元素
		}

		arr[0] = 100;
		arr[1] = (int) 102.8; // 数组中只能存放同意数据类型
		print(arr[1]);

		String[] strArr = new String[5];
		strArr[0] = "hello";
		strArr[1] = "java";

		print(strArr[0]);
		print(strArr[1]);
		print(strArr[2]);
		for (String str : strArr) {
			print(str);
		}
		
		int[] arr2= {10,20,30,40};
		int sum=0;
		for(int a:arr2) {
			sum+=a;
		}
		print(sum);
		
		printArr(arr2);

	}
	
	static void printArr(int arr[]) {
		for(int a:arr) {
			print(a);
		}
	}

}
