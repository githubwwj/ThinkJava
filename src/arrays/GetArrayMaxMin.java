package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class GetArrayMaxMin {

	public static void main(String[] args) {

		int[] arr = { 25, 20, 26, 24, 18, 21 ,-20,-30,180};

		printArrayMaxMin(arr);

	}

	private static void printArrayMaxMin(int[] arr) {

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		
		print("max="+max);
		print("min="+min);

	}

}
