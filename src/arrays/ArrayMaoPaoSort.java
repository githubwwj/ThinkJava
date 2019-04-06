package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArrayMaoPaoSort {

	public static void main(String[] args) {
		int[] arr = { 25, 20, 26, 24, 18, 21, -3, 30, 180, -999, 1230 };

		maopaoSort(arr);
		printArr(arr);

		maopaoSort_2(arr);
		printArr(arr);
	}

	static void maopaoSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	static void maopaoSort_2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			printnb(arr[i] + "\t");
		}
		print("");
	}

}
