package test;

import java.util.Arrays;
import java.util.List;

public class LearnCollection {

	
	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.add(6);
		
		for(Integer aa:list) {
			System.out.println(aa);
		}
	}

}
