package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArrayTwo {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 4, 5, 6, 7 }, { 8, 9, 10 } };

		print(arr.length);

		print("arr[0][0]=" + arr[0][0]); // 1
		print("arr[1][3]=" + arr[1][3]); // 7
		print("arr[2][1】=" + arr[2][1]); // 9

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				printnb(String.format("第%d行第%d列%d\t", i + 1, j + 1, arr[i][j]));
			}
			print("");
		}

		print("---------------------------");
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[4];
		arr2[2] = new int[3];
		

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[i][j];
			}
		}

//		arr2[0][0] = 1;
//		arr2[0][1] = 2;
//		
//		arr2[1][0] =4;
//		arr2[1][1] =5;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				printnb(String.format("第%d行第%d列%d\t", i + 1, j + 1, arr2[i][j]));
			}
			print("");
		}
		
	}

}
