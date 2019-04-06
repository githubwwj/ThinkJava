package test;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArrTest {

	public static void main(String[] args) {
		int[][] arr = { { 2, 3 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr.length + "  " + arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}

		int[] arr2 = { 25, 20, 23, 24, 18, 21 };

		selectSort(arr2);

		printArr(arr2);
	}

	static void printArr(int arr[]) {
		for (int a : arr) {
			printnb(a, "\t");
		}
	}

	static void selectSort(int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
	}

}
